package com.android.view1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button btn1;
    Button btn2;
    Button btn3;
    EditText editText=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.text1);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        editText = (EditText)findViewById(R.id.edit1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str="APP2019";
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
                editText.setText(str);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str="APP2020";
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

                editText.setText(str+"<<문자열");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str="세번째 버튼";
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

                editText.setText(str+" 랄랄라");
            }
        });


    }
}
