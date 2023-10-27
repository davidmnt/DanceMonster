package com.example.dancemonster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView like = findViewById(R.id.like);
        ImageView diLike = findViewById(R.id.disLike);
        ImageView favorite = findViewById(R.id.favorito);
        TextView viewLike = findViewById(R.id.contLike);
        TextView viewDiLike = findViewById(R.id.contDisLike);
        TextView viewFavorite = findViewById(R.id.contFavorite);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int likeInt = 0;
                int contLike = 0;
                contLike++;
                int resultInt = 0;
                String likeString = viewLike.getText().toString();
                if(!likeString.isEmpty()){
                     likeInt = Integer.parseInt(likeString);
                }
                 resultInt = likeInt+contLike;
                String resultString = "" + resultInt;
                viewLike.setText(resultString);

            }
        });

        diLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int disLikeInt = 0;
                int contLike = 0;
                contLike++;
                int resultInt = 0;
                String disLikeString = viewDiLike.getText().toString();
                if(!disLikeString.isEmpty()){
                    disLikeInt = Integer.parseInt(disLikeString);
                }

                resultInt = disLikeInt+contLike;
                String resultString = "" + resultInt;
                viewDiLike.setText(resultString);

            }
        });

        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int favoriteInt = 0;
                int contFavorite = 0;
                contFavorite++;
                int resultInt = 0;
                String disLikeString = viewFavorite.getText().toString();
                if(!disLikeString.isEmpty()){
                    favoriteInt = Integer.parseInt(disLikeString);
                }

                resultInt = favoriteInt+contFavorite;
                String resultString = "" + resultInt;
                viewFavorite.setText(resultString);

            }
        });







    }
}