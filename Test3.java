package Afternoon;

public class Test3 {
	
	String name;
	int age;
	double score;
	
public void teacherComment(String comment) {
            System.out.println("老师备注："+comment);	
}
	public static void main(String[] args) {
		 Test3 zs=new Test3();
	     zs.name="张三";
	     zs.age=18;
	     zs.score=88;
	     System.out.println("姓名:"+zs.name+"\n"
	     		+ "年龄："+zs.age+"\n"
	     				+ "成绩："+zs.score);
	     zs.teacherComment("几场模拟考试成绩起伏较大");	
	     Test3 ls=new Test3();
	     ls.name="李四";
	     ls.age=19;
	     ls.score=99.5;
	     System.out.println("姓名:"+ls.name+"\n"
	     		+ "年龄："+ls.age+"\n"
	     				+ "成绩："+ls.score);
	     ls.teacherComment("几场模拟考试成绩比较稳定");
	     Test3 ls1=new Test3();
	     ls1.name="李四";
	     ls1.age=19;
	     ls1.score=99.5;
	     System.out.println("姓名:"+ls1.name+"\n"
	     		+ "年龄："+ls1.age+"\n"
	     				+ "成绩："+ls1.score);
	     ls1.teacherComment("几场模拟考试成绩比较稳定");
	     Test3 nl=new Test3();
	     
	     System.out.println("姓名:"+nl.name+"\n"
	     		+ "年龄："+nl.age+"\n"
	     				+ "成绩："+nl.score);
	     zs.teacherComment("null");
     		
	}

}
