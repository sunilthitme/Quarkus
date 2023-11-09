package org.hibernateorm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentRegister {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String name;
   private String education;
    private int grade;
    private String blood_Group;

    public StudentRegister(int id, String name, String education, int grade, String blood_Group) {
        this.id = id;
        this.name = name;
        this.education = education;
        this.grade = grade;
        this.blood_Group = blood_Group;
    }

    public StudentRegister(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getBlood_Group() {
        return blood_Group;
    }

    public void setBlood_Group(String blood_Group) {
       this.blood_Group = blood_Group;
    }




}
