package com.example.ghostchef;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Dialog trenDialog = new Dialog(this);
    trenDialog.setContentView(R.layout.dialog_tren);

    Button buttonGetStarted = findViewById(R.id.buttonGetStarted);

    ImageButton buttonOpenDialog = findViewById(R.id.buttonOpenDialog);
    Button buttonCloseDialog = trenDialog.findViewById(R.id.buttonCloseDialog);

    buttonGetStarted.setOnClickListener(v -> {
      Intent intent = new Intent(getApplicationContext(), MealDetails.class);
      startActivity(intent);
    });

    buttonOpenDialog.setOnClickListener(v -> trenDialog.show());

    buttonCloseDialog.setOnClickListener(v -> trenDialog.dismiss());
  }
}