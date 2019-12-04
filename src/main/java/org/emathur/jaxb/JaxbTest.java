package org.emathur.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

public class JaxbTest {

	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		Employee emp = new Employee();
		emp.setAge(24);
		emp.setName("eshita");
		emp.setGender("female");
		List<String> hobbies = new ArrayList<>();
		hobbies.add("Singing");
		hobbies.add("dancing");
		hobbies.add("guitar");
		emp.setHobbies(hobbies);
		Department dept = new Department();
		dept.setName("IT");
		emp.setDept(dept);
		jaxbMarshaller.marshal(emp, System.out);
	}
}

@XmlRootElement(name="emp") //Registers it as root element of xml
@XmlAccessorType(XmlAccessType.FIELD) // Add fields to xml even if they are private
class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	@XmlAttribute
	private Integer age;
	
	@XmlTransient
	private String gender;
	
	@XmlElementWrapper(name="hobbies")
	@XmlElement(name="hobby", required=true)
	private List<String> hobbies;
	
	private Department dept;
	
	public void setDept(Department dept) {
		this.dept = dept;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
}


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
class Department{
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
}
