package org.skm.LeetCodeProblems;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class TwoSums {

    public static int[] twoSumSolution1(int[] nums, int target) {
        int[] answer=new int[2];
        boolean found=false;

        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    found=true;
                    answer[0]=i;
                    answer[1]=j;
                }

            }
            if (found){
                break;
            }
        }

        return answer;
    }


    public static int[] twoSumSolution2(int[] nums, int target) {
        int[] answer=new int[2];
        HashMap<Integer,Integer> numsMap=new HashMap<>();

        for (int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if (numsMap.containsKey(diff)){
                answer[0]=i;
                answer[1]= numsMap.get(diff);
                break;
            }else{
                numsMap.put(nums[i],i);
            }
        }

        return answer;

    }



    public static void main(String[] args) {

        int[] nums={4,-2,5,0,6,3,2,7};
        int target=1;



        System.out.println("--------Solution 1");
        for (int number:twoSumSolution1(nums,target)){
            System.out.print(number+" ");
        }
        System.out.println();


        System.out.println("--------Solution 2");
        for (int number:twoSumSolution2(nums,target)){
            System.out.print(number+ " ");
        }




    }
}
