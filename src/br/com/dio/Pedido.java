package br.com.dio;

public class Pedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.gravar();

    }

    private EnviarEmail enviar = EnviarEmail.obterDados();
    public void gravar() {
        this.enviar.retornar("Pedido enviado com sucesso");
    }
}
