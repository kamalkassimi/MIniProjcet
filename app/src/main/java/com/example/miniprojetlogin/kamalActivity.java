package com.example.miniprojetlogin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class kamalActivity extends AppCompatActivity {
    static List<data> listdata = new ArrayList<>();
    RecyclerView recyclerView;
    Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        recyclerView = findViewById(R.id.per_rec);

        Toolbar toolbar = findViewById(R.id.per_bar);
        btn = findViewById(R.id.add_taks);
        setSupportActionBar(toolbar);
        MyAdapdare  adapter = new MyAdapdare(listdata);
        recyclerView.setAdapter(adapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kamalActivity.this,New_task.class);
                 startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         int itemId = item.getItemId();
        if ( itemId == R.id.icon_filter) {
            Toast.makeText(this, "selection filter ", Toast.LENGTH_SHORT).show();
            return true;
        }
        if ( itemId == R.id.retune) {
            Intent intentretune= new Intent(this,MainActivity.class);
            startActivity(intentretune);
            Toast.makeText(this, "selection filter ", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (itemId == R.id.icon_delete){
            for (int i=0;i<listdata.size();i++){
                if (listdata.get(i).isCheck()){
                    listdata.remove(i);
                }
            }
            MyAdapdare  adapter = new MyAdapdare(listdata);
            recyclerView.setAdapter(adapter);
            Toast.makeText(this,"Delete element",Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


