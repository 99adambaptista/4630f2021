package com.example.a2_firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch aSwitch;
    ImageView imageView;
    TextView textView;

    private Button gotoWeather, gotoAboutMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Switch
        aSwitch = findViewById(R.id.switch2);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        //Button
        gotoWeather = findViewById(R.id.gotoWeatherButton);
        gotoAboutMe = findViewById(R.id.gotoAboutMe);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(aSwitch.isChecked()) {
                    imageView.setImageResource(R.drawable.background);
                    textView.setTextColor(getResources().getColor(R.color.red));
                } else {
                    imageView.setImageResource(R.drawable.black_background);
                    textView.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });

        gotoWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity();
            }
        });

        gotoAboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity();
            }
        });
    }

    private void changeActivity() {
        Intent intent = new Intent(this, WeatherActivity.class);
        startActivity(intent);
    }

}
