package com.doit.test01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int oldValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeTextViewValueRandomlyOnButtonClick();

    }

    private void changeTextViewValueRandomlyOnButtonClick() {
        final String[] manyDifferentStrings = {"R~", "黏黏的", "%%%", "有同學 麥克轟沒關哦"};

        final TextView changText = (TextView) findViewById(R.id.text_to_change);
        Button changeTextButton = (Button) findViewById(R.id.change_text_button);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random = (int) (Math.random() * manyDifferentStrings.length);
                if (random == oldValue) {
                    random = (int) (Math.random() * manyDifferentStrings.length);
                }
                changText.setText(manyDifferentStrings[random]);
                oldValue = random;
            }
        });
    }
}