public class Main {
    public static void main(String[] args) {

       int x = 3;
       int y = 4;

        int z = add(x,y);

        System.out.println(z); // displays sum of x and y | alternative: System.out.println(add(x,y));
    }

// creating method that will sum these two numbers and display the result | to return value: list data type (void used when not returning values)
// int declared twice, known as local variables {}
static int add(int x, int y) {

     int z = x + y;
     return z; // alternative: return x+y
    }

}