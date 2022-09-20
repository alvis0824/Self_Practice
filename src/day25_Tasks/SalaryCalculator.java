package day25_Tasks;

public class SalaryCalculator {

    public double hourlyRate;
    public double weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;

    public SalaryCalculator(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){

        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){

        return salary() * stateTaxRate;
    }

    public  double federalTax(){

        return salary() * federalTaxRate;
    }

    public double salaryAfterTax(){

        return salary() - stateTax() - federalTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "Salary =" + salary() +
                ", State Tax =" + stateTax() +
                ", Federal Tax =" + federalTax() +
                ", Salary After Tax =" + salaryAfterTax() +
                '}';
    }

    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator(50,40,0.13,0.3);

        System.out.println(salary1);
    }
}
