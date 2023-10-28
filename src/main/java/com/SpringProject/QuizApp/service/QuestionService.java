package com.SpringProject.QuizApp.service;


import com.SpringProject.QuizApp.dao.QuestionDao;
import com.SpringProject.QuizApp.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;


    public List<Questions> getAllQuestion() {
        return questionDao.findAll();               // these function are all already present in questionDao because of jpa
    }

    public List<Questions> getQuestionByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(@RequestBody Questions questions) {
        questionDao.save(questions);
        return "Success";
    }
}
