package com.example;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;

@Path("/ping")
@Produces(MediaType.APPLICATION_JSON)
@Slf4j
public class PingPongResource {

    @POST
    public String pingPong(Object pingObject) {
        log.debug("Was pinged with: {}", pingObject);
        return "Pong: " + pingObject;
    }
}
