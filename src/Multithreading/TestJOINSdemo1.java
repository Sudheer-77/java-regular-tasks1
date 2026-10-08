package Multithreading;

class Employee extends Thread {

    String name;
    int salary;

    public Employee(String name, int salary) {
        super();
        this.name = name;
        this.salary = salary;
    }

    public void run() {

        System.out.println(name + " salary calculation started");

        // Simulate salary calculation
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " salary = " + salary);
    }
}

public class TestJOINSdemo1 {

    public static void main(String[] args) {

        Employee E1 = new Employee("Raju", 30000);
        Employee E2 = new Employee("Bhanu", 30500);
        Employee E3 = new Employee("Dileep", 31000);
        Employee E4 = new Employee("Jagadesh", 33000);
        Employee E5 = new Employee("Mahesh", 50000);

        // Start all employee threads
        E1.start();
        E2.start();
        E3.start();
        E4.start();
        E5.start();

        // Main thread waits for all employee threads
        try {
            E1.join();
            E2.join();
            E3.join();
            E4.join();
            E5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Calculate total salary
        double totalSalary =
                E1.salary +
                E2.salary +
                E3.salary +
                E4.salary +
                E5.salary;

        // Display total
        System.out.println("Total Salary = " + totalSalary);
    }
}