package Afternoon;


public class Test1 {
  
	
	//两个和三个加法的计算器
public static double Calculator2(double a,double b) {
		
		return  a+b;
	}
public static double Calculator3(double a,double b,double c) {
			
		return  a+b+c;	
	
}
	
	public static void main(String[] args) {
		

	

	
		Test1 cal=new Test1();
        double sum1=cal.Calculator2(1,2);
        double sum2=cal. Calculator3(1,2,3);
        System.out.println("功能1："+sum1+"功能2："+sum2);
}
	
}