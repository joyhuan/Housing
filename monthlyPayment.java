public class MonthlyPayment {
    public static void main(String args[]) {
      double interestRate = 0.03;
      double rate = Math.pow(1.0 + interestRate/12, 1.0);
      double initialPrinciple = 1600000;
      int totalMonth = 360;
      double monthlyPayment = Math.pow(rate, totalMonth) * (rate - 1) * initialPrinciple/ (Math.pow(rate, totalMonth) - 1);

      System.out.println(rate);
      System.out.println(monthlyPayment);
      interestRate = 0.06;
      rate = Math.pow(1.0 + interestRate/12, 1.0);
      monthlyPayment = Math.pow(rate, totalMonth) * (rate - 1) * initialPrinciple/ (Math.pow(rate, totalMonth) - 1);
      System.out.println(monthlyPayment);
      
     //   double interest = rate - 1;
     //   double mmonthlyPayment = Math.pow(interest+1, totalMonth) * interest * initialPrinciple/ (Math.pow(1 + interest, totalMonth) - 1);
     //   System.out.println(mmonthlyPayment);
    }
}
