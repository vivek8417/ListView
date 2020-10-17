package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lvmonth;
    ArrayList<String> months=new ArrayList<>();
    String [] more={"Vivek","Singh","Senger","Vishal Gupta","Mukul","Sakshya"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvmonth=findViewById(R.id.tvmonth);
        String[] month=new DateFormatSymbols().getMonths();
        months.addAll(Arrays.asList(month));
        months.addAll(Arrays.asList(more));
        ArrayAdapter<String> monthAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,months);
        lvmonth.setAdapter(monthAdapter);
        lvmonth.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String month=parent.getItemAtPosition(position).toString();
        Toast.makeText(this, "Click On "+month, Toast.LENGTH_SHORT).show();
    }   
}
