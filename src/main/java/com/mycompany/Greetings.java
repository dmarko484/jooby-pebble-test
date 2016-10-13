package com.mycompany;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.jooby.mvc.GET;
import org.jooby.mvc.Path;

@Path("/greeting")
public class Greetings {

    private final static AtomicInteger idgen = new AtomicInteger();

    @GET
    @Path({"/g", "/g:name" })
    public Greeting salute(final Optional<String> name) {
        return new Greeting(2, "Hello +++2 " + name.orElse("World") + "!");
    }

    @GET
    @Path({"/h", "/h:name" })
    public Greeting saluteH(final Optional<String> name) {
        return new Greeting(2, "AHOJ " + name.orElse("???") + "!");
    }


}