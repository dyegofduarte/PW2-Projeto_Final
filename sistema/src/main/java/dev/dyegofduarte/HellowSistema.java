package dev.dyegofduarte;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/HellowSistema")
public class HellowSistema {
    @GET
    @RolesAllowed("manager")
    @Produces(MediaType.TEXT_PLAIN)
    public String testesistema() {

        return "ACESSANDO SISTEMA";
    }
    
}
