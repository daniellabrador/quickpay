/** 
 * Main Class
 * Description: This class computes the total deductions and net pay of an employee
 * Partner: Jemriz Advincula
 */

public class QuickPay {
  // Test values
  public static void testCase(double salary) {
      System.out.println("Salary: " + salary);
      System.out.println("Income Tax: " + DeductionTax.calculate(salary));
      System.out.println("SSS Deduction: " + DeductionSSS.calculate(salary));
      System.out.println("Pag-IBIG Deduction: " + DeductionPagIbig.calculate(salary));
      System.out.println("PhilHealth Deduction: " + DeductionPhilHealth.calculate(salary));
      System.out.println("Total Deductions: " + DeductionsTotal.calculate(salary));
      System.out.println("Net Pay: " + NetPay.calculate(salary));
  }

  public static void main(String[] args){
    // Test Case 1
    testCase(33332.0);
    System.out.println();

    // Test Case 2
    testCase(33333.0);
    System.out.println();

    // Test Case 3
    testCase(8450.0);
    System.out.println();

    // Test Case 4
    testCase(15000.0);
    System.out.println();

    // Test Case 5
    testCase(1000000.0);
    System.out.println();

    // Test Case 6
    testCase(0);
    System.out.println();

    // Test Case 7
    testCase(-10000.0);
    System.out.println();
  }
}