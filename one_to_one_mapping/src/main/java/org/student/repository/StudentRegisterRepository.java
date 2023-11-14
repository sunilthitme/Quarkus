package org.student.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.student.entity.StudentRegister;

@ApplicationScoped
public class StudentRegisterRepository implements PanacheRepository<StudentRegister> {
}
