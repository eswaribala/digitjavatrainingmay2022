package com.softura.softclinicapp.utility;

import com.softura.softclinicapp.threads.Quiz;

import java.util.Scanner;

public class QuizApp {
    //parent thread
    public static void main(String[] args){

        Quiz quiz=new Quiz();
        //child thread
        Thread thread =new Thread(quiz);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
        Quiz.quizAnalysis();

      /*
        Scanner scanner =new Scanner(System.in);
        System.out.println("Do you want to break");
        String quit=scanner.nextLine();
        if(quit!=null){
            thread.interrupt();
        }

       */

    }
}
