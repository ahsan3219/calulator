package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFi, etSe;
    TextView anS;
    Button Add,Sub,Multi,Div;
    private View add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFi=findViewById(R.id.etFi);
        etSe=findViewById(R.id.etSe);
        etFi=findViewById(R.id.etFi);
        anS=findViewById(R.id.anS);
        Add=findViewById(R.id.btnAdd);
        Sub=findViewById(R.id.btnSub);
        Multi=findViewById(R.id.btnMulti);
        Div=findViewById(R.id.btnDiv);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFi.getText().toString());
                secondValue = Integer.parseInt(etSe.getText().toString());
                ans = firstValue + secondValue;

                anS.setText("ANSWER IS = " + anS);

            }








        }}}







