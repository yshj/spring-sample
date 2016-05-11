package org.spring.ysj.sample.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.spring.ysj.sample.exception.RestException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestCotroller {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}

	@RequestMapping(value = "/json", method = RequestMethod.GET)
	public Object json() {
		HashMap<String, String> response = new HashMap<String, String>();
		response.put("key", "value");
		return response;
	}

    @RequestMapping(value = "/session", method = RequestMethod.GET)
    public String index(Model model,HttpServletRequest request,String action,String msg){
        HttpSession session=request.getSession();
        if ("set".equals(action)){
            session.setAttribute("msg", msg);
        }else if ("get".equals(action)){
            String message=(String)session.getAttribute("msg");
            System.out.println("message = " + message);
            model.addAttribute("msgFromRedis",message);
        }
        return "index";
    }

    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    public void exception() {
    	throw new RestException(HttpStatus.INTERNAL_SERVER_ERROR, "a", "aaa");
    }
}
