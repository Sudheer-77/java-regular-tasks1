package poc;

class BookMyShow {

    int total_ticktes = 10;

    void bookMyTicktes(String name, int ticktes) {

        try {

            System.out.println(name + " entered booking");

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        if (ticktes <= total_ticktes) {

            total_ticktes = total_ticktes - ticktes;

            System.out.println("Your tickets have been booked successfully Mr/Ms: " + name);
            System.out.println("Your total booked tickets are: " + ticktes);
            System.out.println("Available tickets are: " + total_ticktes);

        } else {

            System.err.println(name + " - Tickets have been sold out");
            System.err.println("Available tickets are: " + total_ticktes);
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