package com.example.android.soconnected_final_christinakasey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class QuestionsActivity extends AppCompatActivity {
    QuestionRandomizer newUserQuestions;
    private TextView tv_question1;
    private  TextView tv_question2;
    private   TextView tv_question3;
    private TextView tv_question4;
    private  TextView tv_question5;

    private  EditText et_answer1;
    private  EditText et_answer2;
    private EditText et_answer3;
    private  EditText et_answer4;
    private  EditText et_answer5;
    private TextView tv_questions[]=new TextView[5];
    private EditText et_answers[]=new EditText[5];
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);



            tv_question1=(TextView) findViewById(R.id.textView_q1);
            et_answer1=(EditText) findViewById(R.id.edittext_a1);
            tv_question2=(TextView) findViewById(R.id.textView_q2);
            et_answer2=(EditText) findViewById(R.id.edittext_a2);
            tv_question3=(TextView) findViewById(R.id.textView_q3);
            et_answer3=(EditText) findViewById(R.id.edittext_a3);
            tv_question4=(TextView) findViewById(R.id.textView_q4);
            et_answer4=(EditText) findViewById(R.id.edittext_a4);
            tv_question5=(TextView) findViewById(R.id.textView_q5);
            et_answer5=(EditText) findViewById(R.id.edittext_a5);
            tv_questions [0] = tv_question1;
            tv_questions [1] = tv_question2;
            tv_questions [2] = tv_question3;
            tv_questions [3] = tv_question4;
            tv_questions [4] = tv_question5;

            et_answers[0]= et_answer1;
            et_answers[1]= et_answer2;
            et_answers[2]= et_answer3;
            et_answers[3]= et_answer4;
            et_answers[4]= et_answer5;


            newUserQuestions = new QuestionRandomizer ();
        Questions questions[]=newUserQuestions.getQuestions();
            for (int i =0; i <questions.length; ++i){
                Questions question= questions[i];
                this.tv_questions[i].setText(question.getQuestion());
            }
        }

        public void submitButton (View view) {

           /* String userId = mAuth.getCurrentUser().getUid();
            DatabaseReference currentUserDb = FirebaseDatabase.getInstance().getReference().child("Users").child(userId);
            Map userInfo = new HashMap<>();
            userInfo.put("question1", tv_question1);
            userInfo.put("question2", tv_question2);
            userInfo.put("question3", tv_question3);
            userInfo.put("question4", tv_question4);
            userInfo.put("question5", tv_question5);
            userInfo.put("answer1", et_answer1);
            userInfo.put("answer2", et_answer2);
            userInfo.put("answer3", et_answer3);
            userInfo.put("answer4", et_answer4);
            userInfo.put("answer5", et_answer5);

            currentUserDb.updateChildren(userInfo);
           /* String answers []= new String[newUserQuestions.getQuestions().length];
            for (int i =0; i<this.et_answers.length; ++i){
                EditText et = this.et_answers[i];
                answers [i]=et.getText().toString();
            }
            newUserQuestions.setAnswersToQuestions(answers);*/
            Intent intent=new Intent (QuestionsActivity.this,MainActivity.class);
            //intent.putExtra("user", newUserQuestions);
            startActivity(intent);
        }
    }