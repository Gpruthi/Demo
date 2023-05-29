package org.example;

import java.util.*;

public class Demo {

//    1)Given an array arr[] of size N, the task is to find the length of the Longest Increasing Subsequence (LIS) i.e.,
//    the longest possible subsequence in which the elements of the subsequence are sorted in increasing order.
//    Input: arr[] = {3, 10, 2, 1, 20} Output: 3
    //arr {    3, 10,2,1, 3,5,4, 1, 20}
    //new_arr {1, 2, 1,1, 2,3, 3, 1 ,4}


//    Explanation: The longest increasing subsequence is 3, 10, 20
//    Input: arr[] = {3, 2} Output:1 Explanation: The longest increasing subsequences are {3} and {2}


    public int getLongestIncreasingSubsequence(int arr[]){

        int size = arr.length;
        int[] new_arr = new int[size];

        int max_value =0;

        for(int i=0; i < size; ++i){
            new_arr[i] = 1;
        }

        for(int i=1; i<size;++i) {
            for(int j=0; j<i; ++j) {
                if(arr[i] >arr[j] && new_arr[i] < new_arr[j] +1)
                    new_arr[i] = new_arr[j] +1;
            }
        }

        for(int i=0; i<size; ++i) {
            if(new_arr[i] > max_value)
                max_value = new_arr[i];
        }

        return max_value;


    }

    public int[] getLongestIncreasingSubsequenceArray(int arr[]){

        int size = arr.length;
        int[] new_arr = new int[size];

        int max_value =0;

        for(int i=0; i < size; ++i){
            new_arr[i] = 1;
        }

        for(int i=1; i<size;++i) {
            for(int j=0; j<i; ++j) {
                if(arr[i] >arr[j] && new_arr[i] < new_arr[j] +1)
                    new_arr[i] = new_arr[j] +1;
            }
        }

        int insert_index =0;
        for(int i=0; i<size; ++i) {
            if(new_arr[i] > max_value) {
                max_value = new_arr[i];
                insert_index =i;
            }
        }


        int[] new_in_arr = new int[max_value];

        for(int i=insert_index; i>0;--i) {
            if(new_arr[i] == max_value) {
                new_in_arr[max_value - 1] = arr[i];
                max_value--;
            }
        }

        return new_in_arr;

    }


   // Longest Uniform Substring Suppose I have "abbbccda" then it should return [1, 3].
    // Because it starts from index 1 and is 3 characters long.
    // If the input string is empty then return [-1, 0].
    // Other Examples: "10000111" => [ 1, 4 ]
    // "aabbbbbCdAA" => [ 2, 5 ]


    public int[] getUniformString(String s){

        int[] arr = new int[2];

        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<s.length();++i) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),1);
            } else if(i >0 && s.charAt(i-1) == s.charAt(i)){
                map.put(s.charAt(i), map.get(s.charAt(i)) +1);
            }
        }

        return arr;
    }


//    public Node getParentNode(Node root, Node child1, Node child2) {
//
////
////                1
////          2              3
////        4    5        6      7
////      8
////
//
//        try {
//        if(root == null)
//            throw new RuntimeException("No record found");
//
//    }

    Map<String, Integer> map = new HashMap<>();

    public void saveMarks(String name, int marks) {
        map.put(name, marks);
    }

    public void updateMarks(String name, int marks) {

        if(map.containsKey(name))
            map.put(name, marks);
    }

    public String getNameWithMaxMarks() {
        List<String> names = new ArrayList<>();
        int maxmarks = Integer.MIN_VALUE;

        for(Map.Entry entry : map.entrySet()) {
            if((int) entry.getValue() > maxmarks)
                maxmarks = (int) entry.getValue();
        }

        for(Map.Entry entry : map.entrySet()) {
            if((int) entry.getValue() == maxmarks)
                names.add((String) entry.getKey());
        }
        return names.get(0);
    }


    public void printOddNodes(Node root) {

        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        int nodeCount = 0;

        boolean isOdd = true;

        while(true) {

            nodeCount = q.size();
            if(nodeCount ==0)
                break;

            while(nodeCount >0){
                Node node = q.peek();
                if(isOdd)
                    System.out.println(node.data);
                q.remove();
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
                nodeCount--;
            }
            isOdd = !isOdd;
        }




































    }




    private void reverseString(String data) {


        for(int i=0; i<data.length(); ++i) {

        }
    }



































































































}
