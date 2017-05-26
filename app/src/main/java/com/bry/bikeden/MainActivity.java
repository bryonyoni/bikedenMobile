package com.bry.bikeden;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.appNameTextView)  TextView mAppNameTextView;
    @Bind(R.id.bikesactivitybutton)  Button mBikesActivitybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface ostrichFont = Typeface.createFromAsset(getAssets(),"fonts/ostrichRegular.ttf");
        mAppNameTextView.setTypeface(ostrichFont);

        mBikesActivitybutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Bike.class);
                startActivity(intent);
            }
        });

    }




}
