package com.example.javakethua;

public class Student {
String masv;
double diemtb;
String email;

    public Student() {
    }

    public Student(String masv, double diemtb, String email) {
        this.masv = masv;
        this.diemtb = diemtb;
        this.email = email;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public double getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(double diemtb) {
        this.diemtb = diemtb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
