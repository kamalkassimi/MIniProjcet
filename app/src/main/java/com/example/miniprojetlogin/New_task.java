package com.example.miniprojetlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class New_task extends AppCompatActivity {
    EditText desc , date_debut,date_fin,option;
    CheckBox checkBox1 ;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);
        desc = findViewById(R.id.newTaskText);
        date_debut = findViewById(R.id.date_debut);
        date_fin = findViewById(R.id.date_fin);
        option = findViewById(R.id.option1);
        checkBox1 = findViewById(R.id.check);
        btn = findViewById(R.id.newTaskButton);


        btn.setOnClickListener((View)->{
            add1();
            Intent intent = new Intent(this, kamalActivity.class);
            startActivity(intent);
        });
    }
    public void add1() {
        String descrption = desc.getText().toString();
        String dateDebut =  date_debut.getText().toString();
        String dateFin =  date_fin.getText().toString();
        String option1 = option.getText().toString();
//        String checkbox11 = checkBox1. ;

        kamalActivity.listdata.add(new data(descrption,dateDebut,dateFin,option1 ,false));
    }
}