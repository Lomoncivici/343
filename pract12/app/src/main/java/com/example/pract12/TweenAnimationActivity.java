package com.example.pract12;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class TweenAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        ImageView imageView = findViewById(R.id.image_tween_animation);

        // Загружаем и запускаем мерцающую анимацию
        Animation fadeAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in_out);
        imageView.startAnimation(fadeAnimation);
    }
}