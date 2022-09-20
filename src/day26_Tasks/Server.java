package day26_Tasks;

import java.time.LocalDate;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;
    public LocalDate hire_date;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime, LocalDate hire_date) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.hire_date = hire_date;
    }

    public void takeOrder(){
        System.out.println(name + " is taking an order");
    }

    public void cleanTable(){
        System.out.println(name + " is cleaning the table");
    }

    public String fullTime(){
        String result = "full-time";
        if(!fullTime){
            result = "part-time";
        }
        return result;
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime()  +
                ", hire_date=" + hire_date +
                '}';



    }

    public static void main(String[] args) {
        System.out.println("Hello world");

    }
}
