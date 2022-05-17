package com.softura.softclinicapp.threads;

import com.softura.softclinicapp.models.Answer;
import com.softura.softclinicapp.models.Question;
import com.softura.softclinicapp.utility.QAHelper;

public class Quiz  implements Runnable{


    @Override
    public void run() {


      for(Question question : QAHelper.sendQuestions()){
          System.out.println(Thread.currentThread().isAlive());
          try {
              System.out.print(question.getQuestionNo());
              System.out.println(question.getQuestionText());
              for(Answer answer:question.getAnswer()){
                  System.out.print(answer.getAnswerId());
                  System.out.println(answer.getAnswerText());
              }
              Thread.sleep(20000);
          } catch (InterruptedException e) {
               break;
          }
      }

    }


    public static void quizAnalysis(){
        System.out.println("Report ready to roll....");
    }

}
