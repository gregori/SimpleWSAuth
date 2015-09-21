/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.catolicasc.progvi.wsauth;

import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author rodrigo
 */
@WebService
public interface HelloWorld {

    /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod
    public String getHelloWorldAsString();
}
