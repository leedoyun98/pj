package com.example.demo.uss.serivce.model;

import org.springframework.stereotype.Component;

import lombok.Data;


@Component @Data
public class StudentDto {
   private String stuNum,userid,password, name, ssn, regdate, subject,profileImage ;
  
}
