package Groupe7.sa.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="test")

public class Testcontroller {

    @GetMapping(path="String")
    public String getString() {
        return "Chaine de caractere transmise par SA";
    }

    @GetMapping()

    public List<String> getList() {
        return List.of("Chaine de caractere" , "transmise par SA");
    }

}



