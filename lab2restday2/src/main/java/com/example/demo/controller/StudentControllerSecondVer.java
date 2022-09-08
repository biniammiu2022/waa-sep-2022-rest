package com.example.demo.controller;

import com.example.demo.dto.CourseDto;
import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v2/students")
public class StudentControllerSecondVer {
    private final StudentService studentService;
    @GetMapping("/{major}")
    public List<StudentDto> getStudentsByMajor(@PathVariable String major){
        return studentService.getStudentsByMajor(major);
    }

    @GetMapping("/{id}/courses")
    public List<CourseDto> getCoursesByStudentId(@PathVariable int id){
        return studentService.getCoursesByStudentId(id);
    }

}
