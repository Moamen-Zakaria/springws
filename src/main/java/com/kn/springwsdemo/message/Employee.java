package com.kn.springwsdemo.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee", namespace = "http://www.kn.com/springsoap", propOrder = {"id", "firstName", "lastName", "email", "departments"})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "employee")
public class Employee {

    @XmlElement(namespace = "http://www.kn.com/springsoap", required = true)
    @Id
    protected String id;
    @XmlElement(namespace = "http://www.kn.com/springsoap", required = true)
    protected String firstName;
    @XmlElement(namespace = "http://www.kn.com/springsoap", required = true)
    protected String lastName;
    @XmlElement(namespace = "http://www.kn.com/springsoap", required = true)
    protected String email;
    @XmlElement(namespace = "http://www.kn.com/springsoap", required = true)
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department departments;

}
