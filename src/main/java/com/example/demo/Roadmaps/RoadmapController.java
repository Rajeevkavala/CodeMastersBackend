package com.example.demo.Roadmaps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roadmaps")
@CrossOrigin(origins = "https://codemasters-edu.netlify.app/")
public class RoadmapController {

    @Autowired
    private RoadmapRepository roadmapRepository;

    @GetMapping
    public List<Roadmap> getAllRoadmaps() {
        return roadmapRepository.findAll();
    }

    @PostMapping
    public Roadmap createRoadmap(@RequestBody Roadmap roadmap) {
        return roadmapRepository.save(roadmap);
    }
}
