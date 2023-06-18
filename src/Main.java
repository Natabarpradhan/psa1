

//import Employ.Employee;
//
//import java.util.ArrayList;
//import java.util.Collections;
//public class Main {
//    public static void main(String[] args) {
////        ArrayList<Integer> marks=new ArrayList<>();
////                marks.add(222);
////                marks.add(142);
////                marks.add(424);
////                System.out.println(marks);
////                Collections.sort(marks);
////                System.out.println(marks);
//
//        ArrayList<Employee> marks=new ArrayList<>();
//        marks.add(new Employee("Nataber",89843,3425));
//        marks.add(new Employee("MrTautor",8568,3787));
//        marks.add(new Employee("Krishna",8983,345));
//        System.out.println(marks);
//        Collections.sort(marks);
//       //comparable
//       System.out.println(marks);
//
//            }
//        }


import Employ.Employee;

import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> marks=new ArrayList<>();
//                marks.add(222);
//                marks.add(142);
//                marks.add(424);
//                System.out.println(marks);
//                Collections.sort(marks);
//                System.out.println(marks);

//        ArrayList<Employee> marks =new ArrayList<>();
//        marks.add(new Employee("Nataber",89843,3425));
//        marks.add(new Employee("MrTautor",8568,3787));
//        marks.add(new Employee("Krishna",8983,345));
//        System.out.println(marks);
//      Collections.sort(marks);
//        System.out.println(marks);


//comparator
        ArrayList<Employee> marks =new ArrayList<>();
        marks.add(new Employee("Nataber",89843,3425));
        marks.add(new Employee("MrTautor",8568,3787));
        marks.add(new Employee("Krishna",8983,345));
        System.out.println(marks);
        Collections.sort(marks,new IdComparator());
        System.out.println(marks);
            }
        }

