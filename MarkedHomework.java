public class MarkedHomework { 
    public static void main(String[] args) {
        // String Manipulation Module
        String city = "Pretoria";
        System.out.println(city.toUpperCase()); // Corrected method name
        
        String favfood = "pussy";
        System.out.println(favfood.length()); // This is fine, but be careful about using inappropriate words

        String name = "Gringo";
        System.out.println(name.charAt(0)); // This is correct

        // Arrays Module
        String[] movies = {"Takers", "Deadpool", "Avengers", "Titanic"};
        System.out.println("second movie:" + movies[1]); // Correct

        int[] numbers = {9, 18, 27, 36, 45};
        System.out.println("Last number:" + numbers[numbers.length - 1]); // Correct
        
        numbers[0] = 99;
        System.out.println("First number:" + numbers[0]);
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); // This loop works fine
        }

        // Loops Module
        System.out.println("Print name 3 times:"); // Missing semicolon here
        for (int i = 0; i < 3; i++) {
            System.out.println("Gringo"); // Correct
        }
        
        System.out.println("count 1 to 5 using while loop:"); // Correct
        int count = 1;
        while (count <= 5) {
            System.out.println(count); // Error: "cout" should be "count"
            count++;
        }

        System.out.println("count down from 5 to 1 using do while loop:"); // Typo in "count", should be "countdown"
        int countdown = 5;
        do {
            System.out.println(countdown); // Error: The colon at the end of this line should be a semicolon
            countdown--;
        } while (countdown >= 1);

        // Char Module
        char initial = 'R';
        System.out.println("Initial:" + initial);
        if (initial == 'R') {
            System.out.println("Initial is R.");
        } else {
            System.out.println("initial is not R.");
        }
        
        char a = 'G';
        char b = 'H';
        if (a > b) {
            System.out.println("a is greater than b.");
        } else if (a < b) { // Typo: "esle" should be "else"
            System.out.println("b is greater than a.");
        } else {
            System.out.println("a is equal to b.");
        }
    }    
}
