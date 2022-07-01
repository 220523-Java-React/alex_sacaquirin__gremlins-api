package com.revature.model.service;

import com.revature.model.Gremlin;
import com.revature.model.Repository.GremlinRepository;

import java.util.List;

public class GremlinService {

        private final GremlinRepository gremlinRepository = new GremlinRepository();

        public Gremlin createNewGremlin(Gremlin gremlin) {
            return gremlinRepository.create(gremlin);
        }

        public List<Gremlin> getAllGremlins() {
            return gremlinRepository.getAll();
        }
    }

