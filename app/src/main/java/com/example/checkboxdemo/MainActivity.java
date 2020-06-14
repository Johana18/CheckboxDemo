package com.example.checkboxdemo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbAndroid, cbJava,cbPhp,cbCmas;
    Button btSumbit;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbAndroid = findViewById(R.id.cb_android);
        cbJava = findViewById(R.id.cb_java);
        cbPhp = findViewById(R.id.cb_php);
        cbCmas = findViewById(R.id.cb_Cmas);
        btSumbit = findViewById(R.id.bt_sumbit);
        tvOutput = findViewById(R.id.output);

        Button btSumbit = (Button) findViewById(R.id.bt_sumbit);
        btSumbit.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                validar();
            }
        });

    /*    btSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if (cbAndroid.isChecked()){
                    s += "\n Android";
                }
                if (cbJava.isChecked()){
                    s += "\n Java";
                }
                if (cbPhp.isChecked()){
                    s += "\n Php";
                }
                tvOutput.setText(s);
            }
        });*/
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void validar(){
        String s = "";
        if(cbAndroid.isChecked()) {
            cbAndroid.setTextColor(getResources().getColor(R.color.colorBalck));
            cbAndroid.setButtonTintList(getResources().getColorStateList(R.color.colorBalck));
            s += "\n Android";
        }
        if(cbJava.isChecked()){
            cbJava.setTextColor(getResources().getColor(R.color.colorBalck));
            cbJava.setButtonTintList(getResources().getColorStateList(R.color.colorBalck));
            s += "\n Java";
        }
        if(cbCmas.isChecked()){
            cbCmas.setTextColor(getResources().getColor(R.color.colorBad));
            cbCmas.setButtonTintList(getResources().getColorStateList(R.color.colorBad));
            s += "\n C++";
        }
        if(cbPhp.isChecked()){
            cbPhp.setTextColor(getResources().getColor(R.color.colorBad));
            cbPhp.setButtonTintList(getResources().getColorStateList(R.color.colorBad));
            s += "\n Php";
        }

        tvOutput.setText(s);


    }
}
