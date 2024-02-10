package com.example.miniprojetlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText imput_user, imput_password;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imput_user = findViewById(R.id.editText);
        imput_password = findViewById(R.id.editText2);
        btn= findViewById(R.id.btn);
//        Toolbar toolbar1 = findViewById(R.id.menu);
//        setSupportActionBar(toolbar1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ArrayList<String> data_user= new ArrayList<>();
//        data_user.add("kamal");
//        data_user.add("othman");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imput_user1 = imput_user.getText().toString();
                String imput_password1 = imput_password.getText().toString();
                if (!(imput_user1.equals("") ) && !(imput_password1.equals(""))){
                    if (imput_user1.equals("kamal") && imput_password1.equals("12345")){
                        Intent intent3 = new Intent(getApplicationContext(), kamalActivity.class);
                        startActivity(intent3);
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Error !! ", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "Please enter input text ?? ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_usar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        // Handle item selection.
        if (itemId == R.id.menuAdd) {
            Toast.makeText(this, "Ajouter", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (itemId == R.id.menuSave) {
            Toast.makeText(this, "Sorty", Toast.LENGTH_SHORT).show();
            finish();
            return true;
        }
        else {
            return super.onOptionsItemSelected(item);
        }


    }
}