package com.company;
public class Main {

    public static void main(String[] args) {
        //  PerformOperation isOdd(): The lambda expression must return true if a number is odd
        Operation isOdd = n  ->  ( n % 2 ) != 0;
        System.out.println(isOdd.check(5));

        // PerformOperation isPrime(): The lambda expression must return true  if a number is prime
        Operation isPrime = n -> {
            if( n == 1 || n == 0 ) return false;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(isPrime.check(5));

        //PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome
        Operation  isPalindrome = n -> {
            int palindrome = n;
            int reverseN = 0;
            while ( palindrome > 0 ){
                int remainder = palindrome % 10;
                reverseN = ( reverseN * 10 ) + remainder;
                palindrome = palindrome / 10;
            }
            return reverseN == n ? true : false;
        };
        System.out.println(isPalindrome.check(5));


        int [] arr1 = {0,0,0,1,1,2,23,44,5,55};
        //Remove Dublicates
        RemoveDublicatesFromArray rd = new RemoveDublicatesFromArray();
        System.out.println(rd.removeDuplicates(arr1));


        int [] arr2 = {0,0,0,1,589,2,3};
        //Remove Elements
        RemoveElement re =  new RemoveElement();
        System.out.println(re.removeElement(arr2, 0));

    }
}
