package com.nt.test;

import javax.xml.crypto.dsig.XMLSignatureFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.servlet.support.WebContentGenerator;

import com.nt.beans.WishGenerator;

public class ClientApp{
public static void main(String[] args) {
System.out.println("Client App:main()-");	
//Locate Spring Bean configuration file
 FileSystemResource res=new
FileSystemResource("src/com/nt/cfgs/applicationContex.xml");
//Activate BeanFactory container
XmlBeanFactory factory=new XmlBeanFactory (res);
//get Bean class obj
//WishGenerator bean=(Wish Generator)factory.getBean("WSG");
WishGenerator bean = factory.getBean("wsg",WishGenerator.class);
//call B.method
String result= bean.generatorWishMsg();
System.out.println(result);
}//main
}//class