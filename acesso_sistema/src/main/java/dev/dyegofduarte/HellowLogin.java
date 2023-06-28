package dev.dyegofduarte;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/HellowLogin")
public class HellowLogin {
    @GET
    @RolesAllowed("manager")
    @Produces(MediaType.TEXT_PLAIN)
    public String testelogin() {

        return "LOGANDO";
    }
    
}
