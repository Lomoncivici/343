package com.example.pract12;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class FrameAnimationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        // Найдите ImageView в макете
        ImageView imageView = findViewById(R.id.image_frame_animation);

        // Установите фоновое изображение в виде AnimationDrawable
        imageView.setBackgroundResource(R.drawable.animation_list);

        // Получите AnimationDrawable из ImageView
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();

        // Запустите анимацию
        animationDrawable.start();
    }
}