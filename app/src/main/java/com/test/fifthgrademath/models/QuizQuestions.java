package com.test.fifthgrademath.models;

import java.util.ArrayList;


public class QuizQuestions
{
    private int questionId;
    private String question;
    private String options1;
    private String options2;
    private String options3;
    private String options4;
    private String correctAnswer;
    private String answerExplanation;
    private static ArrayList<QuizQuestions>mQuizQuestionsArrayList;

    public QuizQuestions()
    {
    }

    public QuizQuestions(int questionId, String question, String options1, String options2, String options3, String options4, String correctAnswer)
    {
        this.questionId = questionId;
        this.question = question;
        this.options1 = options1;
        this.options2 = options2;
        this.options3 = options3;
        this.options4 = options4;
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer()
    {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer)
    {
        this.correctAnswer = correctAnswer;
    }

    public int getQuestionId()
    {
        return questionId;
    }

    public void setQuestionId(int questionId)
    {
        this.questionId = questionId;
    }

    public String getQuestion()
    {
        return question;
    }

    public void setQuestion(String question)
    {
        this.question = question;
    }

    public String getOptions1()
    {
        return options1;
    }

    public void setOptions1(String options1)
    {
        this.options1 = options1;
    }

    public String getOptions2()
    {
        return options2;
    }

    public void setOptions2(String options2)
    {
        this.options2 = options2;
    }

    public String getOptions3()
    {
        return options3;
    }

    public void setOptions3(String options3)
    {
        this.options3 = options3;
    }

    public String getOptions4()
    {
        return options4;
    }

    public void setOptions4(String options4)
    {
        this.options4 = options4;
    }

    public static  ArrayList<QuizQuestions> getQuizQuestionsArrayList()
    {
        return mQuizQuestionsArrayList;
    }


    public static void initData()
    {
        mQuizQuestionsArrayList = new ArrayList<>();
        mQuizQuestionsArrayList.add(new QuizQuestions(1,"Which of the following is not a 5/8 decomposed","3/8 + 2/8","2/8 + 2/8 + 1/8","4/8 + 2/8","1/8 + 1/8 + 1/8 + 2/8","4/8 + 2/8"));
        mQuizQuestionsArrayList.add(new QuizQuestions(2,"Which of the following shows a fraction accurately decomposed","2/5 + 2/5 = 5/5","1/5 + 1/5 + 2/5 = 4/5","4/8 + 3/8 = 6/8","1/8 + 1/8 + 1/8 = 4/8","1/5 + 1/5 + 2/5 = 4/5"));
        mQuizQuestionsArrayList.add(new QuizQuestions(3,"What is the sum \n2/10 + 5/10","8/10","7/10","6/10","7/8","7/10"));
        mQuizQuestionsArrayList.add(new QuizQuestions(4,"Find the difference \n5/6 - 2/6","2/6","2/5","3/6","3/5","3/6"));
        mQuizQuestionsArrayList.add(new QuizQuestions(5,"What is the sum \n2 3/8 and 1 2/8","3 4/8","2 2/8","3 5/8","2 1/8","3 5/8"));
        mQuizQuestionsArrayList.add(new QuizQuestions(6,"Find the sum \n5/10 + 30/100","8/100","8/10","20/100","2/10","8/10"));
        mQuizQuestionsArrayList.add(new QuizQuestions(7,"Find the difference \n5 8/10 - 2 5/10","2 5/10","3 3/10","2 3/10","3 5/10","3 3/10"));
        mQuizQuestionsArrayList.add(new QuizQuestions(8,"Find the product \n7 X 1/4","8/4","7/8","7/2","7/4","7/4"));
        mQuizQuestionsArrayList.add(new QuizQuestions(9,"Find the product \n3 X 3/4","9/4","9/8","9/2","6/4","9/4"));
        mQuizQuestionsArrayList.add(new QuizQuestions(10,"Which of the following is not equivelent to 3/6","1/2","2/4","5/8","5/10","5/8"));
    }
}
