package com.android.updatesInMedicine;

import android.app.ListActivity;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.AsyncTask;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.android.androidrssfeedtutorial.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class SubjectsList extends ListActivity {
    ArrayList<HashMap<String, String>> subjectItemList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects_list);

        new SubjectsList.LoadRSSFeedItems().execute("");

        ListView lv = getListView();

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent in = new Intent(getApplicationContext(), JournalListActivity.class);
                String subject = ((TextView) view.findViewById(R.id.subject)).getText().toString().trim();
                in.putExtra("subject", subject);
                startActivity(in);
            }
        });
    }

    public class LoadRSSFeedItems extends AsyncTask<String, String, String> {



        @Override
        protected String doInBackground(String... args) {


            final ArrayList<String> itemList=new ArrayList<>();
            itemList.add("🔴 Anesthesia & Pain");
            itemList.add("🔴 Cardiology");
            itemList.add("🔴 Critical Care");
            itemList.add("🔴 Dermatology");
            itemList.add("🔴 Emergency Medicine");
            itemList.add("🔴 Emergency Medicine");
            itemList.add("🔴 Endocrinology & Diabetes");
            itemList.add("🔴 Gastroenterology & Hepatology");
            itemList.add("🔴 Gynecology and Obstetrics");
            itemList.add("🔴 Hematology");
            itemList.add("🔴 Infectious Diseases");
            itemList.add("🔴 Nephrology");
            itemList.add("🔴 Neurology");
            itemList.add("🔴 Oncology");
            itemList.add("🔴 Pediatrics");
            itemList.add("🔴 Psychiatry");
            itemList.add("🔴 Public Health");
            itemList.add("🔴 Pulmonology");
            itemList.add("🔴 Radiology & Medical Imaging");
            itemList.add("🔴 Rheumatology");
            itemList.add("🔴 Surgery");



            // updating UI from Background Thread
            runOnUiThread(new Runnable() {
                public void run() {
                    for (String item : itemList) {
                    HashMap<String, String> map = new HashMap<String, String>();

                         map.put("subject",item);
                        subjectItemList.add(map);
                    }

                    ListAdapter adapter = new SimpleAdapter(
                            SubjectsList.this,
                            subjectItemList, R.layout.subject_item_list_row,
                            new String[]{"subject"},
                            new int[]{R.id.subject});

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