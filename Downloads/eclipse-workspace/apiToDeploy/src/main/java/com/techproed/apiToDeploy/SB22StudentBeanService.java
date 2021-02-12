package com.techproed.apiToDeploy;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class SB22StudentBeanService {
	
	private static SB21StudentBeanRepository studentRepository;
	@Autowired
	public SB22StudentBeanService(SB21StudentBeanRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	//For GET Request for all data
	public static List<SB20StudentBean> getStudents(){
		return studentRepository.findAll();
	}
	
	//For GET Request by id
	public static Optional<SB20StudentBean> getStudentById(Long studentId) {
		return studentRepository.findById(studentId);
	}
	
	//For POST Requests
	public static void addNewStudent(SB20StudentBean studentBean) {
		
		Optional<SB20StudentBean> studentEmailOptional = studentRepository.findSB20StudentBeanByEmail(studentBean.getEmail());
		if(studentEmailOptional.isPresent()) {
			throw new IllegalStateException("Email is taken, try with another email...");
		}
		
		Optional<SB20StudentBean> studentIdOptional = studentRepository.findSB20StudentBeanById(studentBean.getId());
		if(studentIdOptional.isPresent()) {
			throw new IllegalStateException("Id exists, id must be unique...");
		}
		
		studentRepository.save(studentBean);
		
	}
	
	//For DELETE Requests
	public static String deleteStudentById(Long studentId) {
		
		//1.Way to check if the record exist by using id
		boolean isExist = studentRepository.existsById(studentId);
		if(!isExist) {
			throw new IllegalStateException(studentId + " does not exist. So it cannot be deleted...");
		}
		
		studentRepository.deleteById(studentId);
		
		return "Student whose id is " + studentId + " deleted successfully!..."; 
		
	}
	
	//For PUT Requests
	@Transactional
	public static SB20StudentBean updateStudent(Long studentId, @RequestBody SB20StudentBean newStudent) {
		
		//2.Way to check if the record exist by using id
		SB20StudentBean existingStudent = studentRepository.findById(studentId).orElseThrow(()->new IllegalStateException(studentId + " does not exist..."));
		
		//To update name
		String existingName = existingStudent.getName();
		if(newStudent.getName()==null) {
			existingStudent.setName(null);
		}else if(existingStudent.getName()==null) {
			existingStudent.setName(newStudent.getName());
		}else if(!existingName.equals(newStudent.getName())) {
			existingStudent.setName(newStudent.getName());
		}
		
		//To update email
		String existingEmail = existingStudent.getEmail();

		if(newStudent.getEmail()==null) {
			existingStudent.setEmail(null);
		}else if(existingStudent.getEmail()==null) {
			existingStudent.setEmail(newStudent.getEmail());
		}else if(!existingEmail.equals(newStudent.getEmail())) {
			existingStudent.setEmail(newStudent.getEmail());
		}else {
			throw new IllegalStateException("Email must be unique...");
		}
		
		//To update Dob
		LocalDate existingDob = existingStudent.getDob();
		if(newStudent.getDob()==null) {
			existingStudent.setDob(null);
		}else if(existingStudent.getDob()==null) {
			existingStudent.setDob(newStudent.getDob());
		}else if(!existingDob.equals(newStudent.getDob())) {
			existingStudent.setDob(newStudent.getDob());
		}
		
		return studentRepository.save(existingStudent);

	}
	
	//For PATCH Requests
	@Transactional
	public static SB20StudentBean updateStudentPartially(Long studentId, @RequestBody SB20StudentBean newStudent) {
		
		//2.Way to check if the record exist by using id
		SB20StudentBean existingStudent = studentRepository.findById(studentId).orElseThrow(()->new IllegalStateException(studentId + " does not exist..."));
		
		//To update name
		if(newStudent.getName()!=null) {
			existingStudent.setName(newStudent.getName());
		}
		
		//To update email
		Optional<SB20StudentBean> studentEmailOptional = studentRepository.findSB20StudentBeanByEmail(newStudent.getEmail());
		if(studentEmailOptional.isPresent()) {
			throw new IllegalStateException("Email is taken, try with another email...");
		}
		if(newStudent.getEmail()!=null) {
			existingStudent.setEmail(newStudent.getEmail());
		}
		
		//To update Dob
		if(newStudent.getDob()!=null) {
			existingStudent.setDob(newStudent.getDob());
		}
		
		
		return studentRepository.save(existingStudent);

	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
