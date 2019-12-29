package com.queensherainfotech.colortoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.queensherainfotech.toastlibrary.ColorToast;

public class MainActivity extends AppCompatActivity {

    String toastMsg = "Hello World!";
    int redColor = Color.parseColor("#FF5A5F");

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b10=findViewById(R.id.b10);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ColorToast.Builder(MainActivity.this)
                        .text(toastMsg)
                        .show();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ColorToast.Builder(MainActivity.this)
                        .text(toastMsg)
                        .backgroundColor(redColor)
                        .show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ColorToast.Builder(MainActivity.this)
                        .text(toastMsg)
                        .textColor(redColor)
                        .show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ColorToast.Builder(MainActivity.this)
                        .text(toastMsg)
                        .textColor(redColor)
                        .textBold()
                        .show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ColorToast.Builder(MainActivity.this)
                        .text(toastMsg)
                        .font(R.font.dancing)
                        .show();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ColorToast.Builder(MainActivity.this)
                        .text(toastMsg)
                        .cornerRadius(5)
                        .show();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ColorToast.Builder(MainActivity.this)
                        .text(toastMsg)
                        .iconStart(R.drawable.ic_chevron_left_black_24dp)
                        .show();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ColorToast.Builder(MainActivity.this)
                        .text(toastMsg)
                        .iconEnd(R.drawable.ic_chevron_right_black_24dp)
                        .show();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ColorToast.Builder(MainActivity.this)
                        .text(toastMsg)
                        .iconStart(R.drawable.ic_chevron_left_black_24dp)
                        .iconEnd(R.drawable.ic_chevron_right_black_24dp)
                        .show();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ColorToast.Builder(MainActivity.this)
                        .text(toastMsg)
                        .stroke(2, redColor)
                        .show();
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ColorToast.Builder(MainActivity.this)
                        .text(toastMsg)
                        .stroke(2, Color.CYAN)
                        .backgroundColor(Color.BLACK)
                        .solidBackground()
                        .textColor(Color.YELLOW)
                        .textBold()
                        .font(R.font.dancing)
                        .iconStart(R.drawable.ic_chevron_left_black_24dp)
                        .iconEnd(R.drawable.ic_chevron_right_black_24dp)
                        .cornerRadius(12)
                        .textSize(18)
                        .show();
            }
        });
    }
}
