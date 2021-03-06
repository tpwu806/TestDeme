package com.code2016.design.structural.adapter.demo3;

public class Wrapper implements Targetable {

	private Source source;  
    
    public Wrapper(Source source){  
        super();  
        this.source = source;  
    }  
    @Override  
    public void method2() {  
        System.out.println("this is the targetable method!");  
    }  
  
    @Override  
    public void method1() {  
        source.method1();  
    }  

}
