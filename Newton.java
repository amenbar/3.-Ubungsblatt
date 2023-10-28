public class Newton {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("ERROR: keine Argumente übergeben");
            return;
        }

        double c = Double.parseDouble(args[0]);

        if (c <= 0) {
            System.out.println("ERROR: kann keine Wurzel aus negativen Zahlen ziehen");
            return;
        }

        double t = c; // Initialize t with an initial guess
        while (Math.abs(t * t - c) > 0.0001) { // Use > for comparison and adjust the loop condition
            t = (t + c / t) / 2;
        }

        System.out.println(t);
    }
}
