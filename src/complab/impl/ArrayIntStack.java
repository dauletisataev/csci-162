/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complab.impl;

import complab.adt.IntStack;
import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class ArrayIntStack implements IntStack {
    private int[] values;
    int size;
    public ArrayIntStack() {
        values = new int[10];
        size = 0;
    }
    
    @Override
    public void push(int value) {
        if(size == values.length) values = Arrays.copyOf(values, size+10);
        values[size] = value;
        size++;
    }

    @Override
    public int pop() throws Exception {
        if (size == 0) throw new Exception("no item in the stack");
        int result = values[size-1];
        size--;
        values = Arrays.copyOf(values, size);
        return result;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
       values = new int[10];
       size = 0;
    }
    
    @Override
    public String toString(){
        String result ="";
        for(int i =0; i<size; i++) result += String.valueOf(values[i])+" ";
        
        return result;
    }
    
    
}
