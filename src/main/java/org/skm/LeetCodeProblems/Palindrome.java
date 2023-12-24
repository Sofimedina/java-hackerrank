package org.skm.LeetCodeProblems;

import java.util.*;

public class Palindrome {

    public static boolean isPalindromeSol3(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
    public static boolean isPalindrome(int x) {
        int auxNumber=x;

        List<Integer> reverse=new ArrayList<>();

        while (auxNumber>0){
            reverse.add(auxNumber%10);
            auxNumber=auxNumber/10;
        }
        auxNumber=0;
        int d=reverse.size()-1;

        for (int i=0;i<reverse.size();i++){
            auxNumber=auxNumber+(reverse.get(i)*(int)Math.pow(10,d));
            d--;
        }
        return x==auxNumber;
    }
    public static boolean isPalindromeSol2(int x) {
        if (Math.abs(x)/10<=0){
            if (x<0){
                return false;
            }
            return true;
        }

        int auxNumber=x;
        LinkedList<Integer> linkedList=new LinkedList<>();
        while (auxNumber>0){
            linkedList.add(auxNumber%10);
            auxNumber=auxNumber/10;
        }

        boolean b=false;
        while (linkedList.size()>1){
            if (linkedList.getFirst().equals(linkedList.getLast())){
                linkedList.pollFirst();
                linkedList.pollLast();
                b=true;
            }else{
                b=false;
                break;
            }
        }
        return b;
    }


    public static void main(String[] args) {
        int number=-1;
        System.out.println("Solution1: "+isPalindrome(number));
        System.out.println("Solution1: "+isPalindromeSol2(number));
        System.out.println("Solution1: "+isPalindromeSol3(number));

    }
}
