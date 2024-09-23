package com.example.pract12;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Анимация при появлении элементов на экране
        Animation buttonAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Button buttonFrame = findViewById(R.id.button_frame_animation);
        Button buttonTween = findViewById(R.id.button_tween_animation);
        buttonFrame.startAnimation(buttonAnimation);
        buttonTween.startAnimation(buttonAnimation);

        // Переход на вторую Activity с Frame Animation
        buttonFrame.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FrameAnimationActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });

        // Переход на третью Activity с Tween Animation
        buttonTween.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TweenAnimationActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        });
    }
}