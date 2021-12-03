package com.example.projectdraft;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity {
    DatabaseHelper mDatabaseHelper;
    private Button save_profile;
    private EditText userName, userAge, userWeight, userCombatSport, userExperience, userLocation;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        userName = (EditText) findViewById(R.id.userName);
        userAge = (EditText) findViewById(R.id.userAge);
        userWeight = (EditText) findViewById(R.id.userWeight);
        userCombatSport = (EditText) findViewById(R.id.userCombatSport);
        userExperience = (EditText) findViewById(R.id.userExperience);
        userLocation = (EditText) findViewById(R.id.userLocation);
        save_profile = (Button) findViewById(R.id.save_profile);
        mDatabaseHelper = new DatabaseHelper(this);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        save_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _userName = userName.getText().toString();
                String _userAge = userAge.getText().toString();
                String _userWeight = userWeight.getText().toString();
                String _userCombatSport = userCombatSport.getText().toString();
                String _userExperience = userExperience.getText().toString();
                String _userLocation = userLocation.getText().toString();
                if (_userName.length() != 0) {
                    //AddData(_userName);
                } else {
                    toastMessage("You must enter a name!");
                }
                if (_userAge.length() != 0) {
                    //AddData(_userAge);
                } else {
                    toastMessage("You must enter an age!");
                }
                if (_userWeight.length() != 0) {
                    //AddData(_userWeight);
                } else {
                    toastMessage("You must enter your weight!");
                }
                if (_userCombatSport.length() != 0) {
                    //AddData(_userCombatSport);
                } else {
                    toastMessage("You must enter your combat sport!");
                }
                if (_userExperience.length() != 0) {
                    //AddData(_userExperience);
                } else {
                    toastMessage("You must enter your experience!");
                }
                if (_userLocation.length() != 0) {
                    //AddData(_userLocation);
                } else {
                    toastMessage("You must enter your location!");
                }

            }
        });
    }
    /*public void AddData(String newEntry) {
        boolean insertData = mDatabaseHelper.addData(newEntry);
    }*/

    private void toastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}