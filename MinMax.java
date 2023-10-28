public class MinMax {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("ERROR 1: Keine Argumente übergeben.");
        } else {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        }
    }
}
