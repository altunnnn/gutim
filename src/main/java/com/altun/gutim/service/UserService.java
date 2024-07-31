package com.altun.gutim.service;

import com.altun.gutim.dto.request.AuthRequest;
import com.altun.gutim.dto.request.UserRequestDto;
import com.altun.gutim.dto.response.UserResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {


    Page<UserResponseDto> getAllUsers(Pageable pageable);

    UserResponseDto updateUser(Long id, UserRequestDto userRequestDto);

    void deleteClass(Long id);

    UserResponseDto registerUser(AuthRequest authRequest);
}
