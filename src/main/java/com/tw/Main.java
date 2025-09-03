package com.tw;

import javax.swing.text.SimpleAttributeSet;

public class Main {


    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println("Please input the start number and the end number:"+multiplicationTable.create(1,9));

    }
}
