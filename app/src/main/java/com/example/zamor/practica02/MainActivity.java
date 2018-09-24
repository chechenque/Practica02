package com.example.zamor.practica02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button ver;
    private Button agrega;
    private static ArrayList<String> nombres;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ver = (Button)findViewById(R.id.ver);
        agrega = (Button)findViewById(R.id.agrega);
        agrega.setOnClickListener(this);
        ver.setOnClickListener(this);
        editText = (EditText)findViewById(R.id.editText);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.agrega:
                agregaLista();
                break;
            case R.id.ver:
                Intent intent = new Intent(this,SecondActivity.class);
                intent.putStringArrayListExtra("Arreglo", (ArrayList<String>) nombres);
                startActivity(intent);
                break;
        }
    }

    public void agregaLista(){
        nombres.add(""+editText.getText());
    }
}
