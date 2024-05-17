package com.example.demo.Roadmaps;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoadmapRepository extends MongoRepository<Roadmap, String> {
	
}
