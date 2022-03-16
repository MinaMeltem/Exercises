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
    }
}
