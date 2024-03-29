package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
  private int serialnumber;
  private  String pname;
  private int pprice;
@Id 
public int getSerialnumber() {
	return serialnumber;
}
public void setSerialnumber(int serialnumber) {
	this.serialnumber = serialnumber;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPprice() {
	return pprice;
}
public void setPprice(int pprice) {
	this.pprice = pprice;
}
@Override
public String toString() {
	return "Product [serialnumber=" + serialnumber + ", pname=" + pname + ", pprice=" + pprice + "]";
}
  
}
