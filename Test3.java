package Afternoon;

public class Test3 {
	
	String name;
	int age;
	double score;
	
public void teacherComment(String comment) {
            System.out.println("��ʦ��ע��"+comment);	
}
	public static void main(String[] args) {
		 Test3 zs=new Test3();
	     zs.name="����";
	     zs.age=18;
	     zs.score=88;
	     System.out.println("����:"+zs.name+"\n"
	     		+ "���䣺"+zs.age+"\n"
	     				+ "�ɼ���"+zs.score);
	     zs.teacherComment("����ģ�⿼�Գɼ�����ϴ�");	
	     Test3 ls=new Test3();
	     ls.name="����";
	     ls.age=19;
	     ls.score=99.5;
	     System.out.println("����:"+ls.name+"\n"
	     		+ "���䣺"+ls.age+"\n"
	     				+ "�ɼ���"+ls.score);
	     ls.teacherComment("����ģ�⿼�Գɼ��Ƚ��ȶ�");
	     Test3 ls1=new Test3();
	     ls1.name="����";
	     ls1.age=19;
	     ls1.score=99.5;
	     System.out.println("����:"+ls1.name+"\n"
	     		+ "���䣺"+ls1.age+"\n"
	     				+ "�ɼ���"+ls1.score);
	     ls1.teacherComment("����ģ�⿼�Գɼ��Ƚ��ȶ�");
	     Test3 nl=new Test3();
	     
	     System.out.println("����:"+nl.name+"\n"
	     		+ "���䣺"+nl.age+"\n"
	     				+ "�ɼ���"+nl.score);
	     zs.teacherComment("null");
     		
	}

}
