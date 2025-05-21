package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;



@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture() {
    	Voiture v1=new Voiture("clio4",3000);
        Assert.isTrue(v1.getMarque().equals("clio4"), "La marque ne correspond pas");
        v1.setMarque("Peugeot");
        v1.setPrix(25000);
        assertEquals("Peugeot", v1.getMarque());
        assertEquals(25000, v1.getPrix());

    }
    	
    

}
