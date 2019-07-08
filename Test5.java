package Afternoon;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
	
		String  userName="admin1";
		int  password=111111;
		Scanner input=new Scanner(System.in);
		for(int i=0;;) {
			
		
		System.out.print("请输入用户名：");
		String inUserName=input.next();
		System.out.println();
		System.out.print("请输入密码：");
		int inPassword=input.nextInt();
		System.out.println();
		if(inUserName==userName&&inPassword==password) {
			System.out.println("请输入新密码:");
			password=input.nextInt();
		}else {
			System.out.println("用户名和密码不匹配，您没有权限更新管理员信息");
		}
		}
	}

}
