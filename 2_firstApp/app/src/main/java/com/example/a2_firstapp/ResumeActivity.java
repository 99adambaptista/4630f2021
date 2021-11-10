package com.example.a2_firstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResumeActivity {
    private Button button;

    protected void onCreate(Bundle savedInstanceState) {
        button = button.findViewById(R.id.homePage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
