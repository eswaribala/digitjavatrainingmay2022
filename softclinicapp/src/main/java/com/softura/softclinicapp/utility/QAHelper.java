package com.softura.softclinicapp.utility;

import com.softura.softclinicapp.models.Answer;
import com.softura.softclinicapp.models.Question;

public class QAHelper {

    private static Question[] questions;
    private static Answer[] answers;

    public static Question[] sendQuestions(){
        questions=new Question[2];
        answers=new Answer[2];
        Question question=new Question();
        question.setQuestionNo(1);
        question.setQuestionText("What is Full form of JVM");
        question.setCorrectAnswer(1);
        Answer answer1=new Answer();
        answer1.setAnswerId(1);
        answer1.setAnswerText("Java Virtual Machine");
        answers[0]=answer1;
        answer1=new Answer();
        answer1.setAnswerId(2);
        answer1.setAnswerText("Java Virtual Mechanism");
        answers[1]=answer1;
        question.setAnswer(answers);

        questions[0]=question;
        answers=new Answer[2];
        question=new Question();
        question.setQuestionNo(2);
        question.setQuestionText("What is Java Native");
        question.setCorrectAnswer(2);
        answer1=new Answer();
        answer1.setAnswerId(1);
        answer1.setAnswerText("Java Source Code");
        answers[0]=answer1;
        answer1=new Answer();
        answer1.setAnswerId(2);
        answer1.setAnswerText("Non Java Code");
        answers[1]=answer1;
        question.setAnswer(answers);
        questions[1]=question;

        return questions;


    }


}
