public class Exception1 {
    public static void main(String[] args) {

        // Try and Multiple Catch block.
        try {
            String s = "string";
            int a = Integer.parseInt(s);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        
        // try catch and finally
        try {
            int[] arr = new int[5];
            for (int i = 0; i < 7; i++) {
                arr[i] = 10;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Block Executed");
        }

        // Nested Try blocks
        int a = 10;
        int b = 0;
        try {
            int c = a / b; 
            System.out.println(c);
            try {
                a = Integer.parseInt("Ram"); 
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage()); 
            }
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }




        // try finally
        try {
            int x = 10;
            int y = 0;
            int z = x / y;
            System.out.println(z);
        } finally {
            System.out.println("Second Finally Block");
        }
    }
}
