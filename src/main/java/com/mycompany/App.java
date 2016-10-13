package com.mycompany;

import org.jooby.Jooby;
import org.jooby.Results;
import org.jooby.pebble.Pebble;
import org.jooby.whoops.Whoops;

/**
 * @author jooby generator
 */
public class App extends Jooby {


{
  use(new Pebble("templates", ".html"));
  //use(new Ftl());

  use(new Whoops());
  use (Greetings.class);
 

  get("/", (req,rsp) -> {
    Results.html("index");
  });

}


  public static void main(final String[] args) throws Throwable {
    run(App::new, args);
  }

}
