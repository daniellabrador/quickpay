public class NetPay {
    // METHOD: Compute for net pay
    public static double calculate(double salary) {
      return salary - DeductionsTotal.calculate(salary);
    }
  
}
