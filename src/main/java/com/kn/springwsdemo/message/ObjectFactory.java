
package com.kn.springwsdemo.message;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.kn.springwsdemo.message package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEmployeeResponse_QNAME = new QName("http://www.kn.com/springsoap", "getEmployeeResponse");
    private final static QName _GetAllEmployeeRequest_QNAME = new QName("http://www.kn.com/springsoap", "getAllEmployeeRequest");
    private final static QName _SaveEmployeeRequest_QNAME = new QName("http://www.kn.com/springsoap", "saveEmployeeRequest");
    private final static QName _SaveEmployeeResponse_QNAME = new QName("http://www.kn.com/springsoap", "saveEmployeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kn.springwsdemo.message
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Employee }
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link Void }
     */
    public Void createVoid() {
        return new Void();
    }

    /**
     * Create an instance of {@link Department }
     */
    public Department createDepartment() {
        return new Department();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.kn.com/springsoap", name = "getEmployeeResponse")
    public JAXBElement<Employee> createGetEmployeeResponse(Employee value) {
        return new JAXBElement<Employee>(_GetEmployeeResponse_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.kn.com/springsoap", name = "getAllEmployeeRequest")
    public JAXBElement<Void> createGetAllEmployeeRequest(Void value) {
        return new JAXBElement<Void>(_GetAllEmployeeRequest_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.kn.com/springsoap", name = "saveEmployeeRequest")
    public JAXBElement<Employee> createSaveEmployeeRequest(Employee value) {
        return new JAXBElement<Employee>(_SaveEmployeeRequest_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.kn.com/springsoap", name = "saveEmployeeResponse")
    public JAXBElement<String> createSaveEmployeeResponse(String value) {
        return new JAXBElement<String>(_SaveEmployeeResponse_QNAME, String.class, null, value);
    }

}
