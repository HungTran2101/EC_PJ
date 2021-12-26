package com.example.ec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {

    @Id
    private String staff_citizen_identification;
    private String staff_name;
    private String staff_address;
    private String staff_phone;
    private String staff_position;

    public Staff() {}

    public Staff(String staff_citizen_identification, String staff_name, String staff_address, String staff_phone, String staff_position) {
        this.staff_citizen_identification = staff_citizen_identification;
        this.staff_name = staff_name;
        this.staff_address = staff_address;
        this.staff_phone = staff_phone;
        this.staff_position = staff_position;
    }

    public String getStaff_citizen_identification() {
        return staff_citizen_identification;
    }

    public void setStaff_citizen_identification(String staff_citizen_identification) {
        this.staff_citizen_identification = staff_citizen_identification;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getStaff_address() {
        return staff_address;
    }

    public void setStaff_address(String staff_address) {
        this.staff_address = staff_address;
    }

    public String getStaff_phone() {
        return staff_phone;
    }

    public void setStaff_phone(String staff_phone) {
        this.staff_phone = staff_phone;
    }

    public String getStaff_position() {
        return staff_position;
    }

    public void setStaff_position(String staff_position) {
        this.staff_position = staff_position;
    }
}
