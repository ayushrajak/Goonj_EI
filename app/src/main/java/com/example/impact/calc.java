package com.example.impact;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Locale;

public class calc extends AppCompatActivity {
    TextToSpeech t3;
ImageButton b1;
    double d,co2,hcn,co,no;
    TextView t4,t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        Intent intent = getIntent();
        String user_name = intent.getStringExtra("USER_NAME");
        String mat = intent.getStringExtra("material");
        String location = intent.getStringExtra("loc");
        String pincode = intent.getStringExtra("pin");
        String types=intent.getStringExtra("type");
        int quantity = Integer.parseInt(intent.getStringExtra("qty"));
        t1=(TextView)findViewById(R.id.textView4);
        t2=(TextView)findViewById(R.id.textView80);
        t4=(TextView)findViewById(R.id.textView90);
        b1=(ImageButton)findViewById(R.id.imageButton3);
        t3=new TextToSpeech(getApplicationContext(),new TextToSpeech.OnInitListener() {
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t3.setLanguage(Locale.UK);

                }       }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak=t4.getText().toString();
                t3.speak(toSpeak,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        t1.setText("Environmental Impact Of "+mat);
        t2.setText("Type- "+types);
        TextView t=(TextView)findViewById(R.id.textView90);
        if(mat.equals("Plastics")==true)
        {if(types.equals("Plastic")==true){
            d=(double)(quantity*(6.00/1000));
            t.setText("The Impact Of "+quantity+" Tons Plastic On Air is: "+d+" Tons \n \nFor AIR:\nDepending on the country, a little more than 22 to 43 percent of plastic waste ends up in landfills \"Compounds of concern\" (high risk to human health) that are allowed to come in contact with food mainly through plastic packaging include bisphenols, phthalates, nonpersistent pesticides, perfluoroalkyl chemicals (PFCs), and perchlorate. Chlorinated plastic can release harmful chemicals into the surrounding soil, which can then seep into groundwater or other surrounding water sources, and also the ecosystem. Additives such as phthalates and Bisphenol A (widely known as BPA) leach out of plastic particles. These additives are known for their hormonal effects and can disrupt the hormone system of vertebrates and invertebrates alike.");
        }}
        else if(mat.equals("Furniture")==true) {if(types.equals("Wood")==true){
            d = (double) (quantity* (1.65 / 1000));
            t.setText("The Impact Of " + quantity + " Tons Furniture On Air is: " + d + " Tons.\n \nFor air:\nLandfills cause pollution to the local environment by contaminating the groundwater and aquifers, contaminating the soil, and producing methane. The Environmental Impact of Wood Smoke. Wood smoke is air pollution. It is as simple as that. Residential wood burning also produces a laundry list of other pollutants such as mercury, carbon monoxide, greenhouse gases, volatile organic compounds and nitrogen oxides.");
        }}
        else if(mat.equals("Footwear")==true) {
            if (types.equals("Leather")==true)
            { if(quantity<=250)
            {
            t.setText("The water quality index Of " + quantity + " Tons is: 24.675  \n.When the parameter is pH.\n\n0-25--------Excellent\n26-50--------Good\n51-75--------Bad\n76-100--------Very Bad\n100 & above--------Unfit\n \nFor Water: In addition, raising the animals whose skin eventually becomes leather requires vast quantities of water and wide tracts of pastureland,\n" +
                    "which must be cleared of trees.");
        }
            else if (quantity>250 && quantity<500)
            {
                t.setText("The water quality index Of " + quantity + " Tons is: 27.781 \n .When the parameter is pH.\n\n0-25--------Excellent\n26-50--------Good\n51-75--------Bad\n76-100--------Very Bad\n100 & above--------Unfit\n \nFor Water: In addition, raising the animals whose skin eventually becomes leather requires vast quantities of water and wide tracts of pastureland,\n" +
                        "which must be cleared of trees.");

            }
            else if (quantity<250)
            {
                t.setText("The water quality index Of " + quantity + " Tons is: 20.67  \n.When the parameter is pH.\n\n0-25--------Excellent\n26-50--------Good\n51-75--------Bad\n76-100--------Very Bad\n100 & above--------Unfit\n \nFor Water: In addition, raising the animals whose skin eventually becomes leather requires vast quantities of water and wide tracts of pastureland,\n" +
                        "which must be cleared of trees.");

            }

            else if (quantity>500 && quantity<750)
                {
                    t.setText("The water quality index Of " + quantity + " Tons is: 45.06  \n.When the parameter is pH.\n\n0-25--------Excellent\n26-50--------Good\n51-75--------Bad\n76-100--------Very Bad\n100 & above--------Unfit\n \nFor Water: In addition, raising the animals whose skin eventually becomes leather requires vast quantities of water and wide tracts of pastureland,\n" +
                            "which must be cleared of trees.");

                }
            else
            {
                t.setText("The water quality index Of " + quantity + " Tons is: 48.46  \n.When the parameter is pH.\n\n0-25--------Excellent\n26-50--------Good\n51-75--------Bad\n76-100--------Very Bad\n100 & above--------Unfit\n \nFor Water: In addition, raising the animals whose skin eventually becomes leather requires vast quantities of water and wide tracts of pastureland,\n" +
                        "which must be cleared of trees.");

            }

            }}
        /*else if(mat.equals("Clothes")==true)
        {
            d = (double) (quantity*0.4);
            t.setText("The Impact Of " + quantity + " Tons Clothes On Water is : " + d + " Tons.\n \nFor Water: The microfibers then travels to local wastewater treatment plant, where up to 40% of them can enter into rivers,lakes and oceans(depending on local wastewater treatment conditions");

        }*/
        else if(mat.equals("Clothes")==true)
        {if(types.equals("Cotton")==true){
            d=quantity*4000;
            co=quantity*830;
            t.setText(quantity+" tons of cotton cloth produces "+d+" metre cubic air where "+co+"cubic metre contains carbon dioxide gas harmful for greenhouse emission");
        }else if(types.equals("Nylon")==true) {
            d = (double) (quantity * 0.4);
            hcn = (double) (quantity * 116);
            co = (double) (quantity * 436);
            no = (double) (quantity * 9.4);
            t.setText("FOR AIR:\nThe Impact Of " + quantity + " Tons Clothes On Air are as follows:- \n" + hcn + " Tons of Hydrogen Cyanide is released when " + quantity + " tons is burned.\n" + co + " Tons of Carbon Monoxide is released when " + quantity + " tons is burned.\n" + no + " Tons of Nitrogen Dioxide is released when " + quantity + " tons is burned.\nFOR WATER:\nThe Impact Of " + quantity + " Tons Clothes On Water is : " + d + " Tons.\n \nFor Water: The microfibers then travels to local wastewater treatment plant, where up to 40% of them can enter into rivers,lakes and oceans(depending on local wastewater treatment conditions.");
        }
        }
        else if(mat.equals("Books")==true) {
            if (types.equals("Paper") == true)
            {  co=(double)(quantity*0.11967);
            co2=(double)(quantity*1.700);
            no=(double)(quantity*0.00038);
            t.setText("The Impact Of " + quantity + " Tons Books On Air are as follows:- \n" + co2 + " Tons Carbon Dioxide is released when "+quantity+" tons is burned.\n" + no + " Tons of Carbon Monoxide is released in Environment.\n" + no + " Tons of Sulphur Dioxide is Released.\n");
        }}
        else if(mat.equals("Electronic Items")==true)
        {
            if(types.equals("Lead")==true) {
                d = (double) (quantity * 64090);
                t.setText("Composition of lead in soil when E-waste is burned:" + d + " mg, but normal composition is " + (quantity * 3060) + " mg ");
                        }
            else if(types.equals("Maganese"))
            {
                co = (double) (quantity * 3550);
                 t.setText("\n\nComposition of zinc in soil when E-waste is burned:"+co+" mg, but normal composition is "+(quantity*3340)+" mg");
            } else if(types.equals("Zinc")){ no=(double)(quantity*18600);

               t.setText("\n\nComposition of maganese in soil when E-waste is burned:"+no+" mg, but normal composition is "+(quantity*2900)+" mg");
        }
            }
            else if(mat.equals("Kitchen Utensils")==true)
            {
                if(types.equals("Steel"))
                {
                    d=(double)(quantity*9.3);
                    t.setText(quantity+" tons of Steel utensils yields"+d+" tons of Carbon Dioxide released  in atmosphere.");
                }
                else if(types.equals("Aluminium"))
                {
                    d=(double)(quantity*9.3);
                    t.setText(quantity+" tons of aluminium utensils yields"+d+" tons of Carbon Dioxide dumped in landfill");

                }
            }
        }
    public void onPause()
    {
        if(t3!=null)
        {
            t3.stop();
            t3.shutdown();
        }
        super.onPause();
    }
}

