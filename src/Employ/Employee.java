package Employ;

//public class Employee implements Comparable <Employee>{
//
//       private String name;
//       private long phone;
//       private int id;
//    @Override
//    public int compareTo(Employee o) {
//       // return (int) (this.phone-o.phone);
//        return this.id-o.id;
//    }
//    public Employee(String name, long phone, int id) {
//        this.name = name;
//        this.phone = phone;
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public long getPhone() {
//        return phone;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", phone=" + phone +
//                ", id=" + id +
//                '}';
//    }
//
//
//}


import java.util.Comparator;

public class Employee {

    private String name;
    private long phone;
    private int id;


    public Employee(String name, long phone, int id) {
        this.name = name;
        this.phone = phone;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", id=" + id +
                '}';
    }



}
