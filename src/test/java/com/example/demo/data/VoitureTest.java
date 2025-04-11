package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
    	Voiture v1=new Voiture("clio5",3000);
    	assert.isTrue(v1.getMarque().equals("clio5"),"T pas de tals");
    }

}
