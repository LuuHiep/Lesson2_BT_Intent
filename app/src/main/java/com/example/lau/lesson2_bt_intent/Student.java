package com.example.lau.lesson2_bt_intent;

import java.io.Serializable;

public class Student implements Serializable {

    private String QueQuan;
    private String GioiTinh;
    private String NgaySinh;
    private String LopHoc;
    private String KhoaHoc;

    public Student(String queQuan, String gioiTinh, String ngaySinh, String lopHoc, String khoaHoc) {

        QueQuan = queQuan;
        GioiTinh = gioiTinh;
        NgaySinh = ngaySinh;
        LopHoc = lopHoc;
        KhoaHoc = khoaHoc;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getLopHoc() {
        return LopHoc;
    }

    public void setLopHoc(String lopHoc) {
        LopHoc = lopHoc;
    }

    public String getKhoaHoc() {
        return KhoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        KhoaHoc = khoaHoc;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }
}
