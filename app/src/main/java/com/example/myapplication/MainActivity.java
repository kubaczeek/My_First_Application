package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.sql.Timestamp;

public class MainActivity extends AppCompatActivity {
    private static final String toLog = "MainActivity";
    String firstNameString = null;
    String lastNameString = null;
    String cityString = null;
    String emailString = null;
    String phoneNumberString = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendBtn = findViewById(R.id.sendBtn);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }

    private void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        TextView firstName = findViewById(R.id.FirstName);
        TextView lastName = findViewById(R.id.LastName);
        TextView city = findViewById(R.id.City);
        TextView email = findViewById(R.id.Email);
        TextView phoneNumber = findViewById(R.id.Phone);
        firstNameString = firstName.getText().toString();
        lastNameString = lastName.getText().toString();
        cityString = city.getText().toString();
        emailString = email.getText().toString();
        phoneNumberString = phoneNumber.getText().toString();

        Person person1 = new Person(firstNameString, lastNameString, cityString, emailString, phoneNumberString);
        intent.putExtra("person", person1);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(toLog, getTimestamp() + " onStart");

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(toLog, getTimestamp() + " onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(toLog, getTimestamp() + " onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(toLog, getTimestamp() + " onDestroy");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(toLog, getTimestamp() + " onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(toLog, getTimestamp() + " onPause");

    }

    public String getTimestamp() {
        Long ts = System.currentTimeMillis()/1000;
        return ts.toString();
    }
}