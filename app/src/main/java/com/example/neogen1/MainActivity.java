package com.example.neogen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt1, txt2, txt3;
    ImageView img;
    Animation animation, animation1;
    private ProgressBar loadingProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.text1);
        txt2 = findViewById(R.id.text2);
        txt3 = findViewById(R.id.text3);
        img = findViewById(R.id.logo);
        loadingProgressBar = findViewById(R.id.loadingProgressBar);


        animation = AnimationUtils.loadAnimation(this, R.anim.animation);
        animation1 = AnimationUtils.loadAnimation(this, R.anim.logo_animation);

        txt1.setAnimation(animation);
        txt2.setAnimation(animation);
        txt3.setAnimation(animation);
        img.setAnimation(animation1);

        animation1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                loadingProgressBar.setVisibility(ProgressBar.VISIBLE);
                navigateToNextScreen();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
    }

    private void navigateToNextScreen() {
        new Handler().postDelayed(() -> {
            startActivity(new Intent(MainActivity.this, MainActivity2.class));
            finish();
        }, 2500);

    }
}