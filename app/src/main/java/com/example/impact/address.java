package com.example.impact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class address extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        tv = (TextView) findViewById(R.id.textView8);
        Intent iin = getIntent();
        Bundle b = iin.getExtras();
        if (b != null) {
            String j = (String) b.get("user_name");
if(j.equals("1"))
{
    tv.setText("GOONJ HEAD OFFICE: GOONJ.., J-93, Sarita Vihar, New Delhi- 110076\n" +
            "\n" +
            "Contact: 011- 41401216, 26972351\n" +
            "\n" +
            "Email: mail@goonj.org\n" +
            "\n" +
            "Timings : Monday – Saturday 10.00 AM.- 5.00 PM. (Sunday closed) (Call & Material dropping)\n" +
            "\n" +
            "\n" +
            "SOUTH DELHI\n" +
            "\n" +
            "PALAM VIHAR: Swiss Cottage School, Salahpur, Bijwasan, New Delhi (Opp. Sector 23 of Gurgaon)\n" +
            "\n" +
            "Contact: Mrs. Shallu – 09810883796\n" +
            "\n" +
            "Timings: Material drop: Monday- Saturday (8:30 AM – 1:30 PM) for directions during this time call on 0124425994455 between 2:30 PM- 7.30 PM\n" +
            "\n" +
            "Note: Above is a school, it will be closed on second Saturday and on gazetted holidays\n" +
            "\n" +
            "VASANT VIHAR: C-6/6, Vasant Vihar, New Delhi\n" +
            "\n" +
            "Contact: Mrs. Mridula Murgai 011–41611244 / 9810032527\n" +
            "\n" +
            "Timings: All Days (10 am\u200B to \u200B6 pm)\u200B");
}
        }
    }
}