
package com.kn.springwsdemo.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Department", namespace = "http://www.kn.com/springsoap", propOrder = {
        "id",
        "departmentName"
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "department")
public class Department {

    @XmlElement(namespace = "http://www.kn.com/springsoap")
    @Id
    protected Integer id;
    @XmlElement(namespace = "http://www.kn.com/springsoap", required = true)
    protected String departmentName;

}
