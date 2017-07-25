package com.vishwas.searchengine;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
    *In this Assignment i'm implementing an app to take inputs from the user and search the user
    * entered data in the Google search engine using implicit intent by using Intent.*/

    /*
    * Intent is a kind of message or information that is passed to the components.
    * It is used to launch an activity, display a web page, send sms, send email etc.
 */

    TextView txt;// here i'm  creating object of txt
    Button internetActivity; // here we are creating object of button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// In here getting the widgets reference from XML layout
        txt = (TextView)findViewById(R.id.editText);
        internetActivity = (Button) findViewById(R.id.button);

        internetActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String searchTxt = txt.getText().toString();
                /* creating object of intent and passing ACTION_VIEW Intent
                   which the user can browse through*/
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.co.in/search?q="+searchTxt));
                startActivity(intent);// startActivity to launch an Activity.
            }
        });
    }


}
