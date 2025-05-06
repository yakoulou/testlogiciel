package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture() {
    	Voiture v1=new Voiture("clio4",3000);
        Assert.isTrue(v1.getMarque() == "clio4", "La marque ne correspond pas");

    }
    	
    

}
