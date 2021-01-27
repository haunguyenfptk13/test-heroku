package com.api.lecturerscheduling.mapper;

import com.api.lecturerscheduling.dto.CourseUserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseUserMapper {
    /**
     * Select course user information
     * @param user_id
     * @return CourseUserDTO
     */
    @Select("SELECT " +
            "   id AS courseUserId, " +
            "   user_id AS userId, " +
            "   course_id AS courseId " +
            "FROM " +
            "   public.course_user " +
            "WHERE " +
            "   id = #{user_id}")
    List<CourseUserDTO> courseUserInfo(@Param("user_id") String user_id);
}
