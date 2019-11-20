import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * Root resource (exposed at "myresource" path)
 */
@path("myresource")
public class MyResource {
    /**
     * Method handling HTTP GET requests. The returned object will be sent to the
     * client as "text/plain" media type.
     * 
     * @return String that will be returned as a text/plain response.
     */
    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}