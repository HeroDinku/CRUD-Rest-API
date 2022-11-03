package com.dinku.app.rest.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "Asmamaw")
public class User {

  @Id
  @GeneratedValue( strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "firstName")
  private String firstName;

  @Column(name = "lastName")
  private String lastName;

  @Column(name = "email")
  private String email;

  @Column(name = "profession")
  private String profession;

  @Column(name = "age")
  private int age;

  @Column(name = "address")
  private String address;


}
