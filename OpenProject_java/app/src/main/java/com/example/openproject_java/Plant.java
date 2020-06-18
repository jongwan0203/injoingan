package com.example.openproject_java;

//유저의 식물의 정보를 저장하는 객체
//2018038092 안준
public class Plant {
    public String plant_name;
    public Double plant_MinTemp;
    public Double plnat_MaxTemp;
    public Long plnat_MinMoisture;
    public Long plant_MaxMoisture;

    public Plant(){
        this.plant_name = null;
        this.plant_MinTemp = null;
        this.plnat_MaxTemp = null;
        this.plnat_MinMoisture = null;
        this.plant_MaxMoisture = null;
    }

    public Plant(String plant_name, Double plant_MinTemp, Double plnat_MaxTemp, Long plnat_MinMoisture, Long plant_MaxMoisture){

        this.plant_name = plant_name;
        this.plant_MinTemp = plant_MinTemp;
        this.plnat_MaxTemp = plnat_MaxTemp;
        this.plnat_MinMoisture = plnat_MinMoisture;
        this.plant_MaxMoisture = plant_MaxMoisture;
    }
}
