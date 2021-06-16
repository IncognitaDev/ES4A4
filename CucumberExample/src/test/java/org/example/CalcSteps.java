package org.example;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.Assert.assertEquals;


public class CalcSteps {

    Calc calculadora;
    int num1, num2;

    @Dado("^que eu escolha somar$")
    public void que_eu_escolha_somar() {
        calculadora = new Calc();
    }

    @Quando("^eu preencho o primeiro número com o valor '(\\d+)'$")
    public void eu_preencho_o_primeiro_número_com_o_valor(int arg1) {
        num1 = arg1;
    }

    @Quando("^eu preencio o segundo número com o valor '(\\d+)'$")
    public void eu_preencio_o_segundo_número_com_o_valor(int arg1) {
        num2 = arg1;
    }

    @Entao("^eu devo receber como resposta '(\\d+)'$")
    public void eu_devo_receber_como_resposta(int arg1)  {
        assertEquals(num1 + num2,  calculadora.somar(num1, num2));
    }
}
