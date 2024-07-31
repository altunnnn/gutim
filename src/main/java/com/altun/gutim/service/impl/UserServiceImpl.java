package com.altun.gutim.service.impl;

import com.altun.gutim.dto.request.AuthRequest;
import com.altun.gutim.dto.request.ClassRequestDto;
import com.altun.gutim.dto.request.UserRequestDto;
import com.altun.gutim.dto.response.ClassResponseDto;
import com.altun.gutim.dto.response.UserResponseDto;
import com.altun.gutim.entity.Class;
import com.altun.gutim.entity.User;
import com.altun.gutim.mapper.UserMapper;
import com.altun.gutim.repository.UserRepository;
import com.altun.gutim.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public UserResponseDto registerUser(AuthRequest authRequest){

        if (userRepository.findByEmail(authRequest.getEmail()).isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User with this email already exists");
        }

        User user = userMapper.toEntity(authRequest);

        user.setPassword(passwordEncoder.encode(authRequest.getPassword()));
        userRepository.save(user);
        return userMapper.toDto(user);
    }
    @Override
    public Page<UserResponseDto> getAllUsers(Pageable pageable){
        return userRepository.findAllBy(pageable).map(userMapper::toDto);
    }

    @Transactional
    @Override
    public UserResponseDto updateUser(Long id, UserRequestDto userRequestDto){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "There is no class with this id " + id));
        userMapper.updateClassFromDto(userRequestDto,user);
        return userMapper.toDto(user);
    }
    @Override
    public void deleteClass(Long id){
        userRepository.deleteById(id);
    }

}
