public class Main {
    public static void main(String[] args) {

        String s1 = "Daniel";
        String s2 = "Daniel";

        System.out.println("Comparting String objects");
        System.out.printf("s1.equals(s2): %s%n", s1.equals(s2));
        System.out.printf("s1 == s2: %s%n", s1 == s2);

        Name o1 = new Name("Daniel", "Maia");
        Name o2 = new Name("Daniel", "Maia");

        System.out.println("Comparing Objects");

        if (o1.equals(o2)) {
            System.out.println("They are equal using .equals()");
        } else {
            System.out.println("They are not equal");
        }

        if (o1 == o2) {
            System.out.println("They are equal using ==");
        } else {
            System.out.println("They are not equal");
        }


    }
}
