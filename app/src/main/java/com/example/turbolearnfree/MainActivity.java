package com.example.turbolearnfree;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button flashcardBtn, quizBtn, uploadBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flashcardBtn = findViewById(R.id.flashcardBtn);
        quizBtn = findViewById(R.id.quizBtn);
        uploadBtn = findViewById(R.id.uploadBtn);

        flashcardBtn.setOnClickListener(v -> startActivity(new Intent(this, FlashcardActivity.class)));
        quizBtn.setOnClickListener(v -> startActivity(new Intent(this, QuizActivity.class)));
        uploadBtn.setOnClickListener(v -> startActivity(new Intent(this, UploadActivity.class)));
    }
}
