package com.example.Lab_AND103_PD07016.model;

public class Province {
    private int ProvinceID;
    private String ProvinceName;

    public Province(int provinceID, String provinceName) {
        ProvinceID = provinceID;
        ProvinceName = provinceName;
    }

    public int getProvinceID() {
        return ProvinceID;
    }

    public void setProvinceID(int provinceID) {
        ProvinceID = provinceID;
    }

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String provinceName) {
        ProvinceName = provinceName;
    }
}
