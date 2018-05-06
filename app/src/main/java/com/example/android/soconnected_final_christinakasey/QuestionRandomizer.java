package com.example.android.soconnected_final_christinakasey;

import java.io.Serializable;
//SoConnected
public class QuestionRandomizer implements Serializable {
        private Questions questions[];

        public QuestionRandomizer() {
            questions=Questions.getRandomQuestions();
        }

        public Questions[] getQuestions() {
            return questions;
        }
        public void setAnswersToQuestions (String answersToQuestions[]){
            for(int i =0 ; i< answersToQuestions.length; ++i){
                String answer=answersToQuestions[i];
                Questions question = questions[i];
                question.setAnswer(answer);
            }
        }
    }