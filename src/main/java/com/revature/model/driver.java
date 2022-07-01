package com.revature.model;

import com.revature.model.Controller.GremlinController;
import io.javalin.Javalin;
import io.javalin.http.Handler;

public class driver {
    public static void main(String[]args){
        GremlinController gremlinController = new GremlinController();

        Javalin app = Javalin.create().start(8080);

        app.get("/gremlins",  gremlinController.getAllGremlins);
        app.post("/gremlins", gremlinController.createNewGremlin);
    }
}
