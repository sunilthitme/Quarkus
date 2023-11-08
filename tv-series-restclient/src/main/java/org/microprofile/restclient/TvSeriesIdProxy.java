package org.microprofile.restclient;

import io.vertx.core.json.JsonArray;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;



//@RegisterRestClient(baseUri = "https://api.tvmaze.com")
@RegisterRestClient(baseUri = "http://localhost:8081")
public interface TvSeriesIdProxy {

//    https://api.tvmaze.com/shows/120
    @GET
//    @Path("shows/{id}")
    @Path("/tv-name")
    @Produces(MediaType.TEXT_PLAIN)
//    TVSeries getTvSeriesById(@PathParam("id") int id);
   public String sendName();
    //https://api.tvmaze.com/search/people?q=lauren
//    @GET
//    @Path("search/people")
//    JsonArray getTvSeriesByPersonNane(@QueryParam("q") String personName);
}