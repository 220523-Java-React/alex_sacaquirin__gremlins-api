package com.revature.model.Controller;

import com.revature.model.Gremlin;
import com.revature.model.Repository.GremlinRepository;
import com.revature.model.service.GremlinService;
import io.javalin.http.Handler;


import java.util.List;


public class GremlinController {

    GremlinService gremlinService = new GremlinService();

    public Handler createNewGremlin = ctx -> {
        Gremlin gremlin = ctx.bodyAsClass(Gremlin.class);


        try {
            ctx.json(gremlinService.createNewGremlin(gremlin));
        } catch (NullPointerException e) {
            ctx.status(400).result("Could not create the gremlin");
        }
    };

    public Handler getAllGremlins = ctx -> {
        ctx.json(gremlinService.getAllGremlins());
    };
}
