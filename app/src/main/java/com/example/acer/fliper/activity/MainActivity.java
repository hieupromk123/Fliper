package com.example.acer.fliper.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.acer.fliper.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewFlipper viewfliper;
    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        ActionViewFliper();
    }

    private void ActionViewFliper() {
        ArrayList<String> mangquangcao = new ArrayList<>();
        mangquangcao.add("http://www.pcworld.com.vn/files/articles/2015/1238315/01-flickr-large.jpg");
        mangquangcao.add("http://www.pcworld.com.vn/files/articles/2015/1238315/01-flickr-large.jpg");
        mangquangcao.add("http://www.pcworld.com.vn/files/articles/2015/1238315/01-flickr-large.jpg");
        mangquangcao.add("http://www.pcworld.com.vn/files/articles/2015/1238315/01-flickr-large.jpg");
        for (int i =0;i<mangquangcao.size();i++){
            ImageView imageView = new ImageView(getApplicationContext());
            Picasso.with(getApplicationContext()).load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewfliper.addView(imageView);

        }
        viewfliper.setFlipInterval(5000);
        viewfliper.setAutoStart(true);
        Animation animation_slide_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_right);
        Animation animation_slide_out = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_out_right);
        viewfliper.setInAnimation(animation_slide_in);
        viewfliper.setOutAnimation(animation_slide_out);
    }


    private void Anhxa() {
        viewfliper = (ViewFlipper) findViewById(R.id.viewfliper);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);

    }
}
