/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the TextView tag, in this case numbers
        TextView numbers = (TextView)findViewById(R.id.numbers);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create an explicit intent
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                //Use intent method
                startActivity(numbersIntent);
            }
        });

        //Find the TextView tag, in this case Family members
        TextView family = (TextView)findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create an explicit intent
                Intent familyMembersIntent = new Intent(MainActivity.this, FamilyActivity.class);

                //Use intent method
                startActivity(familyMembersIntent);
            }
        });

        //Find the TextView tag, in this case Colors
        TextView colors = (TextView)findViewById(R.id.colors);

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create an explicit intent
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                //Use intent method
                startActivity(colorsIntent);
            }
        });

        //Find the TextView tag, in this case Colors
        TextView phrases = (TextView)findViewById(R.id.phrases);

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create an explicit intent
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                //Use intent method
                startActivity(phrasesIntent);
            }
        });

    }
}