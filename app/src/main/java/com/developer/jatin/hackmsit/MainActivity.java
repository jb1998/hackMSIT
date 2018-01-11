package com.developer.jatin.hackmsit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.sunfusheng.marqueeview.MarqueeView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
//    ImageView left,right;
//    MarqueeView marqueeView;
   ImageButton click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();



         click=(ImageButton)findViewById(R.id.imageButton);
//        marqueeView=(MarqueeView)findViewById(R.id.marquee);
//        ArrayList<String> arr=new ArrayList<>();
//        arr.add("Glad..");
//        arr.add("You are here !!");
//        arr.add("Login Below");
//        marqueeView.startWithList(arr);

     click.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i = new Intent();
             i.setClass(MainActivity.this,Maintry.class);
             startActivity(i);
         }
     });

//        right=(ImageView)findViewById(R.id.right);
//        final ValueAnimator animator = ValueAnimator.ofFloat(0.0f, 1.0f);
//        animator.setRepeatCount(ValueAnimator.INFINITE);
//        animator.setInterpolator(new LinearInterpolator());
//        animator.setDuration(10000L);
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                final float progress = (float) animation.getAnimatedValue();
//                final float width = right.getWidth();
//                final float translationX = width * progress;
//                right.setTranslationX(translationX);
//                left.setTranslationX(translationX - width);
//            }
//        });
//        animator.start();
    }
}
