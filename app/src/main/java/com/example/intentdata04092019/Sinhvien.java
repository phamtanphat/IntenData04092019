package com.example.intentdata04092019;

public class Sinhvien {
    private String ten;
    private Integer tuoi;

    public Sinhvien(String ten, Integer tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }
}
