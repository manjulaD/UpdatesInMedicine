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
        setTitle("Updates in Medicine");
        Button btnRediff = findViewById(R.id.btnJournals);
        Button btnCinemaBlend = findViewById(R.id.btnNews);
        Button btnJournal = findViewById(R.id.buttonAbout);
        btnRediff.setOnClickListener(this);
        btnCinemaBlend.setOnClickListener(this);

        rssLinks.add("https://www.medscape.com/cx/rssfeeds/2700.xml");
        rssLinks.add("http://www.cinemablend.com/rss_review.php");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnJournals:
                startActivity(new Intent(MainActivity.this, JournalActivity.class).putExtra("rssLink", rssLinks.get(0)));
                break;

            case R.id.btnNews:
                startActivity(new Intent(MainActivity.this, NewsActivity.class).putExtra("rssLink", rssLinks.get(1)));
                break;

            case R.id.buttonAbout:
                startActivity(new Intent(MainActivity.this, AboutActivity.class).putExtra("rssLink", rssLinks.get(1)));
                break;

            case R.id.button2:
                startActivity(new Intent(MainActivity.this, JournalActivity.class).putExtra("rssLink", rssLinks.get(1)));
                break;
        }
    }
}
