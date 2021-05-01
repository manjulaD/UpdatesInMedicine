package com.android.updatesInMedicine;

import android.content.Intent;
import android.os.AsyncTask;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.android.androidrssfeedtutorial.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ArrayList<String> rssLinks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Updates in Medicine");
        Button btnRediff = findViewById(R.id.topJournals);
        Button btnCinemaBlend = findViewById(R.id.btnNews);
        Button btnJournal = findViewById(R.id.buttonAbout);
        btnRediff.setOnClickListener(this);
        btnCinemaBlend.setOnClickListener(this);

        rssLinks.add("https://www.medscape.com/cx/rssfeeds/2700.xml");
        rssLinks.add("http://www.cinemablend.com/rss_review.php");


        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                List<Subjects> subjects=new ArrayList<>();
                subjects.add( new Subjects(1,"🔴 Nephrology","1. Kidney International","http://www.kidney-international.org/current.rss"));
                subjects.add( new Subjects(2,"🔴 Nephrology","2. Journal of the American Society of Nephrology : JASN","https://jasn.asnjournals.org/rss/current.xml"));
                subjects.add( new Subjects(3,"🔴 Nephrology","3. Nature Reviews Nephrology","https://www.nature.com/nrneph.rss"));
                subjects.add( new Subjects(4,"🔴 Nephrology","4. Clinical Journal of the American Society of Nephrology","https://cjasn.asnjournals.org/rss/current.xml"));
                subjects.add( new Subjects(5,"🔴 Gastroenterology & Hepatology","1. Gut journal - BMJ","https://gut.bmj.com/rss/current.xml"));
                subjects.add( new Subjects(6,"🔴 Gastroenterology & Hepatology","2. Gastroenterology -AGA","https://www.gastrojournal.org/current.rss"));
                subjects.add( new Subjects(7,"🔴 Gastroenterology & Hepatology","3. The Lancet Gastroenterology & Hepatology","http://www.thelancet.com/rssfeed/langas_online.xml"));
                subjects.add( new Subjects(8,"🔴 Gastroenterology & Hepatology","4. Journal of Hepatology - EASL","https://www.journal-of-hepatology.eu/current.rss"));
                subjects.add( new Subjects(9,"🔴 Gastroenterology & Hepatology","5. NEJM Gastroenterology articles","https://search.nejm.org/search?cnt=20&start_month=3&start_year=2011&w=*&restrict=doctype%3Aarticle&srt=0&isort=date&ts=rss&af=topic:11"));
                subjects.add( new Subjects(10,"🔴 Anesthesia & Pain","1. British Journal of Anaesthesia (BJA)","https://bjanaesthesia.org/current.rss"));
                subjects.add( new Subjects(11,"🔴 Anesthesia & Pain","2. Anesthesiology - ASA","https://anesthesiology.pubs.asahq.org/rss/site_157/173.xml"));
                subjects.add( new Subjects(12,"🔴 Anesthesia & Pain","3. Pain - IASP","https://journals.lww.com/pain/_layouts/15/OAKS.Journals/feed.aspx?FeedType=PublishAheadofPrint&year=9900&issue=00000"));
                subjects.add( new Subjects(13,"🔴 Anesthesia & Pain","4. Anesthesiology News","https://www.anesthesiologynews.com/RSS/RSS.xml"));
                subjects.add( new Subjects(14,"🔴 Anesthesia & Pain","5. NEJM Anesthesia articles","https://search.nejm.org/search?cnt=20&start_month=4&start_year=2010&w=*&restrict=doctype%3Aarticle&srt=0&isort=date&ts=rss&af=topic:12"));
                subjects.add( new Subjects(15,"🔴 Anesthesia & Pain","6. Anesthesia and Analgesia - IARS","https://journals.lww.com/anesthesia-analgesia/_layouts/15/OAKS.Journals/feed.aspx?FeedType=PublishAheadofPrint&year=9900&issue=00000"));
                subjects.add( new Subjects(16,"🔴 Anesthesia & Pain","7.Regional Anesthesia and Pain Medicine - BMJ","https://rapm.bmj.com/rss/ahead.xml"));
                subjects.add( new Subjects(17,"🔴 Cardiology","1 European Heart Journal - ESC","https://academic.oup.com/rss/site_5375/3236.xml"));
                subjects.add( new Subjects(18,"🔴 Cardiology","2. Circulation - AHA","https://www.ahajournals.org/action/showFeed?type=etoc&feed=rss&jc=circ/ASA"));
                subjects.add( new Subjects(19,"🔴 Cardiology","3. Nature Reviews Cardiology"," http://feeds.nature.com/nrcardio/rss/current"));
                subjects.add( new Subjects(20,"🔴 Cardiology","4. European Journal of Heart Failure - ESC","https://onlinelibrary.wiley.com/action/showFeed?jc=18790844&type=etoc&feed=rss"));
                subjects.add( new Subjects(21,"🔴 Cardiology","5. NEJM Cardiology articles","https://search.nejm.org/search?cnt=20&start_month=5&start_year=2010&w=*&restrict=doctype%3Aarticle&srt=0&isort=date&ts=rss&af=topic:14"));
                subjects.add( new Subjects(22,"🔴 Cardiology","6. circulation research journal - AHA/ASA","https://www.ahajournals.org/action/showFeed?type=etoc&feed=rss&jc=res"));
                subjects.add( new Subjects(23,"🔴 Cardiology","7. JAMA Cardiology","https://jamanetwork.com/rss/site_192/184.xml"));
                subjects.add( new Subjects(24,"🔴 Cardiology","8. Journal of the American Heart Association","https://www.ahajournals.org/action/showFeed?type=etoc&feed=rss&jc=jaha"));
                subjects.add( new Subjects(25,"🔴 Critical Care","1. Critical Care Medicine - CCM Society","https://journals.lww.com/ccmjournal/_layouts/15/OAKS.Journals/feed.aspx?FeedType=PublishAheadofPrint&year=9000&issue=00000"));
                subjects.add( new Subjects(26,"🔴 Critical Care","2. Journal of Critical Care - WFSICCM","https://www.journals.elsevier.com/journal-of-critical-care/rss"));
                subjects.add( new Subjects(27,"🔴 Critical Care","3. Pediatric Critical Care Medicine","https://cdn.journals.lww.com/pccmjournal/_layouts/15/OAKS.Journals/feed.aspx?FeedType=PublishAheadofPrint&year=9000&issue=00000"));
                subjects.add( new Subjects(28,"🔴 Critical Care","4. American Journal of Respiratory and Critical Care Medicine","https://www.atsjournals.org/action/showFeed?type=etoc&feed=rss&jc=ajrccm"));
                subjects.add( new Subjects(29,"🔴 Critical Care","5. Annals of Intensive Care","https://annalsofintensivecare.springeropen.com/articles/most-recent/rss.xml"));
                subjects.add( new Subjects(30,"🔴 Critical Care","6. Intensive Care Medicine - ECICM","https://link.springer.com/search.rss?search-within=Journal&facet-journal-id=134&query="));
                subjects.add( new Subjects(31,"🔴 Dermatology","1.Journal of the American Academy of Dermatology","https://www.jaad.org/current.rss"));
                subjects.add( new Subjects(32,"🔴 Dermatology","2.British Journal of Dermatology","https://onlinelibrary.wiley.com/feed/13652133/most-recent"));
                subjects.add( new Subjects(33,"🔴 Dermatology","3. Journal of Investigative Dermatology","http://www.jidonline.org/current.rss"));
                subjects.add( new Subjects(34,"🔴 Dermatology","4. Journal of the European Academy of Dermatology and Venereology","https://onlinelibrary.wiley.com/feed/14683083/most-recent"));
                subjects.add( new Subjects(35,"🔴 Dermatology","5. JAMA Dermatology","https://jamanetwork.com/rss/site_12/onlineFirst_68.xml"));
                subjects.add( new Subjects(36,"🔴 Emergency Medicine","1. Resuscitation Journal - ERC","http://www.resuscitationjournal.com/current.rss"));
                subjects.add( new Subjects(37,"🔴 Emergency Medicine","2. Journal of Trauma and Acute Care Surgery - AAST","https://cdn.journals.lww.com/jtrauma/_layouts/15/OAKS.Journals/feed.aspx?FeedType=CurrentIssue"));
                subjects.add( new Subjects(38,"🔴 Emergency Medicine","3. Annals of Emergency Medicine - ACEP","http://rss.sciencedirect.com/publication/science/01960644"));
                subjects.add( new Subjects(39,"🔴 Emergency Medicine","4.Academic Emergency Medicine - SAEM","https://onlinelibrary.wiley.com/action/showFeed?jc=15532712&type=etoc&feed=rss"));
                subjects.add( new Subjects(40,"🔴 Emergency Medicine","5. The American Journal of Emergency Medicine","http://rss.sciencedirect.com/publication/science/07356757"));
                subjects.add( new Subjects(41,"🔴 Emergency Medicine","6. Clinical Toxicology Journal","https://www.tandfonline.com/feed/rss/ictx20"));
                subjects.add( new Subjects(42,"🔴 Emergency Medicine","7. Emergency Medicine Journal - RCEM","https://blogs.bmj.com/emj/feed/"));
                subjects.add( new Subjects(43,"🔴 Endocrinology & Diabetes","1. The Lancet Diabetes & Endocrinology","http://www.thelancet.com/rssfeed/landia_online.xml"));
                subjects.add( new Subjects(44,"🔴 Endocrinology & Diabetes","2. Diabetes Care Journal - ADA","https://care.diabetesjournals.org/rss/current.xml"));
                subjects.add( new Subjects(45,"🔴 Endocrinology & Diabetes","1. The Lancet Diabetes & Endocrinology","http://www.thelancet.com/rssfeed/landia_online.xml"));
                subjects.add( new Subjects(46,"🔴 Endocrinology & Diabetes","2. Diabetes Care Journal - ADA","https://care.diabetesjournals.org/rss/current.xml"));
                subjects.add( new Subjects(47,"🔴 Endocrinology & Diabetes","3. Nature Reviews Endocrinology","http://feeds.nature.com/nrendo/rss/current"));
                subjects.add( new Subjects(48,"🔴 Endocrinology & Diabetes","4. The Journal of Clinical Endocrinology & Metabolism - ES","https://academic.oup.com/rss/site_5591/3464.xml"));
                subjects.add( new Subjects(49,"🔴 Endocrinology & Diabetes","5. Diabetes Journal - ADA","https://diabetes.diabetesjournals.org/rss/ahead.xml"));
                subjects.add( new Subjects(50,"🔴 Gynecology and Obstetrics","1. Obstetrical & Gynecological Survey","https://journals.lww.com/obgynsurvey/_layouts/15/OAKS.Journals/feed.aspx?FeedType=CurrentIssue"));
                subjects.add( new Subjects(51,"🔴 Gynecology and Obstetrics","2. American Journal of Obstetrics & Gynecology","https://www.ajog.org/current.rss"));
                subjects.add( new Subjects(52,"🔴 Gynecology and Obstetrics","3. Obstetrics & Gynecology - ACOG ( The Green Journal)","https://journals.lww.com/greenjournal/_layouts/15/OAKS.Journals/feed.aspx?FeedType=PublishAheadofPrint&issue=00000&year=9900"));
                subjects.add( new Subjects(53,"🔴 Gynecology and Obstetrics","4. Human Reproduction Update (ESHRE)","https://academic.oup.com/rss/site_5286/advanceAccess_3152.xml"));
                subjects.add( new Subjects(54,"🔴 Gynecology and Obstetrics","5. BJOG:An International Journal of Obstetrics and Gynaecology ( RCOG )","https://obgyn.onlinelibrary.wiley.com/action/showFeed?jc=18793479&type=etoc&feed=rss"));
                subjects.add( new Subjects(55,"🔴 Hematology","1. Journal of Hematology & Oncology","https://jhoonline.biomedcentral.com/articles/most-recent/rss.xml"));
                subjects.add( new Subjects(56,"🔴 Hematology","2. Leukemia Journal","http://feeds.nature.com/leu/rss/current"));
                subjects.add( new Subjects(57,"🔴 Hematology","3. British Journal of Haematology(BSH)","https://onlinelibrary.wiley.com/feed/13652141/most-recent"));
                subjects.add( new Subjects(58,"🔴 Hematology","4. The Lancet Haematology","http://www.thelancet.com/rssfeed/lanhae_current.xml"));
                subjects.add( new Subjects(59,"🔴 Hematology","5. American Journal of Hematology","https://onlinelibrary.wiley.com/feed/10968652/most-recent"));
                subjects.add( new Subjects(60,"🔴 Hematology","6. NEJM Hematology articles","https://search.nejm.org/search?cnt=20&start_month=4&start_year=2011&w=*&restrict=doctype%3Aarticle&srt=0&isort=date&ts=rss&af=topic:2"));
                subjects.add( new Subjects(61,"🔴 Infectious Diseases","1. The Lancet Infectious Diseases","http://www.thelancet.com/rssfeed/laninf_online.xml"));
                subjects.add( new Subjects(62,"🔴 Infectious Diseases","2. The Lancet HIV","http://www.thelancet.com/rssfeed/lanhiv_online.xml"));
                subjects.add( new Subjects(63,"🔴 Infectious Diseases","3. Clinical Infectious Disease (IDSA)","https://academic.oup.com/rss/site_5269/advanceAccess_3135.xml"));
                subjects.add( new Subjects(64,"🔴 Infectious Diseases","4. Emerging Infectious Diseases Journal - CDC","https://wwwnc.cdc.gov/eid/rss/upcoming.xml"));
                subjects.add( new Subjects(65,"🔴 Infectious Diseases","5. The Journal of Infectious Diseases (IDSA)","https://academic.oup.com/rss/site_5309/advanceAccess_3175.xml"));
                subjects.add( new Subjects(66,"🔴 Infectious Diseases","6. Antimicrobial Agents and Chemotherapy Journal","https://aac.asm.org/rss/recent.xml"));
                subjects.add( new Subjects(67,"🔴 Infectious Diseases","7. NEJM Infectious Disease Articles","https://search.nejm.org/search?cnt=20&start_month=4&start_year=2011&w=*&restrict=doctype%3Aarticle&srt=0&isort=date&ts=rss&af=topic:18"));
                subjects.add( new Subjects(68,"🔴 Neurology","1. Neuron Journal","http://rss.sciencedirect.com/publication/science/08966273"));
                subjects.add( new Subjects(69,"🔴 Neurology","2. Nature Neuroscience Journal","http://feeds.nature.com/neuro/rss/current"));
                subjects.add( new Subjects(70,"🔴 Neurology","3. The Lancet Neurology","http://www.thelancet.com/rssfeed/laneur_online.xml"));
                subjects.add( new Subjects(71,"🔴 Neurology","4. JAMA Neurology","https://jamanetwork.com/rss/site_16/onlineFirst_72.xml"));
                subjects.add( new Subjects(72,"🔴 Neurology","5. Neurology Journal (AAN)","https://n.neurology.org/rss/recent.xml"));
                subjects.add( new Subjects(73,"🔴 Neurology","6. NeuroImage Journal","https://www.journals.elsevier.com/neuroimage/rss"));
                subjects.add( new Subjects(74,"🔴 Oncology","1. Journal of Clinical Oncology (ASCO)","https://ascopubs.org/action/showFeed?type=etoc&feed=rss&jc=jco"));
                subjects.add( new Subjects(75,"🔴 Oncology","2. The Lancet Oncology","http://www.thelancet.com/rssfeed/lanonc_online.xml"));
                subjects.add( new Subjects(76,"🔴 Oncology","3. Clinical Cancer Research (AACR)","https://clincancerres.aacrjournals.org/rss/ahead.xml"));
                subjects.add( new Subjects(77,"🔴 Oncology","4. Nature Reviews Cancer","http://feeds.nature.com/nrc/rss/current"));
                subjects.add( new Subjects(78,"🔴 Oncology","5. Annals of Oncology","http://rss.sciencedirect.com/publication/science/09237534"));
//                subjects.add( new Subjects(79,"🔴 Neurology","1. Neuron Journal","http://rss.sciencedirect.com/publication/science/08966273"));
//                subjects.add( new Subjects(80,"🔴 Neurology","2. Nature Neuroscience Journal","http://feeds.nature.com/neuro/rss/current"));
//                subjects.add( new Subjects(81,"🔴 Neurology","3. The Lancet Neurology","http://www.thelancet.com/rssfeed/laneur_online.xml"));
//                subjects.add( new Subjects(82,"🔴 Neurology","4. JAMA Neurology","https://jamanetwork.com/rss/site_16/onlineFirst_72.xml"));
//                subjects.add( new Subjects(83,"🔴 Neurology","5. Neurology Journal (AAN)","https://n.neurology.org/rss/recent.xml"));
//                subjects.add( new Subjects(84,"🔴 Neurology","6. NeuroImage Journal","https://www.journals.elsevier.com/neuroimage/rss"));
                subjects.add( new Subjects(85,"🔴 Pediatrics","1. Pediatrics (AAP)","https://pediatrics.aappublications.org/rss/recent.xml"));
                subjects.add( new Subjects(86,"🔴 Pediatrics","2. JAMA Pediatrics","https://jamanetwork.com/rss/site_19/onlineFirst_75.xml"));
                subjects.add( new Subjects(87,"🔴 Pediatrics","3. The Journal of Pediatrics","https://www.jpeds.com/current.rss"));
                subjects.add( new Subjects(88,"🔴 Pediatrics","4. Journal of Pediatric Gastroenterology and Nutrition","https://journals.lww.com/jpgn/_layouts/15/OAKS.Journals/feed.aspx?FeedType=PublishAheadofPrint&issue=00000&year=9000"));
                subjects.add( new Subjects(89,"🔴 Pediatrics","5. Developmental Medicine & Child Neurology","https://onlinelibrary.wiley.com/feed/14698749/most-recent"));
                subjects.add( new Subjects(90,"🔴 Pediatrics","6. BMC Pediatrics","https://bmcpediatr.biomedcentral.com/articles/most-recent/rss.xml"));
                subjects.add( new Subjects(91,"🔴 Pediatrics","7. Pediatric Research - Nature","http://feeds.nature.com/pr/rss/current"));
                subjects.add( new Subjects(92,"🔴 Psychiatry","1. Biological Psychiatry Journal (SOBP)","http://rss.sciencedirect.com/publication/science/00063223"));
                subjects.add( new Subjects(93,"🔴 Psychiatry","2. JAMA Psychiatry","https://jamanetwork.com/rss/site_14/onlineFirst_70.xml"));
                subjects.add( new Subjects(94,"🔴 Psychiatry","3. American Journal of Psychiatry","https://ajp.psychiatryonline.org/action/showFeed?ui=0&jc=ajp&type=etoc&feed=rss"));
                subjects.add( new Subjects(95,"🔴 Psychiatry","4. The Lancet Psychiatry","http://www.thelancet.com/rssfeed/lanpsy_online.xml"));
                subjects.add( new Subjects(96,"🔴 Psychiatry","5. Molecular Psychiatry - Nature","http://feeds.nature.com/mp/rss/current"));
                subjects.add( new Subjects(97,"🔴 Public Health","1. American Journal of Public Health (APHA)","https://ajph.aphapublications.org/action/showFeed?type=etoc&feed=rss&jc=ajph"));
                subjects.add( new Subjects(98,"🔴 Public Health","2. International Journal of Environmental Research and Public Health","https://www.mdpi.com/rss/journal/ijerph"));
                subjects.add( new Subjects(99,"🔴 Public Health","3. American Journal of Preventive Medicine (ACPM)","https://www.ajpmonline.org/current.rss"));
                subjects.add( new Subjects(100,"🔴 Public Health","4. Preventive Medicine Journal","https://www.journals.elsevier.com/preventive-medicine/rss"));
                subjects.add( new Subjects(101,"🔴 Public Health","5. The Lancet Public Health","http://www.thelancet.com/rssfeed/lanpub_online.xml"));
                subjects.add( new Subjects(102,"🔴 Public Health","6. WHO disease outbreaks","https://www.who.int/feeds/entity/csr/don/en/rss.xml"));
                subjects.add( new Subjects(103,"🔴 Pulmonology","1. American Journal of Respiratory and Critical Care Medicine","https://www.atsjournals.org/action/showFeed?type=etoc&feed=rss&jc=ajrccm"));
                subjects.add( new Subjects(104,"🔴 Pulmonology","2. European Respiratory Journal (ERS)","https://erj.ersjournals.com/rss/recent.xml"));
                subjects.add( new Subjects(105,"🔴 Pulmonology","3. The Lancet Respiratory Medicine","http://www.thelancet.com/rssfeed/lanres_online.xml"));
                subjects.add( new Subjects(106,"🔴 Pulmonology","4. Chest Journal","http://journal.chestnet.org/current.rss"));
                subjects.add( new Subjects(107,"🔴 Pulmonology","5. Thorax Journal","https://thorax.bmj.com/rss/ahead.xml"));
                subjects.add( new Subjects(108,"🔴 Pulmonology","6. Annals of the American Thoracic Society","https://www.atsjournals.org/action/showFeed?type=etoc&feed=rss&jc=annalsats"));
                subjects.add( new Subjects(109,"🔴 Radiology & Medical Imaging","1. Radiology Journal (RSNA)","https://pubs.rsna.org/action/showMostReadArticlesFeed?journalCode=radiology"));
                subjects.add( new Subjects(110,"🔴 Radiology & Medical Imaging","2. IEEE Transactions on Medical Imaging","https://ieeexplore.ieee.org/rss/TOC42.XML"));
                subjects.add( new Subjects(111,"🔴 Radiology & Medical Imaging","3. JACC: Cardiovascular Imaging","https://www.journals.elsevier.com/jacc-cardiovascular-imaging/rss"));
                subjects.add( new Subjects(112,"🔴 Radiology & Medical Imaging","4. Magnetic Resonance in Medicine","https://onlinelibrary.wiley.com/action/showFeed?jc=15222594&type=etoc&feed=rss"));
                subjects.add( new Subjects(113,"🔴 Radiology & Medical Imaging","5. European Radiology Journal","https://www.ejradiology.com/current.rss"));
                subjects.add( new Subjects(114,"🔴 Rheumatology","1. Annals of the Rheumatic Diseases","https://ard.bmj.com/rss/ahead.xml"));
                subjects.add( new Subjects(115,"🔴 Rheumatology","2. Arthritis & Rheumatology Journal","https://onlinelibrary.wiley.com/feed/23265205/most-recent"));
                subjects.add( new Subjects(116,"🔴 Rheumatology","3. Nature Reviews. Rheumatology","http://feeds.nature.com/nrrheum/rss/current"));
                subjects.add( new Subjects(117,"🔴 Rheumatology","4. Autoimmunity Reviews Journal","https://www.journals.elsevier.com/autoimmunity-reviews/rss"));
                subjects.add( new Subjects(118,"🔴 Rheumatology","5. Rheumatology Journal","https://academic.oup.com/rss/site_5347/3213.xml"));
                subjects.add( new Subjects(119,"🔴 Surgery","1. Annals of Surgery","https://cdn.journals.lww.com/annalsofsurgery/_layouts/15/OAKS.Journals/feed.aspx?FeedType=PublishAheadofPrint&year=9000&issue=00000"));
                subjects.add( new Subjects(120,"🔴 Surgery","2. Journal of Vascular Surgery","http://www.jvascsurg.org/current.rss"));
                subjects.add( new Subjects(121,"🔴 Surgery","3. Annals of Surgical Oncology","https://link.springer.com/search.rss?search-within=Journal&facet-journal-id=10434&query="));
                subjects.add( new Subjects(122,"🔴 Surgery","4. JAMA Surgery","https://jamanetwork.com/rss/site_20/onlineFirst_76.xml"));
                subjects.add( new Subjects(123,"🔴 Surgery","5. British Journal of Surgery","https://bjssjournals.onlinelibrary.wiley.com/action/showFeed?jc=13652168&type=etoc&feed=rss"));
                subjects.add( new Subjects(124,"🔴 Surgery","7. Journal of the American College of Surgeons","http://rss.sciencedirect.com/publication/science/10727515"));
                subjects.add( new Subjects(125,"🔴 Surgery","8. Surgical Endoscopy Journal","https://link.springer.com/search.rss?search-within=Journal&facet-journal-id=464&query="));


                AppDatabase.getDatabase(getApplicationContext()).subjectDao().insertAll(subjects);
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.topJournals:
                startActivity(new Intent(MainActivity.this, JournalActivity.class).putExtra("rssLink", rssLinks.get(0)));
                break;

            case R.id.btnNews:
                startActivity(new Intent(MainActivity.this, NewsActivity.class).putExtra("rssLink", rssLinks.get(1)));
                break;

            case R.id.buttonAbout:
                startActivity(new Intent(MainActivity.this, AboutActivity.class).putExtra("rssLink", rssLinks.get(1)));
                break;

            case R.id.contact_us_btn:
                startActivity(new Intent(MainActivity.this, Contact_us.class).putExtra("rssLink", rssLinks.get(1)));
                break;

            case R.id.journalsBySubject:
                startActivity(new Intent(MainActivity.this, SubjectsList.class).putExtra("rssLink", rssLinks.get(1)));
                break;


        }
    }


}
