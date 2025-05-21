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

        Voiture v2 = new Voiture("clio3");

        // Test des setters/getters
        v1.setMarque("Peugeot");
        v1.setPrix(25000);
        assertEquals("Peugeot", v1.getMarque());
        assertEquals(25000, v1.getPrix());

        // Test de l'ID
        v1.setId(1);
        assertEquals(1, v1.getId());

        // Test de toString
        String expectedToString = "Car{marque='Peugeot', prix=25000, id=1}";
        assertEquals(expectedToString, v1.toString());
    }

    @Test
    void testerConstructeurSimple() {
        // Test spécifique du constructeur avec un seul paramètre
        Voiture v = new Voiture("clio3");
        assertEquals("clio3", v.getMarque());
    }

}
    	
    


