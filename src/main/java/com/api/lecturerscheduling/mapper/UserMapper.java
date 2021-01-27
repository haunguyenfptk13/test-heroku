package com.api.lecturerscheduling.mapper;

import com.api.lecturerscheduling.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    /**
     * Select user information
     * @param user_id
     * @param password
     * @return UserDTO
     */
    @Select("SELECT " +
            "   id AS username, " +
            "   password, " +
            "   role_id AS roleId, " +
            "   status_id AS statusId, " +
            "   full_name AS fullName, " +
            "   point " +
            "FROM " +
            "   public.user " +
            "WHERE " +
            "   id = #{user_id} and password = #{password} and status_id = '1'")
    UserDTO loginUser(@Param("user_id") String user_id,
                      @Param("password") String password);
}
