package poc;

class BookMyShow {

    int total_ticktes = 10;

    synchronized void bookMyTicktes(String name, int ticktes) {

        try {

            System.out.println(name + " entered booking");

            if (ticktes <= total_ticktes) {

                System.out.println(name + " checking tickets...");

                Thread.sleep(2000);

                total_ticktes = total_ticktes - ticktes;

                System.out.println(name + " booking successful");
                System.out.println("Booked tickets: " + ticktes);
                System.out.println("Available tickets: " + total_ticktes);

            } else {

                System.out.println(name + " - Tickets sold out");
                System.out.println("Available tickets: " + total_ticktes);
            }

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}

class Customer extends Thread {

    BookMyShow bms;
    String customerName;
    int ticktes;

    public Customer(BookMyShow bms, String customerName, int ticktes) {

        this.bms = bms;
        this.customerName = customerName;
        this.ticktes = ticktes;
    }

    public void run() {

        bms.bookMyTicktes(customerName, ticktes);
    }
}

public class TestdemoBookMyShow {

    public static void main(String[] args) {

        BookMyShow bms = new BookMyShow();

        Customer sudheer = new Customer(bms, "sudheer", 7);
        Customer dileep = new Customer(bms, "dileep", 8);

        sudheer.start();
        dileep.start();
    }
}


//************************************************************************************************************************
//package poc;
//
//class BookMyShow {
//
//    int total_ticktes = 10;
//
//    void bookMyTicktes(String name, int ticktes) {
//
//        try {
//
//            System.out.println(name + " entered booking");
//
//            if (ticktes <= total_ticktes) {
//
//                System.out.println(name + " checking tickets...");
//
//                Thread.sleep(2000);
//
//                total_ticktes = total_ticktes - ticktes;
//
//                System.out.println(name + " booking successful");
//                System.out.println("Booked tickets: " + ticktes);
//                System.out.println("Available tickets: " + total_ticktes);
//
//            } else {
//
//                System.out.println(name + " - Tickets sold out");
//                System.out.println("Available tickets: " + total_ticktes);
//            }
//
//        } catch (InterruptedException e) {
//
//            e.printStackTrace();
//        }
//    }
//}
//
//class Customer extends Thread {
//
//    BookMyShow bms;
//    String customerName;
//    int ticktes;
//
//    public Customer(BookMyShow bms, String customerName, int ticktes) {
//
//        this.bms = bms;
//        this.customerName = customerName;
//        this.ticktes = ticktes;
//    }
//
//    public void run() {
//
//        bms.bookMyTicktes(customerName, ticktes);
//    }
//}
//
//public class TestdemoBookMyShow {
//
//    public static void main(String[] args) {
//
//        BookMyShow bms = new BookMyShow();
//
//        Customer sudheer = new Customer(bms, "sudheer", 7);
//        Customer dileep = new Customer(bms, "dileep", 8);
//
//        sudheer.start();
//        dileep.start();
//    }
//}

//****************************************
//output:
//dileep entered booking
//sudheer entered booking
//Your tickets have been booked successfully Mr/Ms: dileep
//Your tickets have been booked successfully Mr/Ms: sudheer
//Your total booked tickets are: 7
//Your total booked tickets are: 8
//Available tickets are: -5
//Available tickets are: -5
