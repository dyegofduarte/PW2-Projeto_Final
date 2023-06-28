package dev.dyegofduarte;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "http://localhost:8081/HellowSistema")
public interface Sistema {
    @GET
    @RolesAllowed("manager")
    @Produces(MediaType.TEXT_PLAIN)
    public String testesistema();

        
}
