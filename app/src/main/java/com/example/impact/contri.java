package com.example.impact;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;

public class contri extends AppCompatActivity {
GridLayout g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contri);
        g=(GridLayout)findViewById(R.id.maingrid1);
        setSingleEvent(g);
    }

    private void setSingleEvent(GridLayout maingrid1) {

        for( int i=0;i<maingrid1.getChildCount();i++)
        {
            CardView cardView=(CardView)maingrid1.getChildAt(i);
            final int a=i;
final String user_name=Integer.toString(a);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(a==0)
                    {
                        double s=28.535719,k=77.298045;
                        String uri = "http://maps.google.com/maps?saddr=" +s+ "," +k;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                        startActivity(intent);

                    }
                    else
                    if(a==1)
                    {
                        double s=29.173363,k=75.713490;
                        String uri = "http://maps.google.com/maps?saddr=" +s+ "," +k;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                        startActivity(intent);

                    }

                    else if(a==2)
                    {
                        double s=30.913001,k=77.098450;
                        String uri = "http://maps.google.com/maps?saddr=" +s+ "," +k;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                        startActivity(intent);
                    }
                    else if(a==3)
                    {
                        double s=12.887130,k=77.636807;
                        String uri = "http://maps.google.com/maps?saddr=" +s+ "," +k;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                        startActivity(intent);

                    }
                    else if(a==4)
                    {
                        double s=22.635236,k=75.799522;
                        String uri = "http://maps.google.com/maps?saddr=" +s+ "," +k;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                        startActivity(intent);
                    }

                    else if(a==5)
                    {
                        double s=19.271420,k=72.882240;
                        String uri = "http://maps.google.com/maps?saddr=" +s+ "," +k;
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                        startActivity(intent);
                    }
                }
            });
        }
    }
}
