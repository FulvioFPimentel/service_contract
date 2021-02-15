package entities;

import java.util.Date;

public class HourContract {

    private Date date;
    private double valuePerHour;
    private int hours;

    public HourContract(){
    }

    public HourContract(Date date, double valuePerHour, int hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public void setData(Date date){
        this.date = date;
    }
    public Date getDate(){
        return date;
    }

    public void setValuePerHour(double valuePerHour){
        this.valuePerHour = valuePerHour;
    }
    public double getValuePerHour(){
        return valuePerHour;
    }

    public void setHours(int hours){
        this.hours = hours;
    }
    public int getHours(){
        return hours;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }

}
