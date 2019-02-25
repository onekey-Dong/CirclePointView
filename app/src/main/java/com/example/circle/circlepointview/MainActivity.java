package com.example.circle.circlepointview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.circle.circlepointview.widget.CirclePointView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContainer = findViewById(R.id.testContentOne);

        final CirclePointView one = (CirclePointView) mContainer.getChildAt(0);
        final CirclePointView three = (CirclePointView) mContainer.getChildAt(2);

        mContainer.postDelayed(new Runnable() {
            @Override
            public void run() {
                //one.setEmptyCircleWid(3f);
                one.setCircleColor(Color.RED);
                one.setEmptyCircleWid(3f);

                three.setCircleColor(Color.GREEN);
                three.setSolidCircle();
            }
        }, 1000);
    }
}
