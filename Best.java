public class Best {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        int num = Integer.parseInt(args[0]);

        if (num > 0) {
            System.out.println("P");
        } else {
            System.out.println("N");
        }
    }
}
