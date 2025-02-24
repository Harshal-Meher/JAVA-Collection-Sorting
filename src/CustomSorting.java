import java.util.*;

public class CustomSorting {
    String name;
    int age;

    CustomSorting(String name , int age) {
        this.name = name;
        this.age =age;
    }

    @Override
    public String toString() {
        return name + " - "+ age;
    }

     static class AgeComparable implements Comparator<CustomSorting> {

         @Override
         public int compare(CustomSorting o1, CustomSorting o2) {
             return Integer.compare(o1.age , o2.age);
         }
     }
    public static void main(String[] args) {

        List<CustomSorting> list = new ArrayList<>(Arrays.asList(
                new CustomSorting("Arman" , 19),
                new CustomSorting("Jay" , 29),
                new CustomSorting("Akshy" , 21),
                new CustomSorting("Akash" , 20),
                new CustomSorting("Raj" , 39)
        ));

        Collections.sort(list,new AgeComparable());
        System.out.println("Custom Sorting : "+list);
    }
}
