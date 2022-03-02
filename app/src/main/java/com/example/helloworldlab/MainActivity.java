package com.example.helloworldlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text_view_Main; //butu geriau pasidaryti trumpesni pavadinima, bet kad lengviau susigaudyciau cia ir intellisense veikia tai palikau

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.text_view_Main = (TextView)findViewById(R.id.text_view_Main);
    }

    public void BtnClick(View view) {
        this.text_view_Main = (TextView) findViewById(R.id.text_view_Main);
        text_view_Main.setText("Hello!");
    }
}