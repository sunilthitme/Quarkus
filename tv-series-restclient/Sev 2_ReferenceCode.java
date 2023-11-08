import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.print.attribute.standard.Media;
import java.util.logging.Logger;

@Path("/tv-name")
public class StudentRegisterResource {
    public static final Logger LOGGER = Logger.getLogger(String.valueOf(StudentRegisterResource.class));

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sendName(){
        LOGGER.info("Inside sendName");
        return "Kalash";
    }
}