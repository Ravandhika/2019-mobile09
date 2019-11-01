package com.example.proyek3.tankModels;

public class tankModel {
    public String tankName,tankDesc;
    public int TankImg;

    public tankModel(String tankName, String tankDesc, int tankImg) {
        this.tankName = tankName;
        this.tankDesc = tankDesc;
        TankImg = tankImg;
    }

    public String getTankName() {
        return tankName;
    }

    public void setTankName(String tankName) {
        this.tankName = tankName;
    }

    public String getTankDesc() {
        return tankDesc;
    }

    public void setTankDesc(String tankDesc) {
        this.tankDesc = tankDesc;
    }

    public int getTankImg() {
        return TankImg;
    }

    public void setTankImg(int tankImg) {
        TankImg = tankImg;
    }
}