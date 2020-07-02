package lambda_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Numbers {
    static List<Integer> nums = Arrays.asList(10,100,1000,5,50,500,3,30,300,7,70,700,1,10,100,25,250,2500);

    public static void main(String[] args) {
        //Part I :complete the static class methods that have been set up in this Numbers class java file.  Use
        // streams to compute the results wherever possible.
        System.out.println(nums);
        System.out.println(added());
        System.out.println(subtracted());
        System.out.println(multiplied());
        System.out.println(divided());
        System.out.println(findMax());
        System.out.println(findMin());
        System.out.println(isOdd(1));
        System.out.println(isEven(1));
        System.out.println(isPrime(6));

        //Part II - refactor all of the class methods to accept lambda expressions. You can put the lambda functions
        // directly inside the method calls, or defined them first, then pass them into the methods. give them the
        // same names as the static methods, but add the word 'lambda' in front of every lambda function:

//        System.out.println(lambdaIs(1, new IntPredicate() {
//
//            @Override
//            public boolean test(int value) {
//                if (value%2 != 0) {
//                    return true;
//                }
//                return false;
//            }
//        }));

//        System.out.println(lambdaIs(() -> nums.get(3)%2 != 0 ? true : false));

        /* e.g.

        added(() -> {});

        OR

        lambdaAdd = () -> {};
        added(lambdaAdd);

        isOdd(() -> {});

        OR

        lambdaOdd = () -> {};
        isOdd(lambdaOdd);
        etc...

        */

    }

    static boolean isOdd(int i) {
        //determine if the value at the index i is odd.  return true if yes, return false if  no.
        Stream<Integer> stream = Arrays.asList(nums.get(i)).stream();

        return stream.allMatch((Integer element) -> element % 2 != 0);
    }

    static boolean isEven(int i) {
        //determine if the value at the index i is even.  return true if yes, return false if  no.
        Stream<Integer> stream = Arrays.asList(nums.get(i)).stream();

        return stream.allMatch((Integer element) -> element % 2 == 0);
    }

    static boolean isPrime(int i) {
        //determine if the value at the index i is a prime number.  return true if yes, return false if no.
        Stream<Integer> stream = Arrays.asList(nums.get(i)).stream();

        return stream.allMatch((Integer element) -> {
            if (nums.get(element) <= 1) {
                return false;
            }

            for (int x = 2; x < nums.get(element); x++)
                if (nums.get(element) % x == 0) {
                    return false;
                }
            return true;});


    }

    static int added() {
        //add all the elements in the list.  return the sum.
        int total = nums.stream().mapToInt(num -> num).sum();
        return total;
    }

    static int subtracted() {
        //subtract all the elements in the list. return the remainder.
        int subtraction = nums.stream().reduce(nums.get(0), (a, b) -> a - b);
        return subtraction;
    }

    static int multiplied() {
        //multiply all the elements in the list. and return the product.
        //Value comes out to be a negative because the Integer List type does not support the size of the number.
        int multiplication = nums.stream().reduce(nums.get(0), (a, b) -> a*b);
        return multiplication;
    }

    static int divided() {
        //multiply all the elements in the list. and return the product.
        //^^Guessing those directions meant to say divide. Returns 0 since number is too small for int.
        int division = nums.stream().reduce(nums.get(0), (a, b) -> a/b);
        return division;
    }

    static int findMax() {
         //return the maximum value in the list.
        Integer max = nums.stream().max(Integer::compare).get();
        return max;
    }

    static int findMin() {
        //return the minimum value in the list.
        Integer min = nums.stream().min(Integer::compare).get();
        return min;
    }

    static int compare(int i, int j) {
        //compare the values stored in the array at index position i and j.  
        //if the value at i is greater, return 1.  if the value at j is greater, return -1.  if the two values are equal, return 0.
        Stream<Integer> stream = Arrays.asList(nums.get(i), nums.get(j)).stream();

        stream.forEach((Integer element) -> {

        });
        return 0;
    }

    static int append(int n) {
        //add a new value to the values list. return that value after adding it to the list.
        return 0;
    }


    static boolean lambdaIs(int i) {
        return false;
    }

    interface lambdaIs {

    }


}
