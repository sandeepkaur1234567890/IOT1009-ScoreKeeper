package com.example.scorekeeper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    /* Here I declared variables */
    TextView t1, t2;
    Button increase1,increase2,decrease1,decrease2;
    int team1 =0;
    int team2 =0;
    String team1_s,team2_s;
    RadioGroup radioGroup;
    RadioButton radioButton;

    private Switch switch_btn;
    // here oncreateOptionMenu method is created
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    // here onOptionsItemSelected method is created
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.about){
            //Toast code 
            Toast.makeText(this, "Name:Sandeep Kaur Course Code:1009", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.setting){

            Intent intent = new Intent(MainActivity.this,Setting.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* Here the code for day and night mode starts */

        switch_btn=findViewById(R.id.switch_btn);

        /* here declare setonchnagelistener method */
        switch_btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                /* when user checks this switch button at that time night mode is on */
                if(isChecked){
                    getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }

                /* when button is not activate at that time day mode is on  */
                else{
                    getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }

            }


        });



        /* Here I connected all variables to their IDs */
        t1= findViewById(R.id.scoreof1);
        t2 =findViewById(R.id.scoreof2);
        increase1 = findViewById(R.id.increase1);
        decrease1= findViewById(R.id.decrease1);
        increase2=findViewById(R.id.increase2);
        decrease2 = findViewById(R.id.decrease2);

        radioGroup = findViewById(R.id.group);





        /* Here I made the code for increase the team1 score */
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

        /* Here I made the code for decrease the team1 score */
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


        /* Here I made the code for increase the team2 score */
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

        /* Here I made the code for decrease the team2 score */
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
