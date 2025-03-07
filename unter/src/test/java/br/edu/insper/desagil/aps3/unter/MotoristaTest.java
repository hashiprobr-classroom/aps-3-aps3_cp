package br.edu.insper.desagil.aps3.unter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MotoristaTest {

    private Motorista motorista;
    private Corrida corrida;

    @BeforeEach
    void setUp() {
        motorista = new Motorista("12345678900", "David");
        Passageiro passageiro = new Passageiro("09876543211", "Bueno");
        corrida = new Corrida(passageiro);
        corrida.setMotorista(motorista);
    }

    @Test
    void constroi() {
        assertEquals("12345678900", motorista.getCpf());
        assertEquals("David", motorista.getNome());
    }

    @Test
    void mudaNome() {
        motorista.setNome("Pedro");
        assertEquals("Pedro", motorista.getNome());
    }

    @Test
    void avalia() {
        motorista.avalia(corrida, 3);
        assertEquals(3, corrida.getNotaPassageiro());
    }

    @Test
    void avaliaBaixo() {
        motorista.avalia(corrida, 0);
        assertEquals(1, corrida.getNotaPassageiro());
    }

    @Test
    void avaliaAlto() {
        motorista.avalia(corrida, 6);
        assertEquals(5, corrida.getNotaPassageiro());
    }
}
