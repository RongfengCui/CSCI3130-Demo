package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the button
        Button btn = findViewById(R.id.mybutton);
        //get the textView
        final TextView txt = findViewById(R.id.textView);
        //get the editText
        final EditText editText = findViewById(R.id.mytext);
        //display the text when user click the button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(editText.getText());
            }
        });
    }
}
