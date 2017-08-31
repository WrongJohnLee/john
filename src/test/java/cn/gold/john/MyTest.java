package cn.gold.john;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.text.DecimalFormat;

public class MyTest {

	public static void classMethodTest(Object oj){
		Class clazz = oj.getClass();
		Method[] methods = clazz.getDeclaredMethods();
		String className = clazz.getName();
		for(int i=0;i<methods.length;i++){
			System.out.println("类名为:"+className+"方法:"+methods[i].getName());
		}
	}
	public static int digui(int n){
		if(n==1)
			return 1;
		else
			return n*digui(n-1);

	}
	public static void main(String[] args){
			MyTest mt = new MyTest();
			TestObject to = mt.new TestObject();
		    classMethodTest(to);
			System.out.println(digui(5));
	}
	class TestObject{
		public void a(){}
		public void b(){}
		public void c(){}
	}
}
