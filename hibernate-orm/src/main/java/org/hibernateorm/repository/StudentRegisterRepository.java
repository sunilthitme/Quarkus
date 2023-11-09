package org.hibernateorm.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.hibernateorm.entity.StudentRegister;

@ApplicationScoped
public class StudentRegisterRepository implements PanacheRepository<StudentRegister> {

}
