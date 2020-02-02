package com.example.xc.animation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button frame;
    private Button tweened;
    private Button property;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frame = findViewById(R.id.frame);
        tweened = findViewById(R.id.tweened);
        property = findViewById(R.id.property);

        frame.setOnClickListener(new myOnclick());
        tweened.setOnClickListener(new myOnclick());
        property.setOnClickListener(new myOnclick());
    }

    private class myOnclick implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
              switch (v.getId())
              {
                  case R.id.frame:
                      intent.setClass(MainActivity.this,FrameAnimationActivity.class);
                      break;
                  case R.id.tweened:
                      intent.setClass(MainActivity.this,TweenedActivity.class);
                      break;
                  case R.id.property:
                      intent.setClass(MainActivity.this,PropertyActivity.class);
                      break;
              }
              startActivity(intent);
        }
    }
}
