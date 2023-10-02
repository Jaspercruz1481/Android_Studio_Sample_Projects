package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txt_price, txt_make_fill, txt_model_fill, txt_reg_date_fill, txt_transmission_fill;

    ImageView motorImageView;

    RadioButton theme1, theme2, theme3;

    CheckBox checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8;

    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout background = findViewById(R.id.layout);

        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);

        motorImageView = findViewById(R.id.imageView);

        txt_price = findViewById(R.id.text_price);

        txt_make_fill = findViewById(R.id.text_make_fill);
        txt_model_fill = findViewById(R.id.text_model_fill);
        txt_reg_date_fill = findViewById(R.id.text_reg_date_fill);
        txt_transmission_fill = findViewById(R.id.text_text_transmission_fill);

        theme1 = findViewById(R.id.radio_theme1);
        theme2 = findViewById(R.id.radio_theme2);
        theme3 = findViewById(R.id.radio_theme3);

        checkBox.setOnClickListener(view -> {
            motorImageView.setImageResource(R.drawable.airblade_160);
            txt_price.setText("SRP: P119,900");
            txt_make_fill.setText("HONDA - the Power of Dreams");
            txt_model_fill.setText("Honda Airblade 160");
            txt_reg_date_fill.setText("2022");
            txt_transmission_fill.setText("Automatic");

            checkBox2.setChecked(false);
            checkBox3.setChecked(false);
            checkBox4.setChecked(false);
            checkBox5.setChecked(false);
            checkBox6.setChecked(false);
            checkBox7.setChecked(false);
            checkBox8.setChecked(false);
        });

        checkBox2.setOnClickListener(view -> {
            motorImageView.setImageResource(R.drawable.honda_click_160);
            txt_price.setText("SRP: P116,900");
            txt_make_fill.setText("HONDA - the Power of Dreams");
            txt_model_fill.setText("Honda Click 160");
            txt_reg_date_fill.setText("2022");
            txt_transmission_fill.setText("Automatic");

            checkBox.setChecked(false);
            checkBox3.setChecked(false);
            checkBox4.setChecked(false);
            checkBox5.setChecked(false);
            checkBox6.setChecked(false);
            checkBox7.setChecked(false);
            checkBox8.setChecked(false);
        });

        checkBox3.setOnClickListener(view -> {
            motorImageView.setImageResource(R.drawable.honda_beat);
            txt_price.setText("SRP: P69,900");
            txt_make_fill.setText("HONDA - the Power of Dreams");
            txt_model_fill.setText("Honda Beat Fashion Sport");
            txt_reg_date_fill.setText("2021");
            txt_transmission_fill.setText("Automatic");

            checkBox.setChecked(false);
            checkBox2.setChecked(false);
            checkBox4.setChecked(false);
            checkBox5.setChecked(false);
            checkBox6.setChecked(false);
            checkBox7.setChecked(false);
            checkBox8.setChecked(false);
        });

        checkBox4.setOnClickListener(view -> {
            motorImageView.setImageResource(R.drawable.pcx_160);
            txt_price.setText("SRP: P145,900");
            txt_make_fill.setText("HONDA - the Power of Dreams");
            txt_model_fill.setText("Honda PCX 160 - ABS(2021)");
            txt_reg_date_fill.setText("2021");
            txt_transmission_fill.setText("Automatic");

            checkBox.setChecked(false);
            checkBox2.setChecked(false);
            checkBox3.setChecked(false);
            checkBox5.setChecked(false);
            checkBox6.setChecked(false);
            checkBox7.setChecked(false);
            checkBox8.setChecked(false);
        });

        checkBox5.setOnClickListener(view -> {
            motorImageView.setImageResource(R.drawable.nmax);
            txt_price.setText("SRP: P150,800");
            txt_make_fill.setText("YAMAHA - Revs your Heart");
            txt_model_fill.setText("YAMAHA NMAX ABS 2022");
            txt_reg_date_fill.setText("2022");
            txt_transmission_fill.setText("Automatic");

            checkBox.setChecked(false);
            checkBox2.setChecked(false);
            checkBox3.setChecked(false);
            checkBox4.setChecked(false);
            checkBox6.setChecked(false);
            checkBox7.setChecked(false);
            checkBox8.setChecked(false);
        });

        checkBox6.setOnClickListener(view -> {
            motorImageView.setImageResource(R.drawable.tmax);
            txt_price.setText("SRP: P779,000");
            txt_make_fill.setText("YAMAHA - Revs your Heart");
            txt_model_fill.setText("YAMAHA TMAX TECH MAX");
            txt_reg_date_fill.setText("2021");
            txt_transmission_fill.setText("Automatic");

            checkBox.setChecked(false);
            checkBox2.setChecked(false);
            checkBox3.setChecked(false);
            checkBox4.setChecked(false);
            checkBox5.setChecked(false);
            checkBox7.setChecked(false);
            checkBox8.setChecked(false);
        });

        checkBox7.setOnClickListener(view -> {
            motorImageView.setImageResource(R.drawable.sniper_155);
            txt_price.setText("SRP: P123,900");
            txt_make_fill.setText("YAMAHA - Revs your Heart");
            txt_model_fill.setText("YAMAHA SNIPER 155 2023");
            txt_reg_date_fill.setText("2023");
            txt_transmission_fill.setText("Manual");

            checkBox.setChecked(false);
            checkBox2.setChecked(false);
            checkBox3.setChecked(false);
            checkBox4.setChecked(false);
            checkBox5.setChecked(false);
            checkBox6.setChecked(false);
            checkBox8.setChecked(false);
        });

        checkBox8.setOnClickListener(view -> {
            motorImageView.setImageResource(R.drawable.mio_gear_s);
            txt_price.setText("SRP: P84,400");
            txt_make_fill.setText("YAMAHA - Revs your Heart");
            txt_model_fill.setText("YAMAHA MIO GEAR S");
            txt_reg_date_fill.setText("2023");
            txt_transmission_fill.setText("Automatic");

            checkBox.setChecked(false);
            checkBox2.setChecked(false);
            checkBox3.setChecked(false);
            checkBox4.setChecked(false);
            checkBox5.setChecked(false);
            checkBox6.setChecked(false);
            checkBox7.setChecked(false);
        });

        theme1.setOnClickListener(view -> background.setBackgroundResource(R.drawable.honda));

        theme2.setOnClickListener(view -> background.setBackgroundResource(R.drawable.yamaha));

        theme3.setOnClickListener(view -> background.setBackgroundResource(R.drawable.suzuki));
    }
}
