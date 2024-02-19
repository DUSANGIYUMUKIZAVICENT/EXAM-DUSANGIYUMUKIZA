package rrrrr;

public class referees {
	private int ref_id;
	private String f_name;
	private String l_name;
	private int age;
	private String sex;
	private String telephone;
	

public referees(int ref_id,String f_name,String l_name,int age,String sex,String telephone) {
	super();
	this.ref_id = ref_id;
	this.f_name = f_name;
	this.l_name = l_name;
	this.age = age;
	this.sex = sex;
	this.telephone = telephone;
	
}


public int getRef_id() {
	return ref_id;
}


public void setRef_id(int ref_id) {
	this.ref_id = ref_id;
}


public String getF_name() {
	return f_name;
}


public void setF_name(String f_name) {
	this.f_name = f_name;
}


public String getL_name() {
	return l_name;
}


public void setL_name(String l_name) {
	this.l_name = l_name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getSex() {
	return sex;
}


public void setSex(String sex) {
	this.sex = sex;
}


public String getTelephone() {
	return telephone;
}


public void setTelephone(String telephone) {
	this.telephone = telephone;
}


}