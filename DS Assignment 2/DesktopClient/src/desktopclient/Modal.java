/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopclient;

/**
 *
 * @author mac
 */
public class Modal {
    public int SensorID;
    public int RoomNumber;
    public int FloorNumber;
    public int CO2;
    public int Smoke;
    public int AlarmStatus;

    public Modal(int SensorID, int RoomNumber, int FloorNumber, int CO2, int Smoke, int AlarmStatus) {
        this.SensorID = SensorID;
        this.RoomNumber = RoomNumber;
        this.FloorNumber = FloorNumber;
        this.CO2 = CO2;
        this.Smoke = Smoke;
        this.AlarmStatus = AlarmStatus;
    }

    public int getSensorID() {
        return SensorID;
    }

    public void setSensorID(int SensorID) {
        this.SensorID = SensorID;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public int getFloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(int FloorNumber) {
        this.FloorNumber = FloorNumber;
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

    public void setSmoke(int Smoke) {
        this.Smoke = Smoke;
    }

    public int getAlarmStatus() {
        return AlarmStatus;
    }

    public void setAlarmStatus(int AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }
    
    
}
