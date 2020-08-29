package com.example.impact;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class insert_data extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);
        s1=(Spinner)findViewById(R.id.spinner);
        s2=(Spinner)findViewById(R.id.spinner2);
s1.setOnItemSelectedListener(this);
    }
    public void regclick(View v)
    {
        EditText t1=(EditText)findViewById(R.id.editText2);
        EditText t2=(EditText)findViewById(R.id.editText3);
        EditText t3=(EditText)findViewById(R.id.editText4);
        EditText t=(EditText)findViewById(R.id.editText);
            String qty=t1.getText().toString();
        String loc=t2.getText().toString();
        String pin=t3.getText().toString();
        String name=t.getText().toString();
        String material=s1.getSelectedItem().toString();
        String type=s2.getSelectedItem().toString();
        if(qty.length()==0 || loc.length()==0||pin.length()==0||name.length()==0)
        {
            Toast.makeText(this,"Value Cannot Be Empty",Toast.LENGTH_SHORT).show();
        }
        try{
            String sql="insert into t_input1 values('"+material+"','"+qty+"','"+loc+"','"+pin+"','"+name+"')";
            ConnectionClass c=new ConnectionClass();
            Connection conn=c.CONN();
            Statement stat=conn.createStatement();
            stat.execute(sql);
            conn.close();
            Toast.makeText(this,"Record Saved",Toast.LENGTH_SHORT).show();
        }
        catch(Exception e)
        {

            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
        String user_name = name;
        String location=loc;
        String quantity=qty;
        String pincode=pin;
        String m=material;
        String ty=type;

        Intent x=new Intent(insert_data.this,calc.class);
        x.putExtra("USER_NAME", user_name);
        x.putExtra("material",m);
        x.putExtra("pin",pincode);
        x.putExtra("loc",location);
        x.putExtra("qty",quantity);
        x.putExtra("type",ty);
        startActivity(x);
    }

    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                               long arg3) {
        // TODO Auto-generated method stub

        String sp1= String.valueOf(s1.getSelectedItem());
        Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();
        if(sp1.contentEquals("Clothes")) {
            List<String> list = new ArrayList<String>();
            list.add("Cotton");
            list.add("Nylon");

            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);
        }
        else if(sp1.contentEquals("Kitchen Utensils")) {
            List<String> list = new ArrayList<String>();
            list.add("Steel");
            list.add("Aluminium");

            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
        }

        else if(sp1.contentEquals("Electronic Items")) {
            List<String> list = new ArrayList<String>();
            list.add("Lead");
            list.add("Maganese");
            list.add("Zinc");

            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
        }
       else if(sp1.contentEquals("Books")) {
            List<String> list = new ArrayList<String>();
            list.add("Paper");

            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
        }
        else if(sp1.contentEquals("Plastics")) {
            List<String> list = new ArrayList<String>();
            list.add("Plastic");

            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
        }
        else if(sp1.contentEquals("Footwear")) {
            List<String> list = new ArrayList<String>();
            list.add("Leather");

            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
        }
     else if(sp1.contentEquals("Furniture")) {
            List<String> list = new ArrayList<String>();
            list.add("Wood");

            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
        }





    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
}
