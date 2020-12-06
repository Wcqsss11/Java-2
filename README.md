# Java-实验-2 Java-LabReport
## 计G202  学号：2020322086   姓名：王超琦 
## 一.实验目的
- 1初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
- 2掌握面向对象的类设计方法（属性、方法）；
- 3掌握类的继承用法，通过构造方法实例化对象；
- 4学会使用super()，用于实例化子类；
- 5掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 二.实验要求
- 1学校有“人员”preson，分为“教师”Teacher和“学生”Student，教师教授“课程”Secourse，学生选择“课程”course。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程；
- 2编写上述实体类以及测试主类（注意类之间继承关系的适用）；
- 3在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。

## 三.业务要求  
- 1.学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。    
- 2.从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。

## 四.实验过程

    1.创建了Personnel类，并设置了多种不同的对象；
    class Package { 
    private String number; 
    private String name; 
    private String sex; 
    private int age;

    2.运用Get,Set方法实现值得传递关系； 
    public String getNumber() { 
     return number; 
     } 
     public void setNumber(String number) { 
     this.number = number; 
     } 

    3.运用extends关键字额外创建了Personnel类的子类Student类和Teacher类。  
    &emsp;在继承父类方法的基础上，创建了course对象(课程)和taeching对象(授课)；
    class Student extends Personnel{ 
     String course; 
    class Teacher extends Personnel{ 
     String teaching;

    4.创建了Secourse类(选课)实现课程；
    lass Secourse{ 
    String name; 
    private String coursenumber; 
    private String coursename; 
    private String place; 
    private String time; 
    private String teacher; 
    String [] a= {"英语","java","高等数学","论语"}

    5.创建了choice (选课),dorp(退课)类实现学生选课和退课操作
    public void choice (String name){
      Student student =new Student();
        public void choice (String name){
         if(student.getNumber()=="") {
         }
         else  {
          System.out.println("");
         }
     }
     public void dorp (String name) {
      Student student =new Student(); 
    }

## 五.实验流程图
- https://github.com/Wcqsss11/Java-2/blob/main/07111d2e9a7a195b14f16e0289a3925.png

## 六.核心方法  
     1.这里调用Stuentds类中的对象；
        public class Test {
	private static String name; 
	public static void main(String args[]){ 
		Student studengt= new Student(); 
		Secourse c=new Secourse(); 
		studengt.setNumber("2020322087"); 
		studengt.setName("张三"); 
		studengt.setSex("男") 

    2.调用Teacher类中的对象；
        Teacher teacher= new Teacher(); 
		teacher.setNumber("111111111"); 
		teacher.setName("李四"); 
		teacher.setSex("男");
    3.调用choice(选课)类, dorp(退课)类
    
## 七.结果
- https://github.com/Wcqsss11/Java-2/blob/main/d56bd63e8b7cd3b4496aa25da3c9ffb.png

## 八.实验感想
    通过这次试验我明白了继承的道理，继承是创建父类然后用子类继承父类的方法和成员变量，而super关键字是子类被隐藏的成员变量和方法。
