package com.example.demo.uss.serivce;





import java.util.List;
import java.util.Map;

import com.example.demo.uss.serivce.model.StudentDto;

import org.springframework.stereotype.Component;
@Component
public interface StudentService {

    public int register(StudentDto student);

	public StudentDto login(StudentDto student);

	public StudentDto detail(String userid);

	public List<?> list();

	public int update(StudentDto student);

	public int delete(StudentDto student);

	

	

	

    
}
