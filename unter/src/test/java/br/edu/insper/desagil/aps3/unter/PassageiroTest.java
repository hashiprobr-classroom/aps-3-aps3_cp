package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    private Passageiro passageiro;

    @BeforeEach
    void setUp() {
        passageiro = new Passageiro("123.456.789-00", "João Silva");
    }

    @Test
    void constroi() {
        assertEquals("123.456.789-00", passageiro.getCpf());
        assertEquals("João Silva", passageiro.getNome());
    }

    @Test
    void mudaNome() {
        passageiro.setNome("Carlos Souza");
        assertEquals("Carlos Souza", passageiro.getNome());
    }

    @Test
    void avalia() {
        Corrida corrida = new Corrida(passageiro);
        passageiro.avalia(corrida, 3);
        assertEquals(3, corrida.getNotaMotorista());
    }

    @Test
    void avaliaBaixo() {
        Corrida corrida = new Corrida(passageiro);
        passageiro.avalia(corrida, 0);
        assertEquals(1, corrida.getNotaMotorista());
    }

    @Test
    void avaliaAlto() {
        Corrida corrida = new Corrida(passageiro);
        passageiro.avalia(corrida, 6);
        assertEquals(5, corrida.getNotaMotorista());
    }
}
