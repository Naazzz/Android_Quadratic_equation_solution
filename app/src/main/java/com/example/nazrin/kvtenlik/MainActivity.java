package com.example.nazrin.kvtenlik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected float firstnumber;
    protected float secondnumber;
    protected float thirdnumber;
    protected float myanswer, discriminant,answer1, answer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.find);
        final EditText first = (EditText) findViewById(R.id.first);
        final EditText second = (EditText) findViewById(R.id.second);
        final EditText third = (EditText) findViewById(R.id.third);
        final TextView firstasnwer = (TextView) findViewById(R.id.answer1);
        final TextView secondasnwer = (TextView) findViewById(R.id.answer2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float firstnumber = Float.parseFloat( first.getText().toString() );
                float secondnumber = Float.parseFloat( second.getText().toString() );
                float thirdnumber = Float.parseFloat( third.getText().toString() );

                discriminant=secondnumber*secondnumber-4*firstnumber*thirdnumber;

                if (discriminant>0){
                    answer1=((-1)*secondnumber-(float)Math.sqrt(discriminant))/2*firstnumber;
                    answer2=((-1)*secondnumber+(float)Math.sqrt(discriminant))/2*firstnumber;
                }
                else if(discriminant==0){
                    answer1=((-1)*secondnumber)/2*firstnumber;
                    answer2=((-1)*secondnumber)/2*firstnumber;
                }
                else if (discriminant<0){
                    firstasnwer.setText("no");
                    secondasnwer.setText("no");

                }

                firstasnwer.setText(String.valueOf(answer1));
                secondasnwer.setText(String.valueOf(answer2));



            }
        });


    }

}
