package com.api.lecturerscheduling.service;

import com.api.lecturerscheduling.dto.UserDTO;

public interface UserService {
    UserDTO login(UserDTO dto);
}
