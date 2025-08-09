package com.itheima.d1_extends;

public class Teacher extends People {
    private String wordId;

    public Teacher() {
    }

    public Teacher(String name, int age, String wordId) {
        super(name, age);
        this.wordId = wordId;
    }

    public String getWordId() {
        return wordId;
    }

    public void setWordId(String wordId) {
        this.wordId = wordId;
    }

    public void teach() {
        System.out.println("讲课");
    }
}
