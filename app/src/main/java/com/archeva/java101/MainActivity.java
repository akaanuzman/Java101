package com.archeva.java101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // log variable
    // private static final String TAG = "MainActivity";
    private static final String TAG = MainActivity.class.getSimpleName();

    private EditText txtFirstNumber, txtSecondNumber;
    private Button btnAddition;
    private TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        registerEventHandlers();
    }
    // Button onTap method.
    private void registerEventHandlers() {
        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer firstNumber = Integer.parseInt(txtFirstNumber.getText().toString());
                Integer secondNumber = Integer.parseInt(txtSecondNumber.getText().toString());
                Integer result = firstNumber + secondNumber;
                lblResult.setText("Result: "+result);
                Log.i(TAG, "Additional Result: "+result);
            }
        });
    }

    private void initComponents() {
        txtFirstNumber = findViewById(R.id.txtFirstNumber);
        txtSecondNumber = findViewById(R.id.txtSecondNumber);
        btnAddition = findViewById(R.id.btnAddition);
        lblResult = findViewById(R.id.lblResult);
    }

}