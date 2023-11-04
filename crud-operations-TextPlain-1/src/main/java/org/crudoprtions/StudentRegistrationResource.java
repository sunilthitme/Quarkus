package org.crudoprtions;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import repo.*;
@Path("/hello")
public class StudentRegistrationResource {

    @Inject
    StudentRepository repo;
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public void createData(@PathParam("name") String name){

        repo.addList(name);
    }
}
