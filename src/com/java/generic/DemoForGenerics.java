package com.java.generic;

public class DemoForGenerics {
	
	public static void main(String[] args) {
		
	
	Product<String> productOne = new Product<String>("Product One has benn created");
	Product<Integer> productTwo = new Product<Integer>(12);
	
	Test<Integer, String	> test = new Test(10, "TestOne");
	Test <String, String	> test2 = new Test("Test One Using double parametr", "which are all String");
	System.out.println(productOne);
	System.out.println(productTwo);
	System.out.println(test);
	System.out.println(test2);
	
	
	}
	
	

}

class Product<T>{
	T obj ;

	public Product(T obj) {
		super();
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Product [obj=" + obj + "]";
	}
}

class Test<T,U>{
	
	T obj;
	U obj1;
	
	public Test(T obj, U obj1) {
		super();
		this.obj = obj;
		this.obj1 = obj1;
	}

	

	@Override
	public String toString() {
		return "Test [obj=" + obj + ", obj1=" + obj1 + "]";
	}
	
}
	

	
