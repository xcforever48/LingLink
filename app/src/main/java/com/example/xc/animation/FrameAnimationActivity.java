package com.example.xc.animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameAnimationActivity extends AppCompatActivity {

    private ImageView img;
    private AnimationDrawable animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);
        img = (ImageView) findViewById(R.id.img);
        animation = (AnimationDrawable) img.getBackground();

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(animation.isRunning())
                    animation.stop();
                else
                    animation.start();

            }
        });
    }
}
