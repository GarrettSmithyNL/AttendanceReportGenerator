package com.keyin.domain.course;

import jakarta.persistence.*;

@Entity
public class RegisteredStudent {
  @Id
  @SequenceGenerator(name = "registered_student_sequence", sequenceName = "registered_student_sequence", allocationSize = 1, initialValue=1)
  @GeneratedValue(generator = "registered_student_sequence")
  private long id;

  private String name;
  private String emailAddress;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
}
