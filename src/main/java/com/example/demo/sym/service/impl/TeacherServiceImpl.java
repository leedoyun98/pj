package com.example.demo.sym.service.impl;

import java.util.List;

import com.example.demo.cmm.mpr.TeacherMapper;
import com.example.demo.sym.service.TeacherService;
import com.example.demo.sym.service.model.TeacherDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teachermpr;

    @Override
    public int register(TeacherDto teacher) {
        return teachermpr.insert(teacher);
    }

    @Override
    public List<?> list() {
        return teachermpr.selectAll();
    }
    
}
