public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
       if(daysSkipped>=5) return 0.85;
           return 1;
    }

    public int bonusMultiplier(int productsSold) {
return productsSold>=20 ? 13: 10;
    }

    public double bonusForProductsSold(int productsSold) {
       return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
double salary =  bonusForProductsSold(productsSold)+ 1000 * salaryMultiplier(daysSkipped);
       return salary>=2000.00? 2000.00 : salary;
    } 
}
