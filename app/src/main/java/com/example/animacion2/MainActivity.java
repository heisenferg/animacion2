package com.example.animacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView meteorito = findViewById(R.id.mete);
        meteorito.setVisibility(ImageView.VISIBLE);
        Animation meteortionAmin = AnimationUtils.loadAnimation(this, R.anim.meteorito);
        meteorito.startAnimation(meteortionAmin);
    }
}