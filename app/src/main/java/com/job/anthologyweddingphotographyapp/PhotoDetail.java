package com.job.anthologyweddingphotographyapp;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import static com.job.anthologyweddingphotographyapp.MainActivity.IMEXTRA;

public class PhotoDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_detail);

        //init
        ImageView imageView = findViewById(R.id.photo_im);

        WeddingImage image = (WeddingImage) getIntent().getParcelableExtra(IMEXTRA);

        imageView.setImageDrawable(ContextCompat.getDrawable(this,image.getImgRes()));

    }
}
