
package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NewWebService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewWebService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://service/", className = "service.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://service/", className = "service.HelloResponse")
    @Action(input = "http://service/NewWebService/helloRequest", output = "http://service/NewWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
