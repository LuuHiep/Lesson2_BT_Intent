package com.example.lau.lesson2_bt_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentActivity extends AppCompatActivity {

    private TextView tvTen;
    private EditText etQueQuan, etNgaySinh, etGioiTinh, etLopHoc, etKhoaHoc;
    private Button btnStudentInfor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        Anhxa();

        // nhận dữ liệu Intent
        Intent intentMain = getIntent();
        String ten_nhap_vao = intentMain.getStringExtra("Ten Nhap Vao");
        tvTen.setText( ten_nhap_vao );

        btnStudentInfor.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String QueQuan = etQueQuan.getText().toString();
                String NgaySinh = etNgaySinh.getText().toString();
                String GioiTinh = etGioiTinh.getText().toString();
                String LopHoc = etLopHoc.getText().toString();
                String KhoaHoc = etKhoaHoc.getText().toString();

                if ( QueQuan.length() == 0 || NgaySinh.length()==0 || GioiTinh.length() == 0 ||
                        LopHoc.length() == 0 || KhoaHoc.length() == 0 ){
                    Toast.makeText(StudentActivity.this,"Bạn chưa nhập đủ thông tin",Toast.LENGTH_SHORT).show();

                } else {
                    // Truyền dự liệu sang StudentInforActivity

                    Intent intentStudentInfor = new Intent(StudentActivity.this, StudentInforActivity.class);
                    Student student = new Student(etQueQuan.getText().toString(), etNgaySinh.getText().toString(), etGioiTinh.getText().toString(),
                            etLopHoc.getText().toString(),etKhoaHoc.getText().toString());
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("doi tuong", student);
                        bundle.putString("ChuoiTen",tvTen.getText().toString());
                        intentStudentInfor.putExtra("du lieu",bundle);
                    startActivity(intentStudentInfor);

                };
            }
        });
    }

    private void Anhxa(){

        tvTen = (TextView) findViewById(R.id.tvTên);
        etQueQuan = (EditText) findViewById(R.id.etQueQuan);
        etNgaySinh = (EditText) findViewById(R.id.etNgaySinh);
        etGioiTinh = (EditText) findViewById(R.id.etGioiTinh);
        etLopHoc = (EditText) findViewById(R.id.etLopHoc);
        etKhoaHoc = (EditText) findViewById(R.id.etKhoaHoc);
        btnStudentInfor = (Button) findViewById(R.id.btnStudentInfor);
    }
}
