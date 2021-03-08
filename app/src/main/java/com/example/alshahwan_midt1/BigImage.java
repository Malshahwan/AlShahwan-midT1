package com.example.fahd_midtermmock;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class BigImage extends AppCompatActivity {

    MediaPlayer mpanimalsound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_image);

        mpanimalsound = new MediaPlayer();

        mpanimalsound = MediaPlayer.create(this, R.raw.track2);
        mpanimalsound.start();

    }
}