package edu.csumb.bamagana.scienceworkshopsurvey;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
/*import android.database;
import android.database.sqlite;*/
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    //private MainBTN btd;

    private Button nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //nextButton.setBackgroundColor(Color.YELLOW);

        nextButton = (Button) findViewById(R.id.main_button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Page_02.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}