package com.example.kpowe.thelittlethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This intent method is called when the login button is clicked.
     */
    public void openLogin(View view){
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }




}
