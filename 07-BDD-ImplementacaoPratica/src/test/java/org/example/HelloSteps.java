package org.example;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.Assert.assertEquals;

public class HelloSteps {

    Hello hello;
    String nome;

    @Dado("que o usuario escolha ser cumprimentado")
    public void que_o_usuario_esteja_no_sistema() {
        hello = new Hello();
    }

    @Quando("ele entrar com nome {string}")
    public void ele_entrar_com_nome(String string) {
        nome = string;
    }

    @Entao("ele deve receber como resposta {string}")
    public void ele_deve_receber_como_resposta(String string) {
        assertEquals(string, hello.cumprimentar(nome));
    }

}
