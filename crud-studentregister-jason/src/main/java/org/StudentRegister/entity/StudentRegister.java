package org.StudentRegister.entity;


import io.quarkus.Generated;
import io.quarkus.arc.impl.Identified;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import javax.persistence.*;

@Entity
public class StudentRegister {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Long number;
    private String name;

    private int grade;
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public Long getNumber(){
        return number;
    }

    public void setNumber(Long number){
        this.number=number;
    }

}
