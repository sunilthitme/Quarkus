package org.microprofile.restclient;

import io.vertx.core.json.JsonArray;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;


@Path("/")
@RegisterRestClient(baseUri = "https://api.tvmaze.com")
public interface TvSeriesIdProxy {

//    https://api.tvmaze.com/shows/120
    @GET
    @Path("shows/{id}")
    TVSeries getTvSeriesById(@PathParam("id") int id);

    //https://api.tvmaze.com/search/people?q=lauren
//    @GET
//    @Path("search/people")
//    JsonArray getTvSeriesByPersonNane(@QueryParam("q") String personName);
}