package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    @Qualifier("hpPrinter") // Use @Qualifier to specify which implementation to inject
    private Printer printer;

    @RequestMapping("/test")
    public String test(){
        printer.print("Hello World");
        return "Hello World";
    }

}
