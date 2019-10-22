package co;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		Operation n;
		n=new Add();
		System.out.println("请输入计算的两个数");
		double a=reader.nextDouble();
		double b=reader.nextDouble();
		System.out.println(a+"-"+b+"="+n.getResult(a,b));
		n=new Sub();
		System.out.println(a+"+"+b+"="+n.getResult(a,b));
		n=new Mul();
		System.out.println(a+"*"+b+"="+n.getResult(a,b));
		n=new Div();
		System.out.println(a+"/"+b+"="+n.getResult(a,b));
		
		

	}

}
