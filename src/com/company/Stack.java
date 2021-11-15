package com.company;

public class Stack {
    private int[] stackArray;
    private int maxSize;
    private int topElement;
    public Stack (int s){
        maxSize = s;
        topElement=-1;
        stackArray=new int [maxSize];
    }
    public void push(int i){
        stackArray[++topElement]=i;
    }
    public int pop(){
        return stackArray[topElement--];
    }
    public boolean isEmpty(){
        return (topElement==-1);
    }
}
