package com.example.flashcardapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    boolean isShowingAnswers = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView flashcardQuestion = findViewById(R.id.flashcard_question);
        TextView flashcardAnswer = findViewById(R.id.flashcard_answer);
        TextView answer1 = findViewById(R.id.answer1);
        TextView answer2 = findViewById(R.id.answer2);
        TextView answer3 = findViewById(R.id.answer3);
        ImageView toggle_choices_visibility = findViewById(R.id.toggle_choices_visibility);




        flashcardQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardQuestion.setVisibility(View.INVISIBLE);
                flashcardAnswer.setVisibility(View.VISIBLE);
            }
        });

        flashcardAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardAnswer.setVisibility(View.INVISIBLE);
                flashcardQuestion.setVisibility(View.VISIBLE);
            }
        });

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer1.setBackgroundColor(getResources().getColor(R.color.my_red_color, null));
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer2.setBackgroundColor(getResources().getColor(R.color.my_red_color, null));
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer3.setBackgroundColor(getResources().getColor(R.color.my_green_color, null));
            }
        });


        toggle_choices_visibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isShowingAnswers) {
                    toggle_choices_visibility.setImageResource(R.drawable.hide_icon);
                    answer1.setVisibility(view.INVISIBLE);
                    answer2.setVisibility(view.INVISIBLE);
                    answer3.setVisibility(view.INVISIBLE);

                } else {
                    toggle_choices_visibility.setImageResource(R.drawable.show_icon);
                    answer1.setVisibility(view.VISIBLE);
                    answer2.setVisibility(view.VISIBLE);
                    answer3.setVisibility(view.VISIBLE);
                }
                isShowingAnswers = !isShowingAnswers;
            }
        });


    }
}