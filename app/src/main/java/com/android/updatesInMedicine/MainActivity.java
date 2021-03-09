package com.android.updatesInMedicine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.androidrssfeedtutorial.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ArrayList<String> rssLinks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRediff = findViewById(R.id.btnRediff);
        Button btnCinemaBlend = findViewById(R.id.btnCinemaBlend);
        Button btnJournal = findViewById(R.id.button);
        btnRediff.setOnClickListener(this);
        btnCinemaBlend.setOnClickListener(this);

        rssLinks.add("https://www.medscape.com/cx/rssfeeds/2700.xml");
        rssLinks.add("http://www.cinemablend.com/rss_review.php");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnRediff:
                startActivity(new Intent(MainActivity.this, JournalActivity.class).putExtra("rssLink", rssLinks.get(0)));
                break;

            case R.id.btnCinemaBlend:
                startActivity(new Intent(MainActivity.this, NewsActivity.class).putExtra("rssLink", rssLinks.get(1)));
                break;

            case R.id.button:
                startActivity(new Intent(MainActivity.this, JournalActivity.class).putExtra("rssLink", rssLinks.get(1)));
                break;
        }
    }
}
