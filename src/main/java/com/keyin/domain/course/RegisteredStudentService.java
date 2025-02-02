package com.keyin.domain.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisteredStudentService {
  @Autowired
  private RegisteredStudentRepository registeredStudentRepository;

  public RegisteredStudent findByEmailAddress(String emailAddress) {
    return registeredStudentRepository.findByEmailAddress(emailAddress);
  }

  public RegisteredStudent createRegisteredStudent(RegisteredStudent newRegisteredStudent) {
    return registeredStudentRepository.save(newRegisteredStudent);
  }
}
