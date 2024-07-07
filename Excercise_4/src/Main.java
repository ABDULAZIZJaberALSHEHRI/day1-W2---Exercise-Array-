import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Question 1'
        System.out.println("Question '1': ");

        System.out.println("Test if the first and the last element of an array of\n" +
                "integers are same.");

        int []number_1 = {50, -20, 0, 30, 40, 60 ,10};

        System.out.println("The array: " + Arrays.toString(number_1));

        int first_index = number_1[0];
        int last_Index = number_1[number_1.length-1];
        if (first_index == last_Index){
            System.out.println("First and last items are same.");
        }else {
            System.out.println("False");
        }


        //Question 2'
        System.out.println("\nQuestion '2': ");

        System.out.println("Find the numbers greater than the average of the\n" +
                "numbers of a given array.");

        int[] numbers_2 ={1,4,17,7,25,3,100};
        System.out.println("The array: " + Arrays.toString(numbers_2));
        int sum = 0;
        int average =0;
        int greater = 0;
        for (int i = 0; i < numbers_2.length; i++) {
            sum = numbers_2[i] + sum;

        }
        average =   sum     / numbers_2.length;

        System.out.print("The average of the said array is: " + "'"+average+"'" + " The numbers in the said array that are\n" +
                "greater than the average are: ");

        for (int j = 0; j < numbers_2.length; j++) {


            if (numbers_2[j] > average){
                System.out.print(" " +"'"+numbers_2[j]+"'");
            }

        }


        //Question 3'
        System.out.println("\n \nQuestion '3': ");

        System.out.println("Larger value between first and last\n" +
                "element of an array of integers.");

        int[] numbers_3 ={20,30,40};

        System.out.println("The array" + Arrays.toString(numbers_3));
        int temp_num = numbers_3[0];

        for(int i=0; i<numbers_3.length; i++){
            if(numbers_3[i] > temp_num){
                temp_num = numbers_3[i];

            }

        }
        System.out.println("Larger value between first and last element: " + temp_num);



        //Question 4'
        System.out.println("\nQuestion '4': ");

        System.out.println("Swap the first and last elements of an array and\n" +
                "create a new array.");

        int[] num_4 = {20,30,40};
        System.out.println("Old array: " + Arrays.toString(num_4));

        //swapping operation
        int temp_item;
        temp_item = num_4[0];
        num_4[0] = num_4[num_4.length-1];
        num_4[num_4.length-1] = temp_item;


        ArrayList<Integer> numbers_4 = new ArrayList<Integer>();
        for(int n: num_4){
            numbers_4.add(n);
        }
        System.out.println("New array after swapping the first and last elements: "+numbers_4);



        //Question 5'
        System.out.println("\nQuestion '5': ");

        System.out.println("Places the odd elements of an array before the\n" +
                "even elements.");
         ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        numbers.add(40);
        numbers.add(7);
        numbers.add(10);
        numbers.add(2);
        numbers.add(9);

        System.out.println("numbers: " + numbers);

        ArrayList<Integer> order = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            for (int u = numbers.size() - 1; u > i; u--) {
                if (numbers.get(i) %2 == 0) {
                    int tmp = numbers.get(i);
                    numbers.set(i,numbers.get(u));
                    numbers.set(u,tmp);
                }
            }
        }
        for (int i : numbers) {
            order.add(i);
        }
        System.out.println("The array after place odd and even numbers :"+order);



        //Question 6'
        System.out.println("\nQuestion '6': ");

        System.out.println(" test the equality of two arrays.");
        int first_arr[] = {2,3,6,6,4};
        int second_arr[] = {2,3,6,6,4};

        System.out.println("First array" + Arrays.toString(first_arr));
        System.out.println("Second array" + Arrays.toString(second_arr));

        boolean equal = true;

        if (first_arr.length == second_arr.length) {
            for (int i = 0; i < first_arr.length; i++) {

                    if (first_arr[i] != second_arr[i]) {
                        equal = false;

                    }
            }
        }else {
            equal = false;
        }

        if (equal==true){
            System.out.println("Two arrays are equal.");
        }  else{
            System.out.println("Two arrays are 'not' equal.");
        }
    }
}