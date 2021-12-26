package com.example.ec.repository;

import com.example.ec.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, String> {
}
