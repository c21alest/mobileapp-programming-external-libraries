package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "==>";

    private Button funny;
    private Button happy;
    private TextView funnyCop;
    private TextView happyCop;
    private ImageView imageView;
    private String happyGif;
    private String funnyGif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        funny = findViewById(R.id.button_funny);
        funnyCop = findViewById(R.id.cop_funny);
        happy = findViewById(R.id.button_happy);
        happyCop = findViewById(R.id.cop_happy);

        funnyCop.setMovementMethod(LinkMovementMethod.getInstance());
        happyCop.setMovementMethod(LinkMovementMethod.getInstance());

        imageView = findViewById(R.id.imageView);

        happyGif = "https://media0.giphy.com/media/HuGCwDXj4nQnS/giphy.gif?cid=ecf05e47wd5hn2mf6y0fagb91gwjzkfgzf863g60snf1sm0x&rid=giphy.gif&ct=g";
        funnyGif = "https://media0.giphy.com/media/JQFZzvTP7XmPBmcSdH/giphy.gif?cid=790b76116badb48a643a409aa892787306317f8ecedd6f34&rid=giphy.gif&ct=g";

        funny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Funny");
                Glide.with(MainActivity.this).asGif().load(funnyGif).into(imageView);
            }
        });

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Happy");
                Glide.with(MainActivity.this).asGif().load(happyGif).into(imageView);
            }
        });

    }
}
