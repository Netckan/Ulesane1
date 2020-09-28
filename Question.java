package com.example.myapplication;

public class Question {


    int id;
    String question;
    String trueanswer;
    String[] answer;
    String file;


    public Question(int id, String question, String trueanswer, String[] answer, String file) {
        this.id = id;
        this.question = question;
        this.trueanswer = trueanswer;
        this.answer = answer;
        this.file = file;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getTrueanswer() {
        return trueanswer;
    }

    public void setTrueanswer(String trueanswer) {
        this.trueanswer = trueanswer;
    }

    public String[] getAnswer() {
        return answer;
    }

    public void setAnswer(String[] answer) {
        this.answer = answer;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
