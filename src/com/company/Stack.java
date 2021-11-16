package com.company;

public class Stack {
    private int maxSize;
    private int[] stackImplementation;
    private int topElement;
    public Stack(int s){
        stackImplementation=new int[s];
        maxSize=s;
        topElement=-1;
    }
    /*
    Check if empty
     */
    public boolean isEmpty(){
        return topElement==-1;
    }
    /*
    check if full
     */
    public boolean isFull() {
        return topElement==maxSize-1;
    }
    public void pushElement(int n){
        if (isFull()){
            System.out.println("Stack is full");
            System.exit(1);
        }
        stackImplementation[++topElement]=n;
    }
    public int popElement(){
        if (isEmpty()){
            System.out.println("Empty stack");
            System.exit(1);
        }
        return stackImplementation[topElement--];
    }




}
