package org.hibernateorm.resource;


import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.hibernateorm.entity.StudentRegister;
import org.hibernateorm.repository.StudentRegisterRepository;

import java.util.List;

@Path("/home")
public class StudentRegisterResource {
    @Inject
    StudentRegisterRepository repo;
    @POST
    @Path("/persist_student")
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addStudent(@RequestBody StudentRegister student) {
        repo.persist(student);
        if(repo.isPersistent(student)){
            return Response.ok("save successfully").build();
        }
        return Response.ok(Response.Status.BAD_REQUEST).build();

    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudent(){
        return Response.ok(repo.listAll()).build();
    }
    @GET
    @Path("/findByName/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findByName(@PathParam("name") String name) {

        for (StudentRegister student : repo.listAll()) {
            if (student.getName().equals(name)) {
                return Response.ok(student).build();
            }

        }
        return Response.ok(Response.Status.NOT_FOUND).build();
    }
}

