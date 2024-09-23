package com.example.a1practoz17;

import android.os.Bundle;

import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class FrameAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.animation_list);

        AnimationDrawable frameAnimation = (AnimationDrawable) imageView.getBackground();

        // Запуск анимации
        imageView.post(frameAnimation::start);
    }
}