package org.StudentRegister.repository;

import jakarta.enterprise.context.ApplicationScoped;
import org.StudentRegister.entity.StudentRegister;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class StudentRepo {

    List<StudentRegister> list = new ArrayList<>();

    public List<StudentRegister> addData(StudentRegister studentRegister) {
        list.add(studentRegister);
        return list;

    }

    public List<StudentRegister> returnData() {
        return list;
    }

    public List<StudentRegister> editData(int id, StudentRegister newData) {


        for (int i = 0; i < list.size(); i++) {
            StudentRegister register=list.get(i);
            if (register.getId()==id) {
                register.setId(newData.getId());
                register.setNumber(newData.getNumber());
                register.setName(newData.getName());
                register.setGrade(newData.getGrade());
            }
        }
        return list;
    }

    public List<StudentRegister> removeData(int id) {
        for (int i = 0; i < list.size(); i++) {
            StudentRegister register= list.get(i);
            if (register.getId()==id) {
                register.setName(null);
            }
        }
        return list;
    }
}
