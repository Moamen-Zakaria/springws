
package com.kn.springwsdemo.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Department", namespace = "http://www.kn.com/springsoap", propOrder = {
        "departmentId",
        "departmentName"
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @XmlElement(namespace = "http://www.kn.com/springsoap")
    protected int departmentId;
    @XmlElement(namespace = "http://www.kn.com/springsoap", required = true)
    protected String departmentName;

}
