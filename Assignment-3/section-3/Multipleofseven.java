//3. Write a program to print all multiples of 7 between 1 and 100. 

public class Multipleofseven {
    public static void main(String[] args) {
        System.out.println("Multiples of 7 between 1 and 100:");

        for (int i = 7; i <= 100; i += 7) {  // i+= is Increment by 7
            System.out.print(i + " ");
        }
    }
}

//op: Multiples of 7 between 1 and 100:
7 14 21 28 35 42 49 56 63 70 77 84 91 98