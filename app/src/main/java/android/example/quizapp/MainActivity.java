package android.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int index=0;
    int score=0;
    Button yes;
    Button no;
    TextView textView;

    String [] question = {"Q.1 : Static methods cannot be accessed directly from the class level? ", "Q.2 : James Gosling is known as the founder of Java ?" ,"Q.3 : Data hiding is also known as Encapsulation ?" ,"Q.4 : public static void main (string [] args) is the right Syntax ?" ,"Q.5 : Integer is not a Keyword in Java"};
    //
//
    boolean [] sol ={false,true,true,false,false};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        textView=findViewById(R.id.textview);
//
        textView.setText(question[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=question.length-1)
                {
                    if(sol[index]==true)
                    {
                        ++score;
                    }
                    index++;
                    if(index<=question.length-1)
                    {
                        textView.setText(question[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score is " + score , Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Restart app ", Toast.LENGTH_SHORT).show();
                }



            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=question.length-1)
                {
                    if(sol[index]==false)
                    {
                        score++;
                    }
                    index++;
                    if(index<=question.length-1)
                    {
                        textView.setText(question[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score is " + score , Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Restart app ", Toast.LENGTH_SHORT).show();
                }





            }
        });




    }
}