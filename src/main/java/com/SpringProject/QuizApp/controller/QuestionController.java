package com.SpringProject.QuizApp.controller;


import com.SpringProject.QuizApp.model.Questions;
import com.SpringProject.QuizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;



    @GetMapping("allQuestion")
    public List<Questions> getAllQuestion(){
        return questionService.getAllQuestion();
    }


//    method to get value by category

    @GetMapping("category/{category}")   // the value in curly braces {} are variables.
     public List<Questions> getQuestionByCategory(@PathVariable String category){        // this annotation helps to get mapping
        return questionService.getQuestionByCategory(category);
    }


//    To insert a row in database

    @PostMapping("add")
    public String addQuestion(@RequestBody Questions questions){
        return questionService.addQuestion(questions);
    }

}
