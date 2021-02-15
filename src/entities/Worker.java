package entities;
import enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private double baseSalary;

    public Departament departament;
    public List<HourContract> contracts = new ArrayList();

    public Worker(){
    }

    public Worker(String name, WorkerLevel level, double baseSalary, Departament departament){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLevel(WorkerLevel level){
        this.level = level;
    }
    public WorkerLevel getLevel(){
        return level;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public Departament getDepartament() {
        return departament;
    }
    public void setDepartament(Departament departament){
        this.departament = departament;
    }

    public List<HourContract> getContracts(){
        return contracts;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();

        for (HourContract c : contracts){
            cal.setTime(c.getDate());                   /* setar o valor data no paramentro, para o calendario */
            int valueYear = cal.get(Calendar.YEAR);
            int valueMonth = 1 + cal.get(Calendar.MONTH);

                 if (year == valueYear && month == valueMonth){
                     sum += c.totalValue();
                 }
        }
        return sum;
    }
}
