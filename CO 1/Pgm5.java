import java.util.Scanner;

class CPU {
    double price;

    CPU(double price) {
        this.price = price;
    }

    class Processor {
        int no_of_cores;
        String manufacturer;

        void processorDetails(Scanner read) {
            System.out.print("Enter no.of cores in processor:");
            no_of_cores = read.nextInt();
            read.nextLine();
            System.out.print("Enter the manufacturer name:");
            manufacturer = read.nextLine();
        }
        void display(){
            System.out.println("Processor Details");
            System.out.println("__________________");
            System.out.println("\nextLineNo of Cores : "+no_of_cores+"\nManufacturer : "+manufacturer+"\n");
        }
    }

    static class RAM {
        int memory;
        String manufacturer;
        void ramDetails(Scanner read) {
            System.out.print("Enter the size of memory(in GB):");
            memory = read.nextInt();
            read.nextLine();
            System.out.print("Enter the manufacturer name:");
            manufacturer = read.nextLine();
        }
        void display(){
            System.out.println("Memory Details");
            System.out.println("__________________");
            System.out.println("\nMemory size : "+memory+"GB\nManufacturer : "+manufacturer+"\n");
        }
    }
}

public class Pgm5 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.print("\nEnter the price of the cpu:");
        double price = read.nextDouble();
        CPU c1 = new CPU(price);
        CPU.Processor p1= c1.new Processor();
        CPU.RAM r1=new CPU.RAM();
        p1.processorDetails(read);
        r1.ramDetails(read);
        p1.display();
        r1.display();
    }
}