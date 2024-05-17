package com.example.demo.Quizzes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/quizzes")
@CrossOrigin(origins = "https://codemasters-edu.netlify.app/")
public class QuizController {
		@Autowired
	    private QuizRepository quizRepository;

	    @GetMapping
	    public List<Quiz> getAllQuizzes() {
	        return quizRepository.findAll();
	    }

	    @PostMapping
	    public Quiz createQuiz(@RequestBody Quiz quiz) {
	        return quizRepository.save(quiz);
	    }
}
