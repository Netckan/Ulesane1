package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageView country;
    TextView question;
    Button answer1;
    Button answer2;
    Button answer3;
     int total;
     int n;

    Question[] quiz=new Question[10];









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Intent intent = new Intent(this, MainActivity3.class);


        quiz [0]=new Question(1,"Столица Эстонии","Tallinn",new String[]{"Tallinn","Riga","Vilnus"},"tallinn");
        quiz [1]=new Question(2,"Столица Австралии","Canberra",new String[]{"Tallinn","Canberra","Vilnus"},"canberra");
        quiz [2]=new Question(3,"Столица Финляндии","Helsinki",new String[]{"Helsinki","Riga","Vilnus"},"helsinki");
        quiz [3]=new Question(4,"Столица Англии","London",new String[]{"London","Riga","Helsinki"},"london");
        quiz [4]=new Question(5,"Столица США ","Washington",new String[]{"London","Washington","Vilnus"},"washington");
        quiz [5]=new Question(6,"Столица Украины","Kiev",new String[]{"Tallinn","Riga","Kiev"},"kiev");
        quiz [6]=new Question(7,"Столица России","Moscow",new String[]{"Moscow","London","Washington"},"moscow");
        quiz [7]=new Question(8,"Столица Латвии","Riga",new String[]{"Kiev","Riga","Tallinn"},"riga");
        quiz [8]=new Question(9,"Столица Польши","Varssavi",new String[]{"Canberra","Varssavi","London"},"varssavi");
        quiz [9]=new Question(10,"Столица Литвы","Vilnus",new String[]{"Moscow","Helsinki","Vilnus"},"vilnus");


        country=findViewById(R.id.country);
        question=findViewById(R.id.question);
        answer1=findViewById(R.id.answer1);
        answer2=findViewById(R.id.answer2);
        answer3=findViewById(R.id.answer3);


        question.setText(quiz[n].getQuestion());
        answer1.setText(quiz[n].getAnswer()[0]);
        answer2.setText(quiz[n].getAnswer()[1]);
        answer3.setText(quiz[n].getAnswer()[2]);
        int resID = getResources().getIdentifier(quiz[n].getFile() , "drawable", getPackageName());
         Drawable myDrawable = getResources().getDrawable(resID);
        country.setImageDrawable(myDrawable);


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer1.getText().equals(quiz[n].getTrueanswer())){
                    Toast.makeText(getApplicationContext(),"Yes, this is correct answer",Toast.LENGTH_LONG).show();
                    total=total+10;
                }
                else{
                    Toast.makeText(getApplicationContext(),"Yes, this is nocorrect answer", Toast.LENGTH_LONG).show();
                    total=total-5;
                }
                n++;
                if(n==10){

                    openMainActivity3();
                    intent.putExtra("ror", (Integer)total);
                }else{

                question.setText(quiz[n].getQuestion());
                answer1.setText(quiz[n].getAnswer()[0]);
                answer2.setText(quiz[n].getAnswer()[1]);
                answer3.setText(quiz[n].getAnswer()[2]);
                int resID = getResources().getIdentifier(quiz[n].getFile() , "drawable", getPackageName());
                Drawable myDrawable = getResources().getDrawable(resID);
                country.setImageDrawable(myDrawable);}
            }

        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getText().equals(quiz[n].getTrueanswer())){
                    Toast.makeText(getApplicationContext(),"Yes, this is correct answer",Toast.LENGTH_LONG).show();
                    total=total+10;
                }
                else{
                    Toast.makeText(getApplicationContext(),"Yes, this is nocorrect answer", Toast.LENGTH_LONG).show();
                    total=total-5;
                }
                n++;
                if(n==10){

                    openMainActivity3();
                    intent.putExtra("ror", (Integer)total);
                }else{

                question.setText(quiz[n].getQuestion());
                answer1.setText(quiz[n].getAnswer()[0]);
                answer2.setText(quiz[n].getAnswer()[1]);
                answer3.setText(quiz[n].getAnswer()[2]);
                int resID = getResources().getIdentifier(quiz[n].getFile() , "drawable", getPackageName());
                Drawable myDrawable = getResources().getDrawable(resID);
                country.setImageDrawable(myDrawable);}
            }

        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText().equals(quiz[n].getTrueanswer())){
                    Toast.makeText(getApplicationContext(),"Yes, this is correct answer",Toast.LENGTH_LONG).show();
                    total=total+10;
                }
                else{
                    Toast.makeText(getApplicationContext(),"Yes, this is nocorrect answer", Toast.LENGTH_LONG).show();
                    total=total-5;
                }
                n++;
                if(n==10){

                    openMainActivity3();
                    intent.putExtra("ror", (Integer)total);
                }else{

                question.setText(quiz[n].getQuestion());
                answer1.setText(quiz[n].getAnswer()[0]);
                answer2.setText(quiz[n].getAnswer()[1]);
                answer3.setText(quiz[n].getAnswer()[2]);
                int resID = getResources().getIdentifier(quiz[n].getFile() , "drawable", getPackageName());
                Drawable myDrawable = getResources().getDrawable(resID);
                country.setImageDrawable(myDrawable);}
            }

        });





    }
    public  void openMainActivity3(){
        Intent intent =new Intent(this,MainActivity3.class);
        startActivity(intent);}
}