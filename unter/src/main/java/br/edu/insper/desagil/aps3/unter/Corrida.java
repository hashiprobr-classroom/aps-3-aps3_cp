package br.edu.insper.desagil.aps3.unter;

public class Corrida {

    private Passageiro passageiro;
    private Motorista motorista;
    private int notaPassageiro;
    private int notaMotorista;

    public Corrida(Passageiro passageiro){
        this.passageiro = passageiro;
        this.motorista = null;
        this.notaPassageiro = 0;
        this.notaMotorista = 0;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public int getNotaPassageiro() {
        return notaPassageiro;
    }

    public int getNotaMotorista() {
        return notaMotorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    private int notaTruncada(int nota) {
        if (nota < 1) {
            return 1;
        }
        if (nota > 5) {
            return 5;
        }
        return nota;
    }

    public void setNotaPassageiro(int notaPassageiro) {
        this.notaPassageiro = notaTruncada(notaPassageiro);
    }

    public void setNotaMotorista(int notaMotorista) {
        this.notaMotorista = notaTruncada(notaMotorista);
    }
}
