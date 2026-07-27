package com.skechers.mobile.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.skechers.mobile.R;


public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);


        TextView logo = findViewById(R.id.txtLogo);

        Animation animation =
                AnimationUtils.loadAnimation(
                        this,
                        R.anim.fade_in
                );


        logo.startAnimation(animation);



        new Handler(Looper.getMainLooper()).postDelayed(() -> {


            Intent intent =
                    new Intent(
                            SplashActivity.this,
                            LoginActivity.class
                    );


            startActivity(intent);
            overridePendingTransition(
                    R.anim.fade_in,
                    R.anim.fade_out
            );

            finish();


        },1700);


    }
}