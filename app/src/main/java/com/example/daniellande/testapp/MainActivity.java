package com.example.daniellande.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private final String TAG = this.getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv = findViewById(R.id.textview_greeting);
                Log.i(TAG, "Here is a log.");
                tv.setText("You clicked the button!");

                for (int i = 0; i < 10; i++) {
                    Log.i(TAG, i + "");
                }

                Animal a = new Animal("Cat", "Black", 12);

                a.setColor("White");

                /*
                List<Integer> list = new LinkedList<>();
                for(Integer i : list) {

                }*/
            }
        });
    }
}
