package poc;
import java.util.Scanner;

public class Naukari {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("        NAUKRI JOB PORTAL");
            System.out.println("======================================");
            System.out.println("1. Search Jobs");
            System.out.println("2. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    searchJob();
                    break;

                case 2:
                    System.out.println("\nThank You for Visiting Naukri Portal.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 2);

    }

    static void searchJob() {

        sc.nextLine();

        System.out.print("\nEnter Name : ");
        String name = sc.nextLine();

        System.out.println("\nSelect Qualification");
        System.out.println("1.B.Tech");
        System.out.println("2.BCA");
        System.out.println("3.MCA");
        System.out.println("4.B.Sc");

        System.out.print("Choice : ");
        int q = sc.nextInt();

        System.out.println("\nExperience");
        System.out.println("1.Fresher");
        System.out.println("2.Experienced");

        System.out.print("Choice : ");
        int exp = sc.nextInt();

        System.out.println("\nSelect Preferred Role");

        System.out.println("1.Java Developer");
        System.out.println("2.Python Developer");
        System.out.println("3.Web Developer");
        System.out.println("4.Data Analyst");
        System.out.println("5.Tester");

        System.out.print("Choice : ");

        int role = sc.nextInt();

        boolean java = false;
        boolean sql = false;
        boolean html = false;
        boolean css = false;
        boolean python = false;
        boolean excel = false;

        System.out.print("\nHow many skills do you have ? ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nSelect Skill " + i);

            System.out.println("1.Java");
            System.out.println("2.SQL");
            System.out.println("3.HTML");
            System.out.println("4.CSS");
            System.out.println("5.Python");
            System.out.println("6.Excel");

            int skill = sc.nextInt();

            switch (skill) {

                case 1:
                    java = true;
                    break;

                case 2:
                    sql = true;
                    break;

                case 3:
                    html = true;
                    break;

                case 4:
                    css = true;
                    break;

                case 5:
                    python = true;
                    break;

                case 6:
                    excel = true;
                    break;

                default:
                    System.out.println("Invalid Skill");
            }

        }

        System.out.println("\n================================");
        System.out.println("Candidate : " + name);
        System.out.println("Matching Jobs");
        System.out.println("================================");

        if (role == 1) {

            if (java && sql) {

                System.out.println("\nCompany : TCS");
                System.out.println("Role : Java Developer");
                System.out.println("Location : Hyderabad");
                System.out.println("Salary : 4.5 LPA");

                System.out.println();

                System.out.println("Company : Infosys");
                System.out.println("Role : Java Developer");
                System.out.println("Location : Bengaluru");
                System.out.println("Salary : 5 LPA");

            } else {

                System.out.println("No Matching Jobs.");
                System.out.println("Required Skills : Java + SQL");

            }

        }

        else if (role == 2) {

            if (python) {

                System.out.println("\nCompany : Capgemini");
                System.out.println("Role : Python Developer");
                System.out.println("Location : Pune");
                System.out.println("Salary : 5.2 LPA");

            } else {

                System.out.println("Need Python Skill");

            }

        }

        else if (role == 3) {

            if (html && css) {

                System.out.println("\nCompany : Wipro");
                System.out.println("Role : Web Developer");
                System.out.println("Location : Chennai");
                System.out.println("Salary : 4 LPA");

            } else {

                System.out.println("Need HTML and CSS");

            }

        }

        else if (role == 4) {

            if (sql && excel) {

                System.out.println("\nCompany : Accenture");
                System.out.println("Role : Data Analyst");
                System.out.println("Location : Hyderabad");
                System.out.println("Salary : 6 LPA");

            } else {

                System.out.println("Need SQL and Excel");

            }

        }

        else if (role == 5) {

            System.out.println("\nCompany : Cognizant");
            System.out.println("Role : Manual Tester");
            System.out.println("Location : Bengaluru");
            System.out.println("Salary : 4.2 LPA");

        }

        else {

            System.out.println("Invalid Role");

        }

    }

}