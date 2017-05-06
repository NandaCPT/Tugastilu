package com.example.lenovo.tugastilu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class TopMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void onClickMenu1(View v){
        Intent i = new Intent(this,MenuA.class);
        startActivity(i); // Pindah Intent
    }
    public void onClickMenu2(View v){
        Intent i = new Intent(this,MenuB.class);
        startActivity(i); // Pindah Intent
    }
    public void onClickMenu3(View v){
        Intent i = new Intent(this,MenuC.class);
        startActivity(i); // Pindah Intent
    }
    public void onClickMenu4(View v){
        Intent i = new Intent(this,MenuD.class);
        startActivity(i); // Pindah Intent
    }
    public void onClickMenu5(View v){
        Intent i = new Intent(this,MenuE.class);
        startActivity(i); // Pindah Intent
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){ //Bila menekan tombol back maka akan kembali ke MainActivity.xml
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

}
