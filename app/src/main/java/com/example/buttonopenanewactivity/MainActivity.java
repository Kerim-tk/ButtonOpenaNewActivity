package com.example.buttonopenanewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    public static final String EXTRA_TEXT="com.exdmple.application.example.EXTRA_TEXT";
    public static final String EXTRA_NUMBER="com.exdmple.application.example.EXTRA_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

            }
        });
    }
    public void openActivity2(){
        EditText editText1 = findViewById(R.id.edittext1);
        String text = editText1.getText().toString();

        EditText editText2 = findViewById(R.id.edittext2);
        int number = Integer.parseInt((editText2.getText().toString()));

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(EXTRA_TEXT, text);
        intent.putExtra(EXTRA_NUMBER, number);
        startActivity(intent);
    }
}