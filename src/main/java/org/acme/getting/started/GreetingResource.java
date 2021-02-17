package org.acme.getting.started;

import nu.pattern.OpenCV;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    static {
        OpenCV.loadLocally();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        Mat zeros = Mat.zeros(10, 10, CvType.CV_8UC1);
        return zeros.toString();
    }
}