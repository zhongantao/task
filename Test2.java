package Afternoon;

public class Test2 {
/*
 * 有一个计算器，能够做两个数字的加法和三个数字的加法
 * 在main方法中测试
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
     xw.name="小王";
     xw.age=25;
     xw.gender="男";
     xw.serial=01;
     Test2 xh=new Test2();
     xh.name="小红";
     xh.age=20;
     xh.gender="女";
     xh.serial=02;
     Test2 xs=new Test2();
     xs.name="小三";
     xs.age=19;
     xs.gender="男";
     xs.serial=03;
     Test2 xz=new Test2();
     xz.name="小张";
     xz.age=15;
     xz.gender="男";
     xz.serial=04;
     
     System.out.println(xw.name +","+xw.age +","+xw.gender +","+xw.serial);
     System.out.println(xh.name +","+xh.age +","+xh.gender +","+xh.serial);

}

}