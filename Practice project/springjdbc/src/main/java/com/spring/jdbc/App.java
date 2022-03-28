package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App 
{
    public static void main( String[] args ) 
    	{
        System.out.println( "My programe started  ......" );
        // spring jdbc=> JdbcTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
      StudentDao studentDao= (StudentDao) context.getBean("studentDao");
      // INSERT
         // Student student = new Student();
        // student.setId(668);
       //student.setName("Khan");
      //student.setCity("Bihar");
     //int result= studentDao.insert(student);
    //System.out.println("student added"+result);
      
      
   // UPDATE
   //    Student student= new Student();
   //   student.setId(245);
   //  student.setName("Shahid  Afridi");
   // student.setCity("Ranchi");
  // int result = studentDao.change(student);
  //System.out.println("data changed"+result);
      
    // DELETE
    //  int result = studentDao.delete(668);
      //System.out.println("deleted "+result);
      
      Student student = studentDao.getStudent(456);
      System.out.println(student);
    }
}
