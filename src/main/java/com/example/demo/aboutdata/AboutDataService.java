package com.example.demo.aboutdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutDataService {

    @Autowired
    private AboutDataRepository aboutDataRepository;

    public List<AboutData> getAllAboutData() {
        return aboutDataRepository.findAll();
    }

    public AboutData addAboutData(AboutData aboutData) {
        return aboutDataRepository.save(aboutData);
    }
}
