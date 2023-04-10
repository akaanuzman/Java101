package com.archeva.java101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConstraintLayoutActivity extends AppCompatActivity {
    // for logcat
    private static final String TAG = ConstraintLayoutActivity.class.getSimpleName();

    // ui elements
    private EditText editTxtName, editTxtSurname;
    private Button btnSave;
    private TextView lblResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        initComponents();
        setSaveBtnEventHandlers();
    }

    // for save button
    private void setSaveBtnEventHandlers() {
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTxtName.getText().toString();
                String surname = editTxtSurname.getText().toString();
                String fullName = name + surname;
                lblResult.setText("Full name: " +fullName);
            }
        });
    }

    private void initComponents() {
        editTxtName = findViewById(R.id.editTxtName);
        editTxtSurname = findViewById(R.id.editTxtSurname);
        btnSave = findViewById(R.id.btnSave);
        lblResult = findViewById(R.id.lblResult);
    }
}