package com.android.updatesInMedicine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

import com.android.androidrssfeedtutorial.R;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity {
    ArrayList<String> rssLinks = new ArrayList<>();
    ArrayList<String> type = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setTitle("News");
        GridLayout gridLayout = (GridLayout) findViewById(R.id.mainGrid);

        setSingleEvent(gridLayout);





        rssLinks.add("https://www.medscape.com/cx/rssfeeds/2700.xml");
        rssLinks.add("https://www.who.int/rss-feeds/news-english.xml");
        rssLinks.add("https://www.fda.gov/about-fda/contact-fda/stay-informed/rss-feeds/press-releases/rss.xml");
      //  rssLinks.add("https://www.medicinenet.com/rss/dailyhealth.xml");
        rssLinks.add("https://tools.cdc.gov/api/v2/resources/media/132608.rss");


        type.add("Medscape News");
        type.add("WHO News");
        type.add("FDA Press Release");
        type.add("CDC News");


    }

    // we are setting onClickListener for each element
    private void setSingleEvent(GridLayout gridLayout) {
        for(int i = 0; i<gridLayout.getChildCount();i++){
            CardView cardView=(CardView)gridLayout.getChildAt(i);
            final int finalI= i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(NewsActivity.this, RSSFeedActivity.class)
                            .putExtra("rssLink", rssLinks.get(finalI))
                            .putExtra("type",type.get(finalI))
                    );


                }
            });
        }
    }
}