package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    TextView t1, t2;
    Button increase1,increase2,decrease1,decrease2;
    int team1 =0;
    int team2 =0;
    String team1_s,team2_s;
    RadioGroup radioGroup;
    RadioButton radioButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1= findViewById(R.id.scoreof1);
        t2 =findViewById(R.id.scoreof2);
        increase1 = findViewById(R.id.increase1);
        decrease1= findViewById(R.id.decrease1);
        increase2=findViewById(R.id.increase2);
        decrease2 = findViewById(R.id.decrease2);

        radioGroup = findViewById(R.id.group);






        increase1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = radioGroup.getCheckedRadioButtonId();


                radioButton = findViewById(selectedId);
                if (selectedId==R.id.rb1){
                    team1 = team1+1;
                    team1_s = String.valueOf(team1);
                    t1.setText(team1_s);

                }else if (selectedId==R.id.rb2){
                    team1 = team1+2;
                    team1_s = String.valueOf(team1);
                    t1.setText(team1_s);
                }
                else if (selectedId==R.id.rb3){
                    team1 = team1+3;
                    team1_s = String.valueOf(team1);
                    t1.setText(team1_s);
                }



            }
        });

        decrease1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(selectedId);
                if (selectedId==R.id.rb1){

                    team1 = team1-1;
                    team1_s = String.valueOf(team1);
                    t1.setText(team1_s);



                }else if (selectedId==R.id.rb2){

                    team1 = team1-2;
                    team1_s = String.valueOf(team1);
                    t1.setText(team1_s);



                }

                else if (selectedId==R.id.rb3){

                    team1 = team1-3;
                    team1_s = String.valueOf(team1);
                    t1.setText(team1_s);






                }

            }
        });

        increase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(selectedId);
                if (selectedId==R.id.rb1){
                    team2 = team2+1;
                    team2_s = String.valueOf(team2);
                    t2.setText(team2_s);

                }else if (selectedId==R.id.rb2){
                    team2 = team2+2;
                    team2_s = String.valueOf(team2);
                    t2.setText(team2_s);
                }
                else if (selectedId==R.id.rb3){
                    team2 = team2+3;
                    team2_s = String.valueOf(team2);
                    t2.setText(team2_s);
                }




            }
        });

        decrease2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(selectedId);
                if (selectedId==R.id.rb1){

                    team2 = team2-1;
                    team2_s = String.valueOf(team2);
                    t2.setText(team2_s);



                }else if (selectedId==R.id.rb2){

                    team2 = team2-2;
                    team2_s = String.valueOf(team2);
                    t2.setText(team2_s);


                }
                else if (selectedId==R.id.rb3){

                    team2 = team2-3;
                    team2_s = String.valueOf(team2);
                    t2.setText(team2_s);




                }

            }
        });

    }
}
