package org.student.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.student.entity.College;

@ApplicationScoped
public class CollegeRepository implements PanacheRepository<College> {
}
