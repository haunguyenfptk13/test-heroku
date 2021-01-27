package com.api.lecturerscheduling.service.impl;

import com.api.lecturerscheduling.dto.CourseUserDTO;
import com.api.lecturerscheduling.mapper.CourseUserMapper;
import com.api.lecturerscheduling.service.CourseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseUserServiceImpl implements CourseUserService {

    @Autowired(required = false)
    private CourseUserMapper userMapper;

    @Override
    public List<CourseUserDTO> getAllCourseUser(String userId) {
        return userMapper.courseUserInfo(userId);
    }

}
