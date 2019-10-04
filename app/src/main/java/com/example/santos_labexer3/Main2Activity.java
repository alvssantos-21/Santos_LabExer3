package com.example.santos_labexer3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2Activity extends AppCompatActivity {

    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Subjects Taken");
        cb1 = findViewById(R.id.checkBox);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);
        cb4 = findViewById(R.id.checkBox4);
        cb5 = findViewById(R.id.checkBox5);
        cb6 = findViewById(R.id.checkBox6);
        cb7 = findViewById(R.id.checkBox7);
        cb8 = findViewById(R.id.checkBox8);

        FileInputStream reader = null;
        String data = "";
        try {
            reader = openFileInput("data1.txt");
            int token;

            while ((token = reader.read()) != -1) {
                data = data + (char) token;
            }
            String[] tokens = data.split(",");
            cb1.setText(tokens[0]);
            cb2.setText(tokens[1]);
            cb3.setText(tokens[2]);
            cb4.setText(tokens[3]);
            cb5.setText(tokens[4]);
            cb6.setText(tokens[5]);
            cb7.setText(tokens[6]);
            cb8.setText(tokens[7]);


        } catch (FileNotFoundException e) {
            Log.d("Error", "File not found...");
        } catch (IOException e) {
            Log.d("Error", "IO Error");
        }

        Toast.makeText(this, data, Toast.LENGTH_LONG).show();

    }
    public void confirmed(View v){
        String data ="";
        String add = "";
        if (cb1.isChecked()== true){
            add = cb1.getText().toString();
            data = data +", "+ add;
        }else {}

        if (cb2.isChecked()== true){
            add = cb2.getText().toString();
            data = data +", "+ add;
        }else{}
        if (cb3.isChecked()== true){
            add = cb3.getText().toString();
            data = data +", "+ add;
        }else{}
        if (cb4.isChecked()== true){
            add = cb4.getText().toString();
            data = data +", "+ add;
        }else{}
        if (cb5.isChecked()== true){
            add = cb5.getText().toString();
            data = data +", "+ add;
        }else{}
        if (cb6.isChecked()== true){
            add = cb6.getText().toString();
            data = data +", "+ add;
        }else{}
        if (cb7.isChecked()== true){
            add = cb7.getText().toString();
            data = data +", "+ add;
        }else{}
        if (cb8.isChecked()== true){
            add = cb8.getText().toString();
            data = data +", "+ add;
        }else{}

        Toast.makeText(this, "Courses Taken " + data+ "...", Toast.LENGTH_LONG).show();
    }
}
