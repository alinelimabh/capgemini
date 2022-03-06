package com.capgemini.academia.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestaoDoisServiceTest {

    private QuestaoDoisService service;

    @BeforeEach
    void setUp() {
        service = new QuestaoDoisService();
    }

    @DisplayName("Deve retornar 3 para array { 1, 5, 3, 4, 2 }")
    @Test
    void calcularQuantidadePares() {
        int[] n = { 1, 5, 3, 4, 2 };
        int result = service.calcularQuantidadePares(n, 2);
        assertEquals(result, 3);
    }

}