package com.job.anthologyweddingphotographyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    public static final String IMEXTRA = "IMEXTRA";
    private ImagesAdapter imagesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        GridView gridView = (GridView)findViewById(R.id.gridview);

        imagesAdapter = new ImagesAdapter(this,addData());
        gridView.setAdapter(imagesAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                WeddingImage[] images = addData();
                WeddingImage  weddingImage = images[i]; //position of image

                //intent to photo detail activity
                Intent intent = new Intent(MainActivity.this,PhotoDetail.class);
                intent.putExtra(IMEXTRA,weddingImage);
                startActivity(intent);
            }
        });
    }

    private WeddingImage[] addData(){

        WeddingImage[] weddingImages = {
                new WeddingImage("1",R.drawable.im1),
                new WeddingImage("2",R.drawable.im2),
                new WeddingImage("3",R.drawable.im3),
                new WeddingImage("4",R.drawable.im4),
                new WeddingImage("5",R.drawable.im5),
                new WeddingImage("6",R.drawable.im6),
                new WeddingImage("7",R.drawable.im7),
                new WeddingImage("8",R.drawable.im8),
                new WeddingImage("9",R.drawable.im9),
                new WeddingImage("10",R.drawable.im10)
        };

        return weddingImages;
    }
}
