package com.example.juliettecoia.essai_carte;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by marleybennett on 7/28/16.
 */
public class FirstPage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page_layout);
    }

    public void changeText (View view){
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Submit")) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
