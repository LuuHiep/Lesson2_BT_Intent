package com.example.lau.lesson2_bt_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StudentInforActivity extends AppCompatActivity {

    private TextView tvTenStudent, tvQueQuan, tvNgaySinh, tvGioiTinh, tvLopHoc, tvKhoaHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);
        Anhxa();

        // nhận dữ liệu
        Intent intentStudenActivity = getIntent();
        Bundle bundle = intentStudenActivity.getBundleExtra("du lieu");
        if( bundle != null){

            String TenSV = (String) bundle.getString("ChuoiTen");
            tvTenStudent.setText(TenSV);
            Student student = (Student) bundle.getSerializable("doi tuong");
            tvQueQuan.setText(student.getQueQuan());
            tvNgaySinh.setText(student.getNgaySinh());
            tvGioiTinh.setText(student.getGioiTinh());
            tvLopHoc.setText(student.getLopHoc());
            tvKhoaHoc.setText(student.getKhoaHoc());
        }
    }

    private void Anhxa(){

        tvTenStudent = (TextView) findViewById(R.id.tvTenStudent);
        tvQueQuan = (TextView) findViewById(R.id.tvQueQuan);
        tvNgaySinh = (TextView) findViewById(R.id.tvNgaySinh);
        tvGioiTinh = (TextView) findViewById(R.id.tvGioiTinh);
        tvLopHoc = (TextView) findViewById(R.id.tvLopHoc);
        tvKhoaHoc = (TextView) findViewById(R.id.tvKhoaHoc);
    }
}
