package com.example.demo_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        EditText editText1,editText2;
        TextView ans;
        Button addition, substraction,multiplication,Division;

        editText1 = findViewById(R.id.firstoption);
        editText2 = findViewById(R.id.secondOption);
        ans = findViewById(R.id.answer);
        addition = findViewById(R.id.add);
        substraction = findViewById(R.id.sub);
        multiplication = findViewById(R.id.mul);
        Division = findViewById(R.id.div);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double a = Integer.parseInt(editText1.getText().toString());
                double b = Integer.parseInt(editText2.getText().toString());

                double c = a + b;

                ans.setText("Answer "+c);
                ans.setBackgroundColor(getColor(R.color.black));

            }
        });

        substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double a = Integer.parseInt(editText1.getText().toString());
                double b = Integer.parseInt(editText2.getText().toString());

                double c = a - b;

                ans.setText("Answer "+c);
                ans.setBackgroundColor(getColor(R.color.black));

            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double a = Integer.parseInt(editText1.getText().toString());
                double b = Integer.parseInt(editText2.getText().toString());

                double c = a * b;

                ans.setText("Answer: "+c);
                ans.setBackgroundColor(getColor(R.color.black));

            }
        }); Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    double a = Integer.parseInt(editText1.getText().toString());
                    double b = Integer.parseInt(editText2.getText().toString());

                    double c = a / b;

                    ans.setText("Answer: "+c);
                ans.setBackgroundColor(getColor(R.color.black));



            }
        });

    }
}