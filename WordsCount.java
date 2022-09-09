package com.String;

public class WordsCount {
    public static void main(String[]args){
        String words="java";
        char c='a';
        int count=0;

        for(int i=0;i<words.length();i++){
            if(c== words.charAt(i)){
                count++;
            }
        }
        System.out.println("count of searching "+c +" is "+count);

    }
}
