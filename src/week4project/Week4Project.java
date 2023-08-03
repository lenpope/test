package week4project;

public class Week4Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // Step 1
		        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		        
		        // a. Calculate the difference between the first and last element
		        int difference = ages[ages.length - 1] - ages[0];
		        System.out.println("Difference between first and last age: " + difference);
		        
		        // b. Create a new array with one more element
		        int[] newAges = new int[ages.length + 1];
		        for (int i = 0; i < ages.length; i++) {
		            newAges[i] = ages[i];
		        }
		        // Calculate the difference again
		        difference = newAges[newAges.length - 1] - newAges[0];
		        System.out.println("Difference with new array: " + difference);
		        
		        // c. Calculate the average age
		        int sum = 0;
		        for (int age : ages) {
		            sum += age;
		        }
		        double averageAge = (double) sum / ages.length;
		        System.out.println("Average age: " + averageAge);
		        
		        // Step 2
		        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		        
		        // a. Calculate the average number of letters per name
		        int totalLetters = 0;
		        for (String name : names) {
		            totalLetters += name.length();
		        }
		        double averageLetters = (double) totalLetters / names.length;
		        System.out.println("Average number of letters per name: " + averageLetters);
		        
		        // b. Concatenate all names
		        StringBuilder concatenatedNames = new StringBuilder();
		        for (String name : names) {
		            concatenatedNames.append(name).append(" ");
		        }
		        System.out.println("Concatenated names: " + concatenatedNames.toString().trim());
		        
		        // Step 3
		        int lastElement = ages[ages.length - 1];
		        System.out.println("Last element of ages array: " + lastElement);
		        
		        // Step 4
		        int firstElement = ages[0];
		        System.out.println("First element of ages array: " + firstElement);
		        
		        // Step 5
		        int[] nameLengths = new int[names.length];
		        for (int i = 0; i < names.length; i++) {
		            nameLengths[i] = names[i].length();
		        }
		        
		        // Step 6
		        int sumOfNameLengths = 0;
		        for (int length : nameLengths) {
		            sumOfNameLengths += length;
		        }
		        System.out.println("Sum of name lengths: " + sumOfNameLengths);

		        // Step 7
		        String repeatedWord = repeatWord("Hello", 3);
		        System.out.println("Repeated word: " + repeatedWord);
		        
		        // Step 8
		        String fullName = getFullName("John", "Doe");
		        System.out.println("Full name: " + fullName);
		        
		        // Step 9
		        boolean greaterThan100 = isSumGreaterThan100(nameLengths);
		        System.out.println("Is sum greater than 100? " + greaterThan100);
		        
		        // Step 10
		        double[] doubleArray = {2.5, 3.0, 4.5};
		        double averageDouble = calculateAverage(doubleArray);
		        System.out.println("Average of double array: " + averageDouble);
		        
		        // Step 11
		        double[] doubleArray1 = {2.5, 3.0, 4.5};
		        double[] doubleArray2 = {1.0, 2.0, 3.0};
		        boolean isAverageGreater = isAverageOfFirstGreater(doubleArray1, doubleArray2);
		        System.out.println("Is average of first array greater than the second? " + isAverageGreater);
		        
		        // Step 12
		        boolean willBuyDrink = willBuyDrink(true, 15.0);
		        System.out.println("Will buy drink? " + willBuyDrink);
		    }
		    
		    // Step 7
		    public static String repeatWord(String word, int n) {
		        StringBuilder result = new StringBuilder();
		        for (int i = 0; i < n; i++) {
		            result.append(word);
		        }
		        return result.toString();
		    }
		    
		    // Step 8
		    public static String getFullName(String firstName, String lastName) {
		        return firstName + " " + lastName;
		    }
		    
		    // Step 9
		    public static boolean isSumGreaterThan100(int[] array) {
		        int sum = 0;
		        for (int num : array) {
		            sum += num;
		        }
		        return sum > 100;
		    }
		    
		    // Step 10
		    public static double calculateAverage(double[] array) {
		        double sum = 0;
		        for (double num : array) {
		            sum += num;
		        }
		        return sum / array.length;
		    }
		    
		    // Step 11
		    public static boolean isAverageOfFirstGreater(double[] array1, double[] array2) {
		        double average1 = calculateAverage(array1);
		        double average2 = calculateAverage(array2);
		        return average1 > average2;
		    }
		    
		    // Step 12
		    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		        return isHotOutside && moneyInPocket > 10.50;
		    }
		
	}

