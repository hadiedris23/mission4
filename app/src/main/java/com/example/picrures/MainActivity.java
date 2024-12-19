package com.example.picrures;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    private EditText et_num1, et_num2;
    private TextView tv_results;
    private Button btn_Plus, btn_Minus, btn_Devide, btn_Times, btn_Test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_num1 = findViewById(R.id.etNum1);
        et_num2 = findViewById(R.id.etNum2);
        tv_results = findViewById(R.id.tvResult);
        btn_Plus = findViewById(R.id.btnPlus);
        btn_Minus = findViewById(R.id.btnMinus);
        btn_Devide = findViewById(R.id.btnDevide);
        btn_Times = findViewById(R.id.btnTimes);
        btn_Test = findViewById(R.id.btnTest);
        btn_Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1, num2;
                num1 = Integer.parseInt(et_num1.getText().toString());
                num2 = Integer.parseInt(et_num2.getText().toString());
                tv_results.setText(String.valueOf(num1+num2));
            }
        });
        btn_Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1, num2;
                num1 = Integer.parseInt(et_num1.getText().toString());
                num2 = Integer.parseInt(et_num2.getText().toString());
                tv_results.setText(String.valueOf(num1-num2));
            }
        });
        btn_Devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1, num2;
                num1 = Integer.parseInt(et_num1.getText().toString());
                num2 = Integer.parseInt(et_num2.getText().toString());
                if(num2 != 0){
                    tv_results.setText(String.valueOf(num1/num2));
                }
                else {
                    Toast.makeText(MainActivity.this, "num2 is zero, change it", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_Times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 , num2;
                num1 = Integer.parseInt(et_num1.getText().toString());
                num2 = Integer.parseInt(et_num2.getText().toString());
                tv_results.setText(String.valueOf(num1*num2));
            }
        });
        btn_Test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1, num2;
                Random random = new Random();
                num1 = random.nextInt(10);
                num2 = random.nextInt(10);
                et_num1.setText(String.valueOf(num1));
                et_num2.setText(String.valueOf(num2));            }
        });
    }
}