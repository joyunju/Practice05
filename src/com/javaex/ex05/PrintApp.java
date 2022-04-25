package com.javaex.ex05;

public class PrintApp {

    public static void main(String[] args) {

        Print print = new Print();
        
        //수정하지 말 것 
        print.printer(10);
        print.printer(true);
        print.printer(5.7);
        print.printer("홍길동");
        
    }

}

