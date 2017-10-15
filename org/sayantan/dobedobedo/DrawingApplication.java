package org.sayantan.dobedobedo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Triangle triangle = new Triangle();

		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));
		// Triangle triangle = (Triangle) factory.getBean("triangle");

//		Point A = new Point();
//		A.setX(0);
//		A.setY(0);
//		Point B = new Point();
//		B.setX(-20);
//		B.setY(0);		
//		Point C = new Point();
//		C.setX(0);
//		C.setY(0);
//		Triangle triangle = new Triangle();
//		triangle.setPointA(A);
//		triangle.setPointB(B);
//		triangle.setPointC(C);
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape) context.getBean("triangle-alias");

		shape.draw();

		shape = (Shape) context.getBean("circle");
		shape.draw();
	}

}
