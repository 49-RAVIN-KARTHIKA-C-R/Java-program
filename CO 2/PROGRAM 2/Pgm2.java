/* Search an element in an array.*/

import java.util.Scanner;

class StringArray {
    String[] str;

    StringArray(String[] str) {
        this.str = str;
    }

    void search(Scanner read) {
        String item;
        System.out.print("Enter the Item to be searched :");
        item = read.nextLine();
        for (int i = 0; i < str.length; i++) {
            if (item.equals(str[i])) {
                System.out.println("Item found in the array!!!");
                return;
            }
        }
        System.out.println("Item not found!!!");
    }
}

public class Pgm2{
    public static void main(String args[]) {
        int limit;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the limit:");
        limit = read.nextInt();
        read.nextLine();
        String[] str = new String[limit];
        System.out.print("Enter Array Elements:");
        for (int i = 0; i < limit; i++) {
            str[i] = read.nextLine();
        }
        StringArray s = new StringArray(str);
        s.search(read);
    }
}