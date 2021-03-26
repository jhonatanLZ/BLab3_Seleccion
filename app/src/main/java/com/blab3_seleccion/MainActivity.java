package com.blab3_seleccion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MostrarCheckBox(View view){
        Intent intent=new Intent(MainActivity.this, Check.class);
        startActivity(intent);
    }
    public void MostrarRadio(View view){
        Intent intent=new Intent(MainActivity.this, Radio.class);
        startActivity(intent);

    }
    public void MostrarSpinner(View view){
        Intent intent=new Intent(MainActivity.this, SpinnerControl.class);
        startActivity(intent);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       // getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }



}