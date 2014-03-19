/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Margarita
 */
@WebService(serviceName = "CalculatorService")
public class CalculatorService {

    @WebMethod(operationName = "add")
    public double add(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }

    @WebMethod(operationName = "minus")
    public double minus(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a - b;
    }

    @WebMethod(operationName = "multiply")
    public double multiply(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }

    @WebMethod(operationName = "divide")
    public double divide(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }

    @WebMethod(operationName = "log")
    public double divide(@WebParam(name = "a") double a) {
        return Math.log(a);
    }
}
