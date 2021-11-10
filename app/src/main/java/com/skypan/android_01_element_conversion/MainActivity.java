package com.skypan.android_01_element_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.login);
    }
    int i=0;
    public void click(View view) {
        if(i==0){
            login.setText("Logout");
            i=1;
        }
        else{
            login.setText("Login");
            i=0;
        }
    }
}