package com.ooptest;

public class OutputClass {

    static int x=2;
    int y;
   void add(int a){
       x =  a + 1;
   }
   void add(int a , int b){
     add(a);
       x +=  a + 2;
   }        
}    
  
