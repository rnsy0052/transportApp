package com.example.seemkay.seemotransport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method provides validation on sign on for the given user name and password.
     * If right it navigates to the home page else produces an error message.
     */
    public void signOn(View view) {
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
//        Log.d("Debug",username.getText()+""+password.getText());
    }
}
