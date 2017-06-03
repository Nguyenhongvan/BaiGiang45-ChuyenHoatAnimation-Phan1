package com.vansuzy.baigiang45_chuyenhoatanimation_phan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btnXoayControl, btnXoayManHinh, btnXoay3s;
    Animation animation = null;
    Animation animationXoayManHinh = null;
    Animation animationXoayNguoc3sRoiTat = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        btnXoayControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.xoaycontrol);
                btnXoayControl.startAnimation(animation);
            }
        });
        btnXoayManHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout layoutManHinh = (LinearLayout) findViewById(R.id.layoutManHinh);
                animationXoayManHinh = AnimationUtils.loadAnimation(MainActivity.this, R.anim.xoaymanhinh);
                layoutManHinh.startAnimation(animationXoayManHinh);
            }
        });
        btnXoay3s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationXoayNguoc3sRoiTat = AnimationUtils.loadAnimation(MainActivity.this, R.anim.xoaynguoc3s);
                btnXoay3s.startAnimation(animationXoayNguoc3sRoiTat);
                animationXoayNguoc3sRoiTat.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        finish();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    private void addControls() {
        btnXoayControl = (Button) findViewById(R.id.btnXoayControl);
        btnXoayManHinh = (Button) findViewById(R.id.btnXoayManHinh);
        btnXoay3s = (Button) findViewById(R.id.btnXoay3s);
    }

}
