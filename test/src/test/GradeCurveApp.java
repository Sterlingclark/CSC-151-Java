package test;
public class GradeCurveApp {
   public static void main(String[] args) {
      int grade = 95;
      GradeCurve curve = new GradeCurve();
      curve.lowerGrade(grade);
      System.out.println(grade);
   }
}

public class GradeCurve {
   public void lowerGrade(int g) {
      g -= 5;
   }
}