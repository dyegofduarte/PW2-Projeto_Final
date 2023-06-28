package dev.dyegofduarte;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import io.quarkus.security.Authenticated;
import org.eclipse.microprofile.rest.client.inject.RestClient;



@Path("/Autenticacao/{u}/{p}")
@Authenticated
public class RecebeUsuarioSenha{

    @Inject
    @RestClient
    Sistema sistema;
 
    @GET
    @RolesAllowed("manager")
    @Produces(MediaType.TEXT_PLAIN)
    public String auth(@PathParam("u") String u, @PathParam("p") String p) {
        System.out.println(sistema.testesistema());
        return u+p;
    }


}