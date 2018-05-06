package com.example.android.soconnected_final_christinakasey;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Questions {
    private static final Questions[] questionList ={
            new Questions( "What was the last book you read?"),
            new Questions ("Where is the farthest place you have traveled?"),
            new Questions("Who is your favorite sports team?"),
            new Questions("If I could change one thing about myself it would be_________."),
            new Questions("One of the things I find most annoying is…"),
            new Questions("Where did you grow up?"),
            new Questions("On Friday nights I am usually…"),
            new Questions("I spend too much money on..."),
            new Questions( "Advice to my younger self…"),
            new Questions("My mom would describe me as..."),
            new Questions( "Facts about me that surprises people…"),
            new Questions("My last meal would be ________."),
            new Questions("Let’s debate this topic…"),
            new Questions("My ideal fake sick day would be ________."),
            new Questions("I know the best spot in town for ________."),
            new Questions("My go to karaoke song is _______. ") ,
            new Questions("The place I never want to go back to is _______.") ,
            new Questions("My favorite playlist consists of…"),
            new Questions("If I could live in any movie’s universe, it would be __________."),
            new Questions("If I could change one thing about the world it would be _______.")
    };
    private String question;
    private String answer;

    public Questions(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;

    }

    public static Questions[] getRandomQuestions(){
        Random rand = new Random();
        int  index = rand.nextInt(questionList.length-1) ;
        List<Questions> randomQuestionList= new ArrayList<>();
        int counter =0;
        while (counter < 5) {
            Questions q = questionList[index];
            index ++;
            if (index == questionList.length)
                index= 0;
            randomQuestionList.add(q);
            counter++;
        }
        Questions[] randomQuestionArr = new Questions[randomQuestionList.size()];
        randomQuestionArr = randomQuestionList.toArray(randomQuestionArr);
        return randomQuestionArr;
    }
    public String toString(){
        return "Question:" + this.getQuestion() + "\nAnswer:" + this.getAnswer();
    }

}



