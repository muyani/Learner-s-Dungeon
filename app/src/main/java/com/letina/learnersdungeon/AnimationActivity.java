package com.letina.learnersdungeon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {
    ImageView imageViewForAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        imageViewForAnimation = findViewById(R.id.profilePic);
    }

    public void zoom(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        imageViewForAnimation.startAnimation(animation);
    }

    public void move(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        imageViewForAnimation.startAnimation(animation);
    }

    public void fade(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        imageViewForAnimation.startAnimation(animation);
    }

    public void slide(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        imageViewForAnimation.startAnimation(animation);

    }

    public void clockwise(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
        imageViewForAnimation.startAnimation(animation);
    }

    public void blink(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        imageViewForAnimation.startAnimation(animation);
    }

    public void goBack(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}
