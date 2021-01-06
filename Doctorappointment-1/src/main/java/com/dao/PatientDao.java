package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Patient;

public interface PatientDao extends JpaRepository<Patient, Integer> {

}
