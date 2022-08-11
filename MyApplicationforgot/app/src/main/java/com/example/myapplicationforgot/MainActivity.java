package com.example.myapplicationforgot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOpen = findViewById(R.id.btn_open);
        Button btnOpenBottom = findViewById(R.id.btn_open_bottom);

        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenForgotPassword(Gravity.CENTER);

                btnOpenBottom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        OpenForgotPassword(Gravity.BOTTOM);
                    }
                });
            }
        });
    }
    private void OpenForgotPassword(int gravity) {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_forgotpass);
        Window window = dialog.getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        WindowManager.LayoutParams windowattributes = window.getAttributes();
        windowattributes.gravity = gravity;
        window.setAttributes(windowattributes);

        if (Gravity.BOTTOM == gravity) {
            dialog.setCancelable(true);

        } else {
            dialog.setCancelable(false);
        }
        EditText edtforgot = dialog.findViewById(R.id.edt_password);
        Button btnCancle = dialog.findViewById(R.id.btn_Cancle);
        Button btnReset = dialog.findViewById(R.id.btn_reset);

        btnCancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Send Email", Toast.LENGTH_SHORT).show();

            }
        });
        dialog.show();


    }
}