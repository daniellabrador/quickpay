public class DeductionSSS {
  // METHOD: Compute for SSS Deduction
  public static double calculate(double salary) {
    // Check if salary is less than or equal to 0
    if (salary <= 0) {
      return 0.0;
    }

    double semiMonthlyContribution = 0.0;
    double[] salaryRanges = {
      4249.99, 4749.99, 5249.99, 5749.99, 6249.99,
      6749.99, 7249.99, 7749.99, 8249.99, 8749.99,
      9249.99, 9749.99, 10249.99, 10749.99, 11249.99,
      11749.99, 12249.99, 12749.99, 13249.99, 13749.99,
      14249.99, 14749.99, 15249.99, 15749.99, 16249.99,
      16749.99, 17249.99, 17749.99, 18249.99, 18749.99,
      19249.99, 19749.99, Double.POSITIVE_INFINITY};
    double[] employeeContribution = {
      180.0, 202.5, 225.5, 247.5, 270.0, 
      292.50, 315.0, 337.5, 360.0, 382.5, 
      405.0, 427.5, 450.0, 472.5, 495.0, 
      517.5, 540.0, 562.5, 585.0, 607.5, 
      630.0, 652.5, 675.0, 697.5, 720.0, 
      742.5, 765.0, 787.5, 810.0, 832.5, 
      855.0, 877.5, 900.0};

    // Find the correct salary range and compute the semi-monthly contribution
    for (int i = 0; i < salaryRanges.length; i++) {
        if (salary <= salaryRanges[i]) {
            semiMonthlyContribution = employeeContribution[i] / 2;
            break;
        }
    }

    // Return the semi-monthly contribution
    return Math.round(semiMonthlyContribution * 100.0) / 100.0;
}
}
