import java.util.Arrays;
import java.util.Scanner;

public class PracticeArrays {
    public static void main(String[] args){
        /*
        1.Create an array to hold the numbers 1-10.
        2.Loop through that array and sum the numbers 1-10, then print that total to the screen.
        3.Create an array to hold 10 number inputs from the user and print that total to the screen.
        4.Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
        5.Create an array to store 3 names, loop through that array to print out the names.
        6.Create an array with the following values: [2,5,9,0,2,1,8,5,4] Loop through
        the array and print out the index each time the value equals 5.
        7. Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.
        8. Given the following array: ["w",   "t",  "y",  "h",  "k"]
        Loop through the array and replace the the letter 't' with the word "hello" once it's found.
        9. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        Write a program that will print out all matching pairs from arrays 1 and 2.
         */
        Scanner scn = new Scanner(System.in);
        int i;
        int sum_total = 0;
        //1.Create an array to hold the numbers 1-10.
        int one_ten[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //2.Loop through that array and sum the numbers 1-10, then print that total to the screen.
        for (i=0; i<10; i++){
            sum_total+= one_ten[i];
        }
        System.out.println(sum_total);

        //3.Create an array to hold 10 number inputs from the user and print that total to the screen.
        int user_array[] = new int[10];
        int user_array_inputs;
        System.out.println("Enter 10 numbers: ");
        for(i=0; i<10; i++){
            System.out.print("("+(i+1)+")");
            user_array_inputs = scn.nextInt();
            user_array[i] = user_array_inputs;
        }
        System.out.println(Arrays.toString(user_array));

        //4.Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
        sum_total = 0;
        System.out.println("Enter 10 numbers: ");
        for (i=0; i<10; i++){
            System.out.print("("+(i+1)+")");
            user_array_inputs = scn.nextInt();
            user_array[i] = user_array_inputs;
            sum_total += user_array[i];
        }
        int average = sum_total/10;
        System.out.println("Average: "+average);

        //5.Create an array to store 3 names, loop through that array to print out the names.
        String three_names[] = {"Ronald", "Katherine", "Pepper"};
        System.out.println("Three names: ");
        for (i=0; i<3; i++){
            System.out.println(three_names[i]);
        }

        //6.Create an array with the following values: [2,5,9,0,2,1,8,5,4] Loop through
        //the array and print out the index each time the value equals 5.
        int some_numbers[] = {2 , 5, 9, 0, 2, 1, 8, 5, 4};
        for (i=0; i<9; i++){
            if (some_numbers[i] == 5){
                System.out.println("Value at index "+i+" is equal to 5.");
            }
        }

        //7. Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.
        int one_ten_again[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("10 to 1: ");
        for (i=9; i>=0; i--){
            System.out.println(one_ten_again[i]);
        }

        //8. Given the following array: ["w",   "t",  "y",  "h",  "k"]
        //Loop through the array and replace the the letter 't' with the word "hello" once it's found.
        String array_given[] = {"w", "t", "y", "h", "k"};
        for (i=0; i<5; i++){
            if (array_given[i].equals("t")){
                array_given[i] = "hello";
            }
        }

        //9. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        //Write a program that will print out all matching pairs from arrays 1 and 2.
        int num_array_1[] = {1, 7, 6, 5, 9};
        int num_array_2[] = {2, 7, 6, 3, 4};
        for (i=0; i<5; i++){
            if (num_array_1[i] == num_array_2[i]){
                System.out.println("Matching pairs: \n"+num_array_1[i]+" from first array.\n"+num_array_2[i]+" from second array.");
                System.out.println("Both numbers were located at index "+i+" in both arrays.");
            }
        }
    }
}
