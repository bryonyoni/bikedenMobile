package com.bry.bikeden;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BikeActivity extends AppCompatActivity implements View.OnClickListener{
//    @Bind(R.id.bikeImageView) ImageView mImageLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        setContentView(R.layout.activity_bike);

//        mImageLabel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
//        if(v == mImageLabel){
//          Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("Harley Davidson"));
//        }
    }
}
