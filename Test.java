package wcq;

public class Test {
	private static String name; 
	public static void main(String args[]){ 
		Student studengt= new Student(); 
		Secourse c=new Secourse(); 
		studengt.setNumber("2020322087"); 
		studengt.setName("����"); 
		studengt.setSex("��");  
		Teacher teacher= new Teacher(); 
		teacher.setNumber("111111111"); 
		teacher.setName("����"); 
		teacher.setSex("��");  
		Secourse course= new Secourse(); 
		course.setCoursenumber("21321321"); 
		course.setCoursename("����");  
		course.setPlace("3F300"); 
		course.setTime("90����"); 
		System.out.println("ѧ��ѧ��:"+studengt.getNumber()); 
		System.out.println("ѧ������:"+studengt.getName()); 
		System.out.println("ѧ���Ա�:"+studengt.getSex());  
		System.out.println("��ʦ���:"+teacher.getNumber()); 
		System.out.println("��ʦ����:"+teacher.getName()); 
		System.out.println("��ʦ�Ա�:"+teacher.getSex()); 	
		System.out.println("ѡ�α��:"+course.getNumber()); 
		System.out.println("ѡ������:"+course.getCoursename()); 
		System.out.println("�Ͽεص�:"+course.getPlace()); 
		System.out.println("�ڿ�ʱ��:"+course.getTime()); 
		System.out.println("-------------------------------"); 
		c.choice(name); 
		System.out.println("-------------------------------"); 
		c.dorp(name); 
		} 
	} 