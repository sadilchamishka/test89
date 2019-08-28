package com.sadil.com.sadil.spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HomeController {

    @RequestMapping(value = "/",method = RequestMethod.GET )
    public void getHome(HttpServletResponse response)throws IOException {
        response.setHeader("Custom-Header", "foo");
        response.setStatus(200);
        response.getWriter().println("Hello World!");
    }

    @RequestMapping(value = "/home",method = RequestMethod.GET )
    @ResponseBody
    public ResponseEntity<String> getHome1(){
        return new ResponseEntity<String>("sadil", HttpStatus.OK);
    }

    @RequestMapping(value = "/home1",method = RequestMethod.GET )
    @ResponseBody
    public ResponseEntity<String> getHome2(){
        return new ResponseEntity<String>("sadil123", HttpStatus.OK);
    }
}
