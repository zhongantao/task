package Afternoon;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
	
		String  userName="admin1";
		int  password=111111;
		Scanner input=new Scanner(System.in);
		for(int i=0;;) {
			
		
		System.out.print("�������û�����");
		String inUserName=input.next();
		System.out.println();
		System.out.print("���������룺");
		int inPassword=input.nextInt();
		System.out.println();
		if(inUserName==userName&&inPassword==password) {
			System.out.println("������������:");
			password=input.nextInt();
		}else {
			System.out.println("�û��������벻ƥ�䣬��û��Ȩ�޸��¹���Ա��Ϣ");
		}
		}
	}

}
