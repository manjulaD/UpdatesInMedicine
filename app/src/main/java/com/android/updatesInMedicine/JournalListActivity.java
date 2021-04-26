package com.android.updatesInMedicine;

import android.app.ListActivity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.android.androidrssfeedtutorial.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JournalListActivity extends ListActivity {
    ArrayList<HashMap<String, String>> journalItemList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal_list);


        final String subject = getIntent().getStringExtra("subject");
        setTitle("Journals : "+subject.substring(2));
        new JournalListActivity.LoadRSSFeedItems().execute(subject);

        ListView lv = getListView();

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent in = new Intent(getApplicationContext(), BrowserActivity.class);
                String journal = ((TextView) view.findViewById(R.id.journal)).getText().toString().trim();
                new GetJournalLink().execute(subject, journal);


            }
        });
    }

    public  class GetJournalLink extends AsyncTask<String, String, String> {



        @Override
        protected String doInBackground(final String... args) {
            Intent in = new Intent(getApplicationContext(), RSSFeedActivity.class);
            // String journal = ((TextView) view.findViewById(R.id.journal)).getText().toString().trim();
            // String link = new GetJournalLink().doInBackground(subject, journal);

            in.putExtra("rssLink",  AppDatabase.getDatabase(getApplicationContext()).subjectDao().getLink(args[0],args[1]));
            startActivity(in);

        return null;
        }

        protected void onPostExecute(String args) {
            // pDialog.setVisibility(View.GONE);
        }
    }

    public class LoadRSSFeedItems extends AsyncTask<String, String, String> {



        @Override
        protected String doInBackground(String... args) {
            final List<String> journals= AppDatabase.getDatabase(getApplicationContext()).subjectDao().getJournals(args[0]);
            // updating UI from Background Thread
            runOnUiThread(new Runnable() {
                public void run() {
                    for (String item : journals) {
                        HashMap<String, String> map = new HashMap<String, String>();

                        map.put("journal",item);
                        journalItemList.add(map);
                    }

                    ListAdapter adapter = new SimpleAdapter(
                            JournalListActivity.this,
                            journalItemList, R.layout.journals_items_list_row,
                            new String[]{"journal"},
                            new int[]{R.id.journal});

                    // updating listview
                    setListAdapter(adapter);
                }
            });
            return null;
        }

        protected void onPostExecute(String args) {
            // pDialog.setVisibility(View.GONE);
        }
    }
}