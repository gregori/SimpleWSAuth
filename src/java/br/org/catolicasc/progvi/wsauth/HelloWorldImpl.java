/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.catolicasc.progvi.wsauth;


import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 *
 * @author rodrigo
 */
@WebService(endpointInterface="br.org.catolicasc.progvi.wsauth.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Resource
    WebServiceContext wsctx;
    
    @Override
    public String getHelloWorldAsString() {
        MessageContext mctx = wsctx.getMessageContext();
        Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        List usersList = (List) http_headers.get("Username");
        List passList = (List) http_headers.get("Password");
        
        String username = "";
        String password = "";
        
        if (usersList != null)
            username = usersList.get(0).toString();
        if (passList != null)
            password = passList.get(0).toString();
        
        if (username.equals("aluno") && password.equals("1234"))
            return "Hello World Valid User!";
        
        return "Unknown User!";
    }
    
}
