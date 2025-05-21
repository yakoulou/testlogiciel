package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.mockito.Mockito.*;


@SpringBootTest
public class StatistiqueTests {


    StatistiqueImpl s1= new StatistiqueImpl();

    @Test
    void avecMockbean() throws Exception {
        try {
        Voiture v1 = mock(Voiture.class);
        Voiture v2 = mock(Voiture.class);
        when(v1.getPrix()).thenReturn(2000);// si jamais dans la suite du programme tu a besoin de faire un getprix() tu vas me mettre 100
        when(v2.    getPrix()).thenReturn(3000);// Quelle comportement le mock doit avoir !

        Echantillon e1 = s1.prixMoyen();
       // when(s1.prixMoyen()).thenReturn(new Echantillon(2, 2500));
        Assert.isTrue(s1.prixMoyen().getNombreDeVoitures() == 2, "Le nombre de voitures n'est pas correct");
        Assert.isTrue(s1.prixMoyen().getPrixMoyen() == 2900, "Le prix moyen n'est pas correct");

        assertEquals(e1.getPrixMoyen(),0);
         } catch (ArithmeticException e) {
            System.out.println("pas de voiture");
        }
}
    }
