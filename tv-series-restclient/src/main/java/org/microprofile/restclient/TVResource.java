package org.microprofile.restclient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/home")
public class TVResource {
    @RestClient
    TvSeriesIdProxy proxy;

    @GET
    @Path("/{id}")
//    @Produces(MediaType.TEXT_PLAIN)
    public Response getTVSeriesById(@PathParam("id") int id){
        return Response.ok(proxy.getTvSeriesById(id)).build();
//
    }
}
