package com.example.santos_labexer3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText c1,c2,c3,c4,c5,c6,c7,c8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("IT Subject");

        c1 =findViewById(R.id.editText16);
        c2 =findViewById(R.id.editText11);
        c3 =findViewById(R.id.editText13);
        c4 =findViewById(R.id.editText12);
        c5 =findViewById(R.id.editText9);
        c6 =findViewById(R.id.editText15);
        c7 =findViewById(R.id.editText10);
        c8 =findViewById(R.id.editText14);
    }

    public void saveData(View v){
        String data1 = c1.getText().toString();
        String data2 = c2.getText().toString();
        String data3 = c3.getText().toString();
        String data4 = c4.getText().toString();
        String data5 = c5.getText().toString();
        String data6 = c6.getText().toString();
        String data7 = c7.getText().toString();
        String data8 = c8.getText().toString();

        String dataAll = data1 + "," + data2 + "," + data3 + "," + data4 + "," + data5 + "," +data6+ "," +data7+ "," +data8;

        String data = dataAll;
        /**/        FileOutputStream writer = null;
        try {
            writer = openFileOutput("data1.txt", MODE_PRIVATE);
            writer.write(data.getBytes());

        } catch (FileNotFoundException e) {
            Log.d("Error", "File not found...");
        }
        catch (IOException e){
            Log.d("Error", "IO Error");
        }
        finally{
            try {
                writer.close();
            } catch (IOException e) {
                Log.d("Error", "File not found...");
            }
            Toast.makeText(this, "data saved...", Toast.LENGTH_LONG).show();

        }

    }


    public void dispNext(View v){
        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(i);
    }
}
