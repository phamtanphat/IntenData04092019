package com.example.intentdata04092019;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Sinhvien implements Parcelable {
    private String ten;
    private Integer tuoi;

    public Sinhvien(String ten, Integer tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    protected Sinhvien(Parcel in) {
        ten = in.readString();
        if (in.readByte() == 0) {
            tuoi = null;
        } else {
            tuoi = in.readInt();
        }
    }

    public static final Creator<Sinhvien> CREATOR = new Creator<Sinhvien>() {
        @Override
        public Sinhvien createFromParcel(Parcel in) {
            return new Sinhvien(in);
        }

        @Override
        public Sinhvien[] newArray(int size) {
            return new Sinhvien[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ten);
        if (tuoi == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(tuoi);
        }
    }
}
