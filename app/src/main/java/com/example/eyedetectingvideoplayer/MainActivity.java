package com.example.eyedetectingvideoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {

    //initializing lookAtMe
    private LookAtMe lookAtMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // hiding/removing ActionBar
//        getSupportActionBar().hide();

        lookAtMe = findViewById(R.id.lookme);


        lookAtMe.init(this);
        lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.shortvideo));
       //lookAtMe.setVideoPath("https://youtu.be/XegkHPNOKeI"); // to use video from a url

        lookAtMe.start();
        lookAtMe.setLookMe();
    }
}