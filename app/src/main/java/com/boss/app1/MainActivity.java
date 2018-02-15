package com.boss.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edit1,edit2;
    private TextView t3;
    private double cal;
    private double ccal;
    private String scal;
    private double cal1;
    private double ccal1;
    private String scal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        t3 = findViewById(R.id.t3);
    }
    public void changeF(View view) {

        if(edit1.length()==0){
            t3.setText("please input integer celcuis.");}
        else{
            cal = Double.parseDouble(edit1.getText().toString());
            ccal = (cal*(9.0/5.0))+32;
            scal = Double.toString(ccal);
            edit2.setText(scal);
            t3.setText("Calculate Fahrenheit Complete");
        }
    }

    public void changeC(View view) {
        if (edit2.length()==0){
            t3.setText("please input integer Fahrenheit.");}

        else{
            cal1 = Double.parseDouble(edit2.getText().toString());
            ccal1 = (cal1-32)*(5.0/9.0);
            scal1 = Double.toString(ccal1);
            edit1.setText(scal1);
            t3.setText("Calculate celcuis Complete");
        }
    }
}
