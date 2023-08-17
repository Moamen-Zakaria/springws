
package com.kn.springwsdemo.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmployeeResponse", namespace = "http://www.kn.com/springsoap")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetEmployeeResponse {

    @XmlElement(namespace = "http://www.kn.com/springsoap", required = true)
    protected List<Employee> element;

    public List<Employee> getElement() {
        if (element == null) {
            element = new ArrayList<Employee>();
        }
        return this.element;
    }

}
