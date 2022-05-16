package com.softura.softclinicapp.threads;

public class TitleThread extends Thread{
    private String title;
    public TitleThread(String name) {
        super(name);
        this.title=name;
    }

    @Override
    public void run() {

      for(char ch : this.title.toCharArray())
      {
          System.out.print(ch);
          try {
              Thread.sleep(2000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }

    }
}
