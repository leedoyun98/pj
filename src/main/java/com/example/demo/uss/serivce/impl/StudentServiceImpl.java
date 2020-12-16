package com.example.demo.uss.serivce.impl;

import java.util.List;

import com.example.demo.cmm.mpr.StudentMapper;
import com.example.demo.sym.service.model.TeacherDto;
import com.example.demo.uss.serivce.StudentService;
import com.example.demo.uss.serivce.model.StudentDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper mapper;

    @Override
    public int register(StudentDto student) {
        return mapper.insert(student);
    }

    @Override
    public StudentDto login(StudentDto student) {
        return mapper.login(student);
    }

    @Override
    public StudentDto detail(String userid) {
        return mapper.selectById(userid);
    }

    @Override
    public List<?> list() {
        return mapper.selectAll();
    }

    @Override
    public int update(StudentDto student) {
        return mapper.update(student);
    }

    @Override
    public int delete(StudentDto student) {
        return mapper.delete(student);
    }

    

   

    

 
    
}
