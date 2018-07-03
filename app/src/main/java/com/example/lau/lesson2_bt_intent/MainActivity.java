package com.example.lau.lesson2_bt_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etTen;
    private Button btnStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();

        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Ten = etTen.getText().toString();
                if(Ten.length() == 0 ){

                    Toast.makeText(MainActivity.this, "Bạn chưa nhập tên", Toast.LENGTH_SHORT).show();

                }else {
                    // Truyền dữ liệu sang StudentActivity
                    Intent intentStudent = new Intent(MainActivity.this, StudentActivity.class);
                    intentStudent.putExtra("Ten Nhap Vao", Ten);
                    startActivity(intentStudent);
                    finish();

                }
            }
        });
    }

    private void Anhxa(){

        etTen = (EditText) findViewById(R.id.etTen);
        btnStudent = (Button) findViewById(R.id.btnStudent);
    }
}
