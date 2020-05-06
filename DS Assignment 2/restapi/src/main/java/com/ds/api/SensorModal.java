package com.ds.api;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alarm")
public class SensorModal {
    @Id
    private int SensorID;
    private int Room_Number;
    private int Floor_Number;
    private int CO2;
    private int Smoke;
    private int Alarm_Status;


    public SensorModal() {
    }

    public SensorModal(int SensorID, int Room_Number,int Floor_Number,int CO2,int Smoke,int Alarm_Status) {
        this.SensorID =SensorID;
        this.Room_Number =Room_Number;
        this.Floor_Number =Floor_Number;
        this.CO2 =CO2;
        this.Smoke =Smoke;
        this.Alarm_Status =Alarm_Status;
    }

    public int getSensorID() {
        return SensorID;
    }

    public void setSensorID(int sensorID) {
        SensorID = sensorID;
    }

    public int getRoom_Number() {
        return Room_Number;
    }

    public void setRoom_Number(int room_Number) {
        Room_Number = room_Number;
    }

    public int getFloor_Number() {
        return Floor_Number;
    }

    public void setFloor_Number(int floor_Number) {
        Floor_Number = floor_Number;
    }

    public int getCO2() {
        return CO2;
    }

    public void setCO2(int CO2) {
        this.CO2 = CO2;
    }

    public int getSmoke() {
        return Smoke;
    }

    public void setSmoke(int smoke) {
        Smoke = smoke;
    }

    public int getAlarm_Status() {
        return Alarm_Status;
    }

    public void setAlarm_Status(int alarm_Status) {
        Alarm_Status = alarm_Status;
    }

    @Override
    public String toString() {
        return "SensorModal{" +
                "SensorID=" + SensorID +
                ", Room_Number=" + Room_Number +
                ", Floor_Number=" + Floor_Number +
                ", CO2=" + CO2 +
                ", Smoke=" + Smoke +
                ", Alarm_Status=" + Alarm_Status +
                '}';
    }
}
