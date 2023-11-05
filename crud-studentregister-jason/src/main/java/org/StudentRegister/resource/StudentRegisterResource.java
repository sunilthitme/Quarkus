package org.StudentRegister.resource;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.StudentRegister.entity.StudentRegister;
import org.StudentRegister.repository.StudentRepo;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.print.attribute.standard.Media;

@Path("/home")
public class StudentRegisterResource {
    @Inject
    StudentRepo repo;
    @POST
    @Path("/{studentData}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createData(@RequestBody StudentRegister studentRegister){
        return Response.ok(repo.addData(studentRegister)).build();

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getData(){
        return Response.ok(repo.returnData()).build();
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response modifyData(@PathParam("id") int id, StudentRegister newData ){
        return Response.ok(repo.editData(id,newData)).build();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteData(@PathParam("id") int id){
        return Response.ok(repo.removeData(id)).build();
    }
}
