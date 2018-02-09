package com.example.student.a2018010801;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        String str[]={"ABA","abb","acc","ccc","aaa","bbbc","bb"};//設定陣列
        ArrayAdapter<String> adp=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,str);
        //
        act.setThreshold(1);//打幾個字就要跳出相符的給你選
        act.setAdapter(adp);
    }
}
