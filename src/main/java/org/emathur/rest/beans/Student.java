package org.emathur.rest.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	private String id;
	private String name;

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
