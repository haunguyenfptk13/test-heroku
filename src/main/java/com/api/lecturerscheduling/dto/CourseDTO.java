package com.api.lecturerscheduling.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO implements Serializable {
    private String courseId;
    private String semesterId;
    private String majorId;
    private String subjectId;
    private String statusId;
}
