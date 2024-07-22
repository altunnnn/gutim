package com.altun.gutim.service.impl;

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
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public UserResponseDto create(UserRequestDto userRequestDto){
        User user = userMapper.toEntity(userRequestDto);
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
