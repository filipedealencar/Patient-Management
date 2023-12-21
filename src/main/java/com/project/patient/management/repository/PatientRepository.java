package com.project.patient.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.patient.management.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
	 List<Patient> findByNameStartingWithIgnoreCase(String firstName);
}