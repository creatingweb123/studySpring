package com.in28minutes.rest.webservices.restfulwebwervices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Rest API
@RestController
public class HelloWorldController {

    // private MessageSource messageSource;

    // public HelloWorldController(MessageSource messageSource) {
    // this.messageSource = messageSource;
    // }

    // /hello-world
    // return "Hello World"
    // @RequestMapping(method=RequestMethod.GET, path="/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloworld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloworldbean() {
        return new HelloWorldBean("Hello World");
    }

    // Path Parameters
    @GetMapping(path = "/hello-world-bean/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(
                String.format("Hello World, %s", name));
    }

    // @GetMapping(path = "/hello-world-internationalized")
    // public String helloWorldInternationalized() {
    // Locale locale = LocaleContextHolder.getLocale();
    // return messageSource.getMessage("good.morning.message", null, "Default
    // Message", locale);
    // }
}
