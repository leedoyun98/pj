package com.example.demo.uss.serivce.model;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component @Data
public class StudentDto {
   private String stuNum,userid,password, name, ssn, regdate;
  
}
