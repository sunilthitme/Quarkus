package org.microprofile.restclient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.time.temporal.ChronoUnit;
import java.util.logging.Logger;

@Path("/home")
public class TVResource {
    public static final Logger LOGGER= Logger.getLogger("TVResource.class");
    @RestClient
    TvSeriesIdProxy proxy;

    @GET
//    @Path("/{id}")
//    @Fallback(fallbackMethod = "getTVSeriesByIdFallBack")
//    @Produces(MediaType.TEXT_PLAIN)
//    public Response getTVSeriesById(@PathParam("id") int id){
//        return Response.ok(proxy.getTvSeriesById(id)).build();
//    }
    @Produces(MediaType.TEXT_PLAIN)
    @Fallback(fallbackMethod = "getTVSeriesByIdFallback")
    @CircuitBreaker(
        requestVolumeThreshold = 4, //it will call api 4 times
            delay=10,
            delayUnit = ChronoUnit.SECONDS,
            failureRatio = 0.5

    )
     //while true;do sleep 1; curl http://localhost:8080/home; echo -e '\n'; done
    //write these script inside gitbash this project location
    public String getTVSeriesById() {
        LOGGER.info("Inside getTVSeriesById");
        return "TV Series Name:"+proxy.sendName();
    }
    public String getTVSeriesByIdFallback() {
        LOGGER.info("inside fall back method");
        return "Site is under maintainance";
    }
}

