package com.android.updatesInMedicine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.android.androidrssfeedtutorial.R;

public class Contact_us extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us2);
        setTitle("Contact Us");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.email:
                Intent email = new Intent(Intent.ACTION_SENDTO);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ "updatesinmedicine@gmail.com"});
                //email.setType("message/rfc822");
                email.setData(Uri.parse("mailto:"));
                startActivity(Intent.createChooser(email, "Choose an Email client :"));
                break;

            case R.id.telegram:
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tg://resolve?domain=Updates_in_Medicine"));
                Intent intent;
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tg://resolve?domain=Updates_in_Medicine"));
                startActivity(intent);
                break;
            case R.id.viber:
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tg://resolve?domain=Updates_in_Medicine"));
                Intent viber;
                viber = new Intent(Intent.ACTION_VIEW, Uri.parse("https://invite.viber.com/?g2=AQBZOOX%2BmnrqE0v5eIGhmsmTyPf4hOsDnHDxBX%2BHenQhwkpVl9v%2FlKOiVFgYyJ6H"));
                startActivity(viber);
                break;

        }
    }


}