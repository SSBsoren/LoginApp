package com.soren.sagen.spritem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void loginFunction(View view){

        Toast.makeText(MainActivity.this, "You ('-')",Toast.LENGTH_LONG).show();

        EditText UsernameEditText= findViewById(R.id.UsernameEditText);
        EditText PwdEditText= findViewById(R.id.PwdEditText);

        ImageView image= findViewById(R.id.mYimageView);
        image.setImageResource(R.drawable.baby);
        Log.i("Username",UsernameEditText.getText().toString());
        Log.i("Password",PwdEditText.getText().toString());



    }

}
