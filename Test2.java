package Afternoon;

public class Test2 {
/*
 * ��һ�����������ܹ����������ֵļӷ����������ֵļӷ�
 * ��main�����в���
 */
    String name;
	int age;
	String gender;
	int serial;
	
public void teacherComment(String comment) {
            System.out.println(comment);	
}



public static void main(String[] args) {
     Test2 xw=new Test2();
     xw.name="С��";
     xw.age=25;
     xw.gender="��";
     xw.serial=01;
     Test2 xh=new Test2();
     xh.name="С��";
     xh.age=20;
     xh.gender="Ů";
     xh.serial=02;
     Test2 xs=new Test2();
     xs.name="С��";
     xs.age=19;
     xs.gender="��";
     xs.serial=03;
     Test2 xz=new Test2();
     xz.name="С��";
     xz.age=15;
     xz.gender="��";
     xz.serial=04;
     
     System.out.println(xw.name +","+xw.age +","+xw.gender +","+xw.serial);
     System.out.println(xh.name +","+xh.age +","+xh.gender +","+xh.serial);

}

}