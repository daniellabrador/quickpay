public class DeductionPhilHealth {
  
  // METHOD: Compute for PhilHealth Deduction
  public static double calculate(double salary) {
    // Check if salary is less than or equal to 0
    if (salary <= 0) return 0.0;

    // Calculate and return PhilHealth deduction
    return Math.round(salary * 0.02 * 100.0) / 100.0;
  }
}
