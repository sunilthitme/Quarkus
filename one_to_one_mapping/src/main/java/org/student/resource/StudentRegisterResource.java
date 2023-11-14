package org.student.resource;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.student.entity.College;
import org.student.entity.StudentRegister;
import org.student.repository.CollegeRepository;
import org.student.repository.StudentRegisterRepository;

@Path("/home")
public class StudentRegisterResource {

    @Inject
    StudentRegisterRepository studentRepo;
    @Inject
    CollegeRepository collegeRepo;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response addStudent(@RequestBody StudentRegister student) {
//        College college=student.getCollege();
//        studentRepo.persist(student);
//        collegeRepo.persist(college);
//        if (studentRepo.isPersistent(student)) {
//            return Response.ok("Save Successfully").build();
//
//        }
        College college = new College();
        college.setName("PREC");
        college.setGrade("A");

        StudentRegister student1 = new StudentRegister();
        student1.setName("sunil");
        student1.setGrade("A");
        student1.setBlood_group("b-");

        student1.setCollege(college);

        studentRepo.persist(student1);
//        return Response.ok(Response.status(Response.Status.NOT_FOUND)).build();
        return Response.ok("saved").build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudent() {
        return Response.ok(studentRepo.listAll()).build();
    }
}
