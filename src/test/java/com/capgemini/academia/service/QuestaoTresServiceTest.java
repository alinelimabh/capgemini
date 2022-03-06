package com.capgemini.academia.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestaoTresServiceTest {

    private QuestaoTresService service;

    @BeforeEach
    void setUp() {
        service = new QuestaoTresService();
    }

    @DisplayName("Deve criptografar texto")
    @Test
    void encriptarTexto() {
        String textoUm = service.encriptarTexto("tenha um bom dia");
        String textoDois = service.encriptarTexto("ola mundo");
        assertEquals(textoUm, "taoa eum nmd hbi");
        assertEquals(textoDois, "omd luo an");
    }

    @DisplayName("Deve retornar IllegalArgumentException quando o texto for nulo")
    @Test
    void testDeveLevantarExcecaoQuandoTextoForNulo() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,() -> service.encriptarTexto(null));
        assertEquals("O texto não pode ser nulo", exception.getMessage());
    }

}