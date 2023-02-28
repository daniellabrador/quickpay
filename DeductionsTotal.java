public class DeductionsTotal {
  public static double calculate(double salary) {
    if (salary <= 0) {
      throw new IllegalArgumentException("Salary must be greater than 0");
    }
    
    double totalDeductions = 
      DeductionSSS.calculate(salary)
      + DeductionPhilHealth.calculate(salary)
      + DeductionPagIbig.calculate(salary)
      + DeductionTax.calculate(salary);

    return Math.round(totalDeductions * 100.0) / 100.0;
  }
}
