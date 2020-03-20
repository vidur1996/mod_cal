package com.vidu.mod_cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button) findViewById(R.id.btn);
         num1 = (EditText) findViewById(R.id.num1_txt);
         num2 = (EditText) findViewById(R.id.num2_txt);
         out = (TextView) findViewById(R.id.out_txt);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        if(num1.getText().toString()=="" || num1.getText().toString().equals("") ||num2.getText().toString()=="" || num2.getText().toString().equals(""))
        {
            Toast.makeText(MainActivity.this,"ENTER NUMBER",Toast.LENGTH_SHORT).show();
            return;
        }
        else
            {
                 long n1  = Integer.parseInt(num1.getText().toString());
                long n2 = Integer.parseInt(num2.getText().toString());
                long ans = n1%n2;
                out.setText(n1 +" MOD " + n2 +" = " + ans );

                try {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }








            }

        });
    }
}
