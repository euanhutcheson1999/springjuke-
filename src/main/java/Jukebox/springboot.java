package Jukebox;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

public class springboot {
    @CrossOrigin("http://localhost:8080")
    @GetMapping("/customRoute")
    public String myResponse(){
        Album ab = new Album();
        return ab.toStringa1();
}}
