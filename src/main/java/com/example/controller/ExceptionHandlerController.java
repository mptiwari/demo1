/*
package com.example.controller;


import org.springframework.http.HttpRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlerController{

    @ExceptionHandler
    public ModelAndView handleError(HttpRequest httpRequest, Exception ex){

        System.out.println(httpRequest.getURI());

        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "Sorry, we couldn't find what you are looking for." + ex.getMessage());
        mav.addObject("url", httpRequest.getURI());
        mav.setViewName("error");
        return mav;
    }

}*/
