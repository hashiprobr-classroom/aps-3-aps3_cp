package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central {
    private List<Corrida> corridas;

    public Central(){

        this.corridas = new ArrayList<>();
    }

    public void adiciona (Corrida corrida){
        corridas.add(corrida);
    }

    public double mediaPassageiro(String cpf){
        int soma = 0;
        int quantidade = 0;
        for (Corrida corrida : corridas){
            if(corrida.getPassageiro().getCpf().equals(cpf)){
                int nota = corrida.getNotaPassageiro();
                if (nota > 0){
                    soma += nota;
                    quantidade+= 1;
                }
            }
        }
        if (quantidade == 0){
            return 0.0;
        }
        else{
            return (double) soma/quantidade;
        }

    }

    public double mediaMotorista(String cpf) {
        int soma = 0;
        int quantidade = 0;
        for (Corrida corrida : corridas) {
            if (corrida.getMotorista() != null && corrida.getMotorista().getCpf().equals(cpf)) {
                int nota = corrida.getNotaMotorista();
                if (nota > 0) {
                    soma += nota;
                    quantidade+= 1;
                }
            }
        }
        if (quantidade == 0) {
            return 0.0;
        } else {
            return (double) soma / quantidade;
        }
    }
}
