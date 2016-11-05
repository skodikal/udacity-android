package com.udacity.kodikals.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View v) {
        CharSequence text = ((Button)v).getText();
        Toast.makeText(v.getContext(), text, Toast.LENGTH_LONG).show();
    }
}
