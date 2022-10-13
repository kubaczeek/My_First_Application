package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    Person person = new Person();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent i = getIntent();
        person = (Person) i.getSerializableExtra("person");

        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        String city = person.getCity();
        String email = person.getEmail();
        String phone = person.getPhoneNumber();

        TextView FirstName = (TextView) findViewById(R.id.FirstName);
        TextView LastName = (TextView) findViewById(R.id.LastName);
        TextView City = (TextView) findViewById(R.id.City);
        TextView Email = (TextView) findViewById(R.id.Email);
        TextView Phone = (TextView) findViewById(R.id.Phone);

        FirstName.setText(firstName);
        LastName.setText(lastName);
        City.setText(city);
        Email.setText(email);
        Phone.setText(phone);

        Button sendBtn = findViewById(R.id.backBtn);
        Button submitBtn = findViewById(R.id.submitBtn);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle extras = getIntent().getExtras();
                openMainActivity();
            }
        });
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle extras = getIntent().getExtras();
                openLastActivity();
            }
        });

    }

    private void openLastActivity() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}