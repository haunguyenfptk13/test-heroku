package com.api.lecturerscheduling.controller;

import com.api.lecturerscheduling.dto.CourseUserDTO;
import com.api.lecturerscheduling.dto.UserDTO;
import com.api.lecturerscheduling.dto.UserLoginDTO;
import com.api.lecturerscheduling.service.CourseUserService;
import com.api.lecturerscheduling.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {

//    private final UserService userService;
//    private final CourseUserService courseUserService;

//    public UserController(UserService userService, CourseUserService courseUserService) {
//        this.userService = userService;
//        this.courseUserService = courseUserService;
//    }

//    @PostMapping("/login")
//    public UserLoginDTO login(@RequestBody UserDTO dto) {
//        UserDTO userDTO = userService.login(dto);
//        List<CourseUserDTO> courseUserDTOList = courseUserService.getAllCourseUser(dto.getUsername());
////        Optional.ofNullable(courseUserDTOList)
////                .orElse(Collections.emptyList())
////                .stream()
////                .filter(Objects::nonNull)
////                .map(item -> {
////
////                })


//        UserLoginDTO userLoginDTO = new UserLoginDTO();
//        userLoginDTO.setUserDTO(userDTO);
//        userLoginDTO.setCourseUserDTOList(courseUserDTOList);
//        return userLoginDTO;
//    }

    @GetMapping("/")
    public String login(){
        return "login success";
    }

}
