package com.ezra.elon.yourjob;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class FinishedState extends AppCompatActivity {
    int title = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_finished_state);
        Intent intent = getIntent();


          title  = intent.getIntExtra("title",0);

        TextView textView = (TextView) findViewById(R.id.title_id);
        ImageView imageView = (ImageView) findViewById(R.id.image);
        Button back = (Button) findViewById(R.id.back_btn);
        TextView explainText = (TextView) findViewById(R.id.explain_text);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(),MainActivity.class);
                startActivity(intent);

            }
        });

        switch (title)
        {
            case 1:
                textView.setText("פיתוח");
            imageView.setImageDrawable(getBaseContext().getResources().getDrawable(R.drawable.pituah));
             explainText.setText(loadFileFromAsset("pituah.txt"));
                break;
            case 2:
                textView.setText("סדנא");
                imageView.setImageDrawable(getBaseContext().getResources().getDrawable(R.drawable.sadna));
                explainText.setText(loadFileFromAsset("sadna.txt"));
                break;

            case 3:
                textView.setText("גדוד");
               imageView.setImageDrawable(getBaseContext().getResources().getDrawable(R.drawable.gdud));
                explainText.setText(loadFileFromAsset("gdud.txt"));
                break;

            case 4:
                textView.setText("פיקוד והדרכה");
               imageView.setImageDrawable(getBaseContext().getResources().getDrawable(R.drawable.hadraha));
                explainText.setText( loadFileFromAsset("hadraha.txt"));
                break;


        }


    }
      String loadFileFromAsset(String tet){
        String json = null;

        try{
            InputStream is = getBaseContext().getAssets().open(tet);
            int size = is.available();
            byte[]buffer=new byte[size];
            is.read(buffer);
            is.close();
            json= new String(buffer,"UTF-8");
        }catch(IOException ex)
        {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplication(),MainActivity.class);
        startActivity(intent);
    }
}
