package wcq;
class Package { 
private String number; 
private String name; 
private String sex; 
private int age; 
public String getNumber() { 
return number; 
} 
public void setNumber(String number) { 
this.number = number; 
} 
public String getName() { 
return name; 
} 
public void setName(String name) { 
this.name = name; 
} 
public String getSex() { 
return sex; 
} 
public void setSex(String sex) { 
this.sex = sex; 
}  
public int getAge() { 
return age; 
} 
public void setAge(int age) { 
this.age = age; 
} 
} 
class Student extends Package{ 
String course; 
public String getCourse() { 
return course; 
} 
public void setCourse(String course) { 
this.course = course; 
} 
} 
class Teacher extends Package{ 
String teaching; 
public String getTeaching() { 
return teaching; 
} 
public void setTeaching(String teaching) { 
this.teaching = teaching; 
} 
} 
class Secourse{ 
String name; 
private String coursenumber; 
private String coursename; 
private String place; 
private String time; 
private String teacher; 
String [] a= {"英语","java","高等数学","论语"}; 
public String getNumber() { 
return coursenumber; 
} 
public void setCoursenumber(String coursenumber) { 
this.coursenumber = coursenumber; 
} 
public String getCoursename() { 
return coursename; 
} 
public void setCoursename(String coursename) { 
this.coursename = coursename; 
} 
public String getPlace() { 
return place; 
} 
public void setPlace(String place) { 
this.place = place; 
} 
public String getTime() { 
return time; 
} 
public void setTimea(String timea) { 
this.time = timea; 
} 
public String getTimea() { 
return time; 
} 
public void setTime(String time) { 
this.time = time; 
} 
public String getTeacher() { 
return teacher; 
} 
public void setTeacher(String teacher) { 
this.teacher = teacher; 
}  
public void choice(String name){
	int i ;
Student student=new Student(); 
student.getName(); 
student.setNumber("2020322087"); 
student.setName("张三");  
student.getNumber(); 
if(student.getNumber()=="2020322087") { 
place="3F300";time="90分钟"; 
System.out.println("学生姓名："+student.getName());
for(i=0;i<4;i++){
System.out.println("学生选择的课程 ："+a[i]);}
System.out.println("上课地点："+place+"教室");
System.out.println("授课时长："+time);  
}
else  {
System.out.println("你输入的课程有误");
}
}
public void dorp(String name) {
Student student=new Student();
student.getName();
student.setNumber("2020322088");
student.setName("王五");
student.getNumber();
if(student.getNumber()=="2020322088") {
System.out.println("学生姓名："+student.getName());
System.out.println("你已经退课了，请重新选课");
}
}
}