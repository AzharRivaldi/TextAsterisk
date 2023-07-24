package com.azhar.textastrisk;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText etInputData;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInputData = findViewById(R.id.etInputData);
        tvHasil = findViewById(R.id.tvHasil);

        etInputData.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                etInputData.removeTextChangedListener(this);
                if (editable.length() > 0) {
                    tvHasil.setText(Tools.setAstriskText(editable.toString()));
                    etInputData.setSelection(etInputData.getText().length());
                } else {
                    tvHasil.setText("");
                }
                etInputData.addTextChangedListener(this);
            }
        });
    }

}