package pl.edu.pjwstk.s8132.sri;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class TestServlet {

    @GET
    @Produces("text/plain")
    public String test(){
        return "Hello world";
    }
}
