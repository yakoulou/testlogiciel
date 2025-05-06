package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import static org.mockito.Mockito.*;


@SpringBootTest
public class StatistiqueTests {

    @MockBean
    StatistiqueImpl statistiqueImpl;

    @Test
    void avecMockbean() throws Exception {
        try {
        Voiture v1 = mock(Voiture.class);
        Voiture v2 = mock(Voiture.class);
        when(v1.getPrix()).thenReturn(2000);
        when(v2.getPrix()).thenReturn(3000);
        doNothing().when(statistiqueImpl).ajouter(v1);

        Echantillon e1 = mock(Echantillon.class);
        when(e1.getPrixMoyen()).thenReturn(2100);
        when(statistiqueImpl.prixMoyen()).thenReturn(e1);
        Assert.isTrue(statistiqueImpl.prixMoyen().getPrixMoyen() == 2000, "Le prix moyen n'est pas correct");

         } catch (ArithmeticException e) {
            System.out.println("pas de voiture");
        }
}
    }
