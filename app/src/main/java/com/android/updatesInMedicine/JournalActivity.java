package com.android.updatesInMedicine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

import com.android.androidrssfeedtutorial.R;

import java.util.ArrayList;


public class JournalActivity extends AppCompatActivity {

    ArrayList<String> rssLinks = new ArrayList<>();
    ArrayList<String> type = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);
        setTitle("Journals");
        GridLayout gridLayout = (GridLayout) findViewById(R.id.mainGrid);

        setSingleEvent(gridLayout);
        rssLinks.add("http://www.thelancet.com/rssfeed/lancet_online.xml");
        rssLinks.add("https://www.nejm.org/action/showFeed?jc=nejm&type=etoc&feed=rss");
        rssLinks.add("http://feeds.bmj.com/bmj/recent");
        rssLinks.add("https://jamanetwork.com/rss/site_3/onlineFirst_67.xml");

        type.add("The Lacent");
        type.add("New England Journal of Medicine");
        type.add("British Medical Journal");
        type.add("JAMA");


    }

    // we are setting onClickListener for each element
    private void setSingleEvent(GridLayout gridLayout) {
        for(int i = 0; i<gridLayout.getChildCount();i++){
            CardView cardView=(CardView)gridLayout.getChildAt(i);
            final int finalI= i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(JournalActivity.this, RSSFeedActivity.class)
                            .putExtra("rssLink", rssLinks.get(finalI))
                            .putExtra("type",type.get(finalI))
                    );


                }
            });
        }
    }
}