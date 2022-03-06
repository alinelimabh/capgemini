package com.capgemini.academia.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestaoUmServiceTest {

    private QuestaoUmService service;

    @BeforeEach
    void setUp() {
        service = new QuestaoUmService();
    }

    @DisplayName("Deve retornar 4 quando passar array { 9, 2, 1, 4, 6 }")
    @Test
    void recuperarMediana() {
        int array[] = { 9, 2, 1, 4, 6 };
        int result = service.recuperarMediana(array);
        assertEquals(result, 4);
    }


    @DisplayName("Deve retornar IllegalArgumentException quando o array tiver uma quantidade par de elementos")
    @Test
    void testDeveLevantarExcecaoArrayComNumeroParDeElementos() {
        int[] arr = { 1, 2 };
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,() -> service.recuperarMediana(arr));
        assertEquals("A quantidade de elementos deve ser impar", exception.getMessage());
    }

}