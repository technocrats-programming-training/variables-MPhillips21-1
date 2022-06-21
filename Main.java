public class Main {
    public static void main(String[] args) {
        // DO NOT CHANGE 
        String firstName = args[0];
        String lastName = args[1];
        int age = 0;
        try {
            age = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        

        // Print out the following string: "Hello, I am <firstName> <lastName>, and I am <age> years old"
      System.out.println("Hello, I am " + firstName + " " + lastName + ", and I am " + age + " years old");

        // Print out whether age is even
      if(age % 2 == 0) {
        System.out.println("Age is even");
      } else {
        System.out.println("Age is not even");
      }

        // Print out whether firstName equals lastName
      if(firstName.equals(lastName)) {
        System.out.println("First and last names are the same");
      } else {
        System.out.println("First and last names are not the same");
      }

        // Print out whether age is greater than 0
      if(age > 0) {
        System.out.println("Age is greater than 0");
      } else {
        System.out.println("Age is less than 0");
      }

    }
}
