package com.android.view1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    Button btn1;
    Button btn2;
    Button btn3;

    EditText editText;

    //3교시-입력된 텍스트를 하단에 출력
    TextView resultText=null;
    Button inputBtn=null;
    String rsStr=null; // EditText 입력될 문자열을 저장 -> TextView(resultText)

    String[] strArr = {"android1", "andriod2", "andriod3", "IOS1", "IOS2", "IOS3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.autoText);

        autoCompleteTextView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,strArr));


        textView = (TextView)findViewById(R.id.text1);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        editText = (EditText)findViewById(R.id.edit1);

        resultText = (TextView)findViewById(R.id.resultText);
        inputBtn = (Button)findViewById(R.id.inputBtn);

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

        inputBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rsStr = editText.getText().toString(); //EditText에 입력되어 있는 문자열을 저장
                Toast.makeText(getApplicationContext(),rsStr,Toast.LENGTH_SHORT).show();
                resultText.setText(rsStr);
            }
        });
    }
}
