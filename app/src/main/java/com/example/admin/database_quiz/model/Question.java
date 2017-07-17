package com.example.admin.database_quiz.model;


/**
 * Created by alfiroj on 5/13/16.
 */
public class Question {
    private int id;
    private String QUESTION;
    private String ANSWER;
    private String OptionA;
    private String OptionB;
    private String OptionC;
    private String OptionD;

    public Question(){
        id=0;
        QUESTION="";
        ANSWER="";
        OptionA="";
        OptionB="";
        OptionC="";
        OptionD="";
    }

    public Question(String quesTion, String opA, String opB, String opC,String opD,
                    String ansWer) {

        QUESTION = quesTion;
        OptionA = opA;
        OptionB = opB;
        OptionC = opC;
        OptionD = opD;
        ANSWER = ansWer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public void setQUESTION(String QUESTION) {
        this.QUESTION = QUESTION;
    }

    public String getANSWER() {
        return ANSWER;
    }

    public void setANSWER(String ANSWER) {
        this.ANSWER = ANSWER;
    }

    public String getOptionA() {
        return OptionA;
    }

    public void setOptionA(String optionA) {
        OptionA = optionA;
    }

    public String getOptionB() {
        return OptionB;
    }

    public void setOptionB(String optionB) {
        OptionB = optionB;
    }

    public String getOptionC() {
        return OptionC;
    }

    public void setOptionC(String optionC) {
        OptionC = optionC;
    }

    public String getOptionD() {
        return OptionD;
    }

    public void setOptionD(String optionD) {
        OptionD = optionD;
    }
}