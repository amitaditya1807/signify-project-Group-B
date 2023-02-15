/**
 * 
 */
package com.signify.client;
import com.signify.service.StudentService;

/**
 * @author AMIT KUMAR
 *
 */
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentService student =new StudentService();
		System.out.println(student.changePassword());
	}

}
