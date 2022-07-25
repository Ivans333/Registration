package com.example.registration;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ArrayList<EditText> fields = new ArrayList<>();

    public void submit (View view){
    //adding Edit text objects to one Arraylist
        fields.add(findViewById(R.id.editTextTextPersonName2));
        fields.add(findViewById(R.id.editTextTextPassword));
        fields.add(findViewById(R.id.editTextTextEmailAddress));
        fields.add(findViewById(R.id.editTextPhone2));
        fields.add(findViewById(R.id.editTextTextPersonCity));

    //Assigning texfield list
        TextView sUsername = findViewById(R.id.sUsername);
        TextView sPassword = findViewById(R.id.sPassword);
        TextView sEmail = findViewById(R.id.sEmail);
        TextView sCity = findViewById(R.id.sCity);
        TextView sPhone = findViewById(R.id.sPhone);

    //Giving values after submitting
        sUsername.setText("Username: " + fields.get(0).getText().toString());
        sPassword.setText("Passwords: " + fields.get(1).getText().toString());
        sEmail.setText("Email: " + fields.get(2).getText().toString());
        sPhone.setText("Phone#: " + fields.get(3).getText().toString());
        sCity.setText("City: " + fields.get(4).getText().toString());

    //Resetting values for input fields
        for (EditText e: fields){
            e.setText("");
        }




    }



}