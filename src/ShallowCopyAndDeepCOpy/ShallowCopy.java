package ShallowCopyAndDeepCOpy;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student implements Cloneable {

    int number;
    String name;
    Address address;

    Student(int number, String name, Address address) {
        this.number = number;
        this.name = name;
        this.address = address;
    }

    // Shallow Copy
    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}

public class ShallowCopy {

    public static void main(String[] args) throws CloneNotSupportedException {

        // Create Address object
        Address address = new Address("Vizag");

        // Create original Student object
        Student student1 = new Student(101, "Sudheer", address);

        // Create shallow copy
        Student student2 = student1.clone();

        // Display before modification
        System.out.println("Before Modification:");
        System.out.println("Student 1 Name    : " + student1.name);
        System.out.println("Student 1 City    : " + student1.address.city);

        System.out.println("Student 2 Name    : " + student2.name);
        System.out.println("Student 2 City    : " + student2.address.city);

        System.out.println("--------------------------------");

        // Modify the nested Address object
        student2.address.city = "Hyderabad";

        // Display after modification
        System.out.println("After Modification:");
        System.out.println("Student 1 Name    : " + student1.name);
        System.out.println("Student 1 City    : " + student1.address.city);

        System.out.println("Student 2 Name    : " + student2.name);
        System.out.println("Student 2 City    : " + student2.address.city);

        System.out.println("--------------------------------");

        // Check references
        System.out.println("Student objects same? : " + (student1 == student2));
        System.out.println("Address objects same? : " + (student1.address == student2.address));
    }
}
//
//------------------------------------------------------------------------------------------------------------------------------------
//package ShallowCopyAndDeepCopy;
//
//class Address implements Cloneable {
//
//    String city;
//
//    Address(String city) {
//        this.city = city;
//    }
//
//    // Deep copy of Address
//    @Override
//    protected Address clone() throws CloneNotSupportedException {
//        return (Address) super.clone();
//    }
//}
//
//class Student implements Cloneable {
//
//    int number;
//    String name;
//    Address address;
//
//    Student(int number, String name, Address address) {
//        this.number = number;
//        this.name = name;
//        this.address = address;
//    }
//
//    // Deep Copy
//    @Override
//    protected Student clone() throws CloneNotSupportedException {
//
//        Student copy = (Student) super.clone();
//
//        // Create a separate Address object
//        copy.address = address.clone();
//
//        return copy;
//    }
//}
//
//public class DeepCopy {
//
//    public static void main(String[] args) throws CloneNotSupportedException {
//
//        // Create Address object
//        Address address = new Address("Vizag");
//
//        // Create original Student
//        Student student1 = new Student(101, "Sudheer", address);
//
//        // Create Deep Copy
//        Student student2 = student1.clone();
//
//        // Before modification
//        System.out.println("Before Modification:");
//
//        System.out.println("Student 1 Name : " + student1.name);
//        System.out.println("Student 1 City : " + student1.address.city);
//
//        System.out.println("Student 2 Name : " + student2.name);
//        System.out.println("Student 2 City : " + student2.address.city);
//
//        System.out.println("--------------------------------");
//
//        // Modify Student 2's Address
//        student2.address.city = "Hyderabad";
//
//        // After modification
//        System.out.println("After Modification:");
//
//        System.out.println("Student 1 Name : " + student1.name);
//        System.out.println("Student 1 City : " + student1.address.city);
//
//        System.out.println("Student 2 Name : " + student2.name);
//        System.out.println("Student 2 City : " + student2.address.city);
//
//        System.out.println("--------------------------------");
//
//        // Check references
//        System.out.println("Student objects same? : " + (student1 == student2));
//        System.out.println("Address objects same? : " + (student1.address == student2.address));
//    }
//}