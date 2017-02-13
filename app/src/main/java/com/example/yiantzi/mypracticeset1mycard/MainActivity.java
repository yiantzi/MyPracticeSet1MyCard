package com.example.yiantzi.mypracticeset1mycard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onMyButtonClick();

    }

    public void onMyButtonClick()

    {
        Button button = (Button)findViewById(R.id.myButton);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.ranch.gr/view_article/115/western-savvatokyriako-sto-the-ranch"));
                startActivity(viewIntent);
            }
        });

    }


}
