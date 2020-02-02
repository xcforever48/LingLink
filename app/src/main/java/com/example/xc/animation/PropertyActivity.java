package com.example.xc.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class PropertyActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4,btn5,btn6;
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        iv = findViewById(R.id.iv);
        btn1.setOnClickListener(btnClick);
        btn2.setOnClickListener(btnClick);
        btn3.setOnClickListener(btnClick);
        btn4.setOnClickListener(btnClick);
        btn5.setOnClickListener(btnClick);
        btn6.setOnClickListener(btnClick);


    }

    public View.OnClickListener btnClick  = new View.OnClickListener() {
        String btnId = null;
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.btn_1:
                    btnId = "R.id.btn_1";
                    break;
                case R.id.btn_2:
                    btnId = "R.id.btn_2";
                    break;
                case R.id.btn_3:
                    btnId = "R.id.btn_3";
                    break;
                case R.id.btn_4:
                    btnId = "R.id.btn_4";
                    break;
                case R.id.btn_5:
                    btnId = "R.id.btn_5";
                    break;
                case R.id.btn_6:
                    btnId = "R.id.btn_6";
                    break;
            }
            initAnimation(btnId);
        }
    };

    private void initAnimation(String btnId) {

        float currentX = iv.getTranslationX();
        float currentY = iv.getTranslationY();
        switch (btnId)
        {
            case "R.id.btn_1"://伸展
                ObjectAnimator oaS = ObjectAnimator.ofFloat(iv,"scaleX",1f,3f,1f);
                oaS.setDuration(5000);
                oaS.setInterpolator(new OvershootInterpolator());
                oaS.start();
                break;
            case "R.id.btn_2"://右平移
                ObjectAnimator oaTxT = ObjectAnimator.ofFloat(iv,"translationX",currentX,currentX +200);
//                ObjectAnimator oaTyT = ObjectAnimator.ofFloat(iv,"translationY",currentY,currentY +200);
//                AnimatorSet as = new AnimatorSet();
//                as.setDuration(4000);
//                as.setInterpolator(new BounceInterpolator());
//                as.playTogether(oaTxT,oaTyT);
//                as.start();
                oaTxT.setDuration(4000);
                oaTxT.setInterpolator(new BounceInterpolator());
                oaTxT.start();
                break;
            case "R.id.btn_3"://透明
//                ObjectAnimator oaTx = ObjectAnimator.ofFloat(iv,"translationX",currentX,currentX-200);
//                ObjectAnimator oaTy = ObjectAnimator.ofFloat(iv,"translationY",currentY,currentY-200);
//                AnimatorSet animatorSet = new AnimatorSet();
//                animatorSet.setDuration(4000);
//                animatorSet.setInterpolator(new BounceInterpolator());
//                animatorSet.playTogether(oaTx,oaTy);
//                animatorSet.start();
                ObjectAnimator animator = ObjectAnimator.ofFloat(iv, "alpha", 1f, 0f, 1f);
                animator.setDuration(5000);
                animator.start();
                break;
            case "R.id.btn_4"://旋转
                ObjectAnimator oaRotation  =  ObjectAnimator.ofFloat(iv,"rotation",0,180,0);
                oaRotation.setDuration(2000);
                iv.setPivotX(iv.getWidth()/2);
                iv.setPivotY(iv.getHeight());
                oaRotation.start();
                break;
            case "R.id.btn_5":
                ObjectAnimator oaTxT2 = ObjectAnimator.ofFloat(iv,"translationX",currentX,currentX +200);
                ObjectAnimator oaTyT2 = ObjectAnimator.ofFloat(iv,"translationY",currentY,currentY +200);
                AnimatorSet as = new AnimatorSet();
                as.setDuration(4000);
                as.setInterpolator(new BounceInterpolator());
                as.playTogether(oaTxT2,oaTyT2);
                as.start();
                break;
            case "R.id.btn_6":
                ObjectAnimator oaTx = ObjectAnimator.ofFloat(iv,"translationX",currentX,currentX-200);
                ObjectAnimator oaTy = ObjectAnimator.ofFloat(iv,"translationY",currentY,currentY-200);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(4000);
                animatorSet.setInterpolator(new BounceInterpolator());
                animatorSet.play(oaTx).after(oaTy);
                animatorSet.start();
                break;
            case "R.id.btn_7":

                break;
            case "R.id.btn_8":

                break;
        }

    }

    class animatorListen implements Animator.AnimatorListener
    {

        //动画开始
        @Override
        public void onAnimationStart(Animator animation) {

        }

        //动画结束
        @Override
        public void onAnimationEnd(Animator animation) {

        }

        //动画取消
        @Override
        public void onAnimationCancel(Animator animation) {

        }

        //动画重复
        @Override
        public void onAnimationRepeat(Animator animation) {

        }
    }

    class  myAnimatorListen implements ValueAnimator.AnimatorUpdateListener
    {

        //每播放一帧，onAnimationUpdate就会被调用一次。
        @Override
        public void onAnimationUpdate(ValueAnimator animation) {

        }
    }
}
