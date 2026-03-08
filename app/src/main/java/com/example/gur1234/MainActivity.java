package com.example.gur1234;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // שלב א - הצהרה על משתנים
    private EditText editTextName;
    private Button btnGreet;
    private Button btnClear;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // שלב ב - חיבור הרכיבים
        editTextName = findViewById(R.id.editTextName);
        btnGreet = findViewById(R.id.btnGreet);
        btnClear = findViewById(R.id.btnClear);
        textViewResult = findViewById(R.id.textViewResult);

        // שלב ג - OnClickListener לכפתור ברוך הבא
        btnGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString().trim();

                // אתגר 1: בדיקה אם השם ריק
                if (name.isEmpty()) {
                    textViewResult.setText("שגיאה: נא להזין שם");
                    textViewResult.setTextColor(Color.RED); // אתגר 2: צבע אדום לשגיאה
                } else {
                    textViewResult.setText("שלום, " + name + "! ברוך הבא לאפליקציה!");
                    textViewResult.setTextColor(Color.GREEN); // אתגר 2: צבע ירוק להצלחה
                }
            }
        });

        // שלב ד - OnClickListener לכפתור נקה
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextName.setText("");
                textViewResult.setText("");
            }
        });

        // אתגר 3: LongClickListener להצגת השם ב-UPPERCASE
        btnGreet.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String name = editTextName.getText().toString().trim();
                if (!name.isEmpty()) {
                    textViewResult.setText("HELLO, " + name.toUpperCase() + "! WELCOME TO THE APP!");
                    textViewResult.setTextColor(Color.BLUE);
                    return true; // מציין שהאירוע טופל
                }
                return false;
            }
        });
    }
}
