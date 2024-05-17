package com.example.demo.aboutdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/about")
@CrossOrigin(origins = "https://codemasters-edu.netlify.app/") // Update with your frontend URL
public class AboutDataController {

    @Autowired
    private AboutDataService aboutDataService;

    @GetMapping
    public List<AboutData> getAllAboutData() {
        return aboutDataService.getAllAboutData();
    }

    @PostMapping
    public AboutData addAboutData(@RequestBody AboutData aboutData) {
        return aboutDataService.addAboutData(aboutData);
    }
}