package com.example.demo.Quizzes;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class QuizService {
	 private final QuizRepository quizRepository;

	    public QuizService(QuizRepository quizRepository) {
	        this.quizRepository = quizRepository;
	    }

	    public List<Quiz> getAllQuizzes() {
	        return quizRepository.findAll();
	    }

	    public Optional<Quiz> getQuizById(String id) {
	        return quizRepository.findById(id);
	    }

	    public Quiz createQuiz(Quiz quiz) {
	        return quizRepository.save(quiz);
	    }

	    public void updateQuiz(String id, Quiz updatedQuiz) {
	        Optional<Quiz> quizOptional = quizRepository.findById(id);
	        if (quizOptional.isPresent()) {
	            Quiz quiz = quizOptional.get();
	            quiz.setTitle(updatedQuiz.getTitle());
	            quiz.setIconClass(updatedQuiz.getIconClass());
	            quiz.setDescription(updatedQuiz.getDescription());
	            quiz.setPath(updatedQuiz.getPath());
	            quizRepository.save(quiz);
	        } else {
	            // Handle error: Quiz not found
	        }
	    }

	    public void deleteQuizById(String id) {
	        quizRepository.deleteById(id);
	    }
}
