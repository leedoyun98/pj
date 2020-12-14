package com.example.demo.sym.web;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.sym.service.TeacherService;
import com.example.demo.sym.service.model.TeacherDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TeacherController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired TeacherService service;
    @PostMapping("/teachers")
    public Map<?,?> register(@RequestBody TeacherDto teacher){
        var map = new HashMap<>();
        logger.info("등록하려는 선생님 정보: "+teacher.toString());
        map.put("message", (service.register(teacher) == 1) ? "SUCCESS":"FAILURE");
        return map;
    }
    
}
