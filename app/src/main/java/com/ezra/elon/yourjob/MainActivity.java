package com.ezra.elon.yourjob;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.support.v7.app.AlertDialog.*;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Button startbtn = (Button) findViewById(R.id.startbtn);
        Button explain = (Button) findViewById(R.id.explain_button);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(),ActivityForGame.class);

                startActivity(intent);
            }
        });

        explain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               final AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);

                a_builder.setTitle("הסבר").setMessage("האפליקציה מיועדת להנדסאים בחיל הטכנולוגיה והאחזקה שמעוניינים לדעת איזה תפקיד מתאים להם. התשובה שתקבלו כאן כמובן לא סופית והשיבוץ תלוי תמיד ברצון שלכם ובצורכי צה\"ל").setCancelable(true);
                a_builder.setNeutralButton("ok", new OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
            AlertDialog alertDialog = a_builder.create();
                alertDialog.show();
            }
        });

    }


}
