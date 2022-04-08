package com.ggoreb.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Hospital {
  @Id @GeneratedValue
  Integer id;
  String sido;
  String name;
  Integer medical;
  Integer room;
  String tel;
  String address;
}
