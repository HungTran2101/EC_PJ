package com.example.ec.controller;

import com.example.ec.model.Staff;
import com.example.ec.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
@CrossOrigin
public class StaffController {

    @Autowired
    private StaffRepository staffRepository;

    @PostMapping("/getall")
    private List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }
}
