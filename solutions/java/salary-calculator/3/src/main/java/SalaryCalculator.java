public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        //throw new UnsupportedOperationException("Please implement the SalaryCalculator.salaryMultiplier() method");
        return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        //throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusMultiplier() method");
        return productsSold <= 19 ? 10 : 13 ;    
    }

    public double bonusForProductsSold(int productsSold) {
        //throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusForProductsSold() method");
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        //throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
        return 1000*salaryMultiplier(daysSkipped)+bonusForProductsSold(productsSold) >= 2000 ?2000 :  1000*salaryMultiplier(daysSkipped)+bonusForProductsSold(productsSold);
    } 
}
