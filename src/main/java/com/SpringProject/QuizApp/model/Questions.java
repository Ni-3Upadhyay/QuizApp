package com.SpringProject.QuizApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data       // as we are using lombok now we do not need to create getter and setter for each method it is created by lombok itself.
@Entity // to tell that this class is mapped to table
public class Questions {
    @Id                 // to create a primary key
//    @GeneratedValue(strategy = GenerationType.IDENTITY)  // to auto-generate the id
    private Integer id;
    private String difficultyLevel;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String category;

}
