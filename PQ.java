public class PQ {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("ERROR: Bitte genau zwei Argumente angeben");
      return;
    }

    double p = Double.parseDouble(args[0]);
    double q = Double.parseDouble(args[1]);

    double discriminant = p * p / 4 - q;

    if (discriminant > 0) {
      double x1 = -p / 2 + Math.sqrt(discriminant);
      double x2 = -p / 2 - Math.sqrt(discriminant);
      System.out.println("Es gibt zwei Nullstellen:");
      System.out.println("x1 = " + x1);
      System.out.println("x2 = " + x2);
    } else if (discriminant == 0) {
      double x1 = -p / 2;
      System.out.println("Es gibt genau eine Nullstelle:");
      System.out.println("x1 = " + x1);
    } else {
      System.out.println("Es gibt 0 Nullstellen");
    }
  }
}
