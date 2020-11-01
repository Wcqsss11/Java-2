package wcq;

public class Test {
	private static String name; 
	public static void main(String args[]){ 
		Student studengt= new Student(); 
		Secourse c=new Secourse(); 
		studengt.setNumber("2020322087"); 
		studengt.setName("张三"); 
		studengt.setSex("男");  
		Teacher teacher= new Teacher(); 
		teacher.setNumber("111111111"); 
		teacher.setName("李四"); 
		teacher.setSex("男");  
		Secourse course= new Secourse(); 
		course.setCoursenumber("21321321"); 
		course.setCoursename("论语");  
		course.setPlace("3F300"); 
		course.setTime("90分钟"); 
		System.out.println("学生学号:"+studengt.getNumber()); 
		System.out.println("学生姓名:"+studengt.getName()); 
		System.out.println("学生性别:"+studengt.getSex());  
		System.out.println("教师编号:"+teacher.getNumber()); 
		System.out.println("教师姓名:"+teacher.getName()); 
		System.out.println("教师性别:"+teacher.getSex()); 	
		System.out.println("选课编号:"+course.getNumber()); 
		System.out.println("选课名称:"+course.getCoursename()); 
		System.out.println("上课地点:"+course.getPlace()); 
		System.out.println("授课时长:"+course.getTime()); 
		System.out.println("-------------------------------"); 
		c.choice(name); 
		System.out.println("-------------------------------"); 
		c.dorp(name); 
		} 
	} 