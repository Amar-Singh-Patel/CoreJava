package com.nt.beans;

import java.sql.Date;

public class WishGenerator {
//bean properties
private String name;
private Date date;
//Getter methods for setter injection
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
//B.logic
public String generatorWishMsg() {
	return "GoodMorning" +name+"-->"+date;
}
}


