package com.example.benjaminaddai.soundgood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openArtistList(View view) {
        Intent intent = new Intent(this, Artist.class);
        startActivity(intent);
    }

    public void openAlbumList(View view) {
        Intent intent = new Intent(this, Album.class);
        startActivity(intent);
    }

    public void openSongsList(View view) {
        Intent intent = new Intent(this, Song.class);
        startActivity(intent);

    }

    public void openTopTenList(View view) {
        Intent intent = new Intent(this, TopTen.class);
        startActivity(intent);
    }

}

