package com.kn.springwsdemo.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee", namespace = "http://www.kn.com/springsoap", propOrder = {"employeeId", "firstName", "lastName", "email", "department"})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @XmlElement(namespace = "http://www.kn.com/springsoap", required = true)
    @Id
    protected String employeeId;
    @XmlElement(namespace = "http://www.kn.com/springsoap", required = true)
    protected String firstName;
    @XmlElement(namespace = "http://www.kn.com/springsoap", required = true)
    protected String lastName;
    @XmlElement(namespace = "http://www.kn.com/springsoap", required = true)
    protected String email;
    @XmlElement(namespace = "http://www.kn.com/springsoap", required = true)
    @OneToOne
    protected Department department;

}
