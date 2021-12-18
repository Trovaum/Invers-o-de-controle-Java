package br.com.dio;

public class EnviarEmail {
    private String tipo;
    private String endereco;
    private String senha;

    public EnviarEmail(String tipo, String endereco, String senha) {
        this.tipo = tipo;
        this.endereco = endereco;
        this.senha = senha;
    }

    public static EnviarEmail obterDados() {
        return new EnviarEmail("http://", "ricardopouza@gmail.com", "123456");
    }

    public void retornar(String message) {
        System.out.println("Email enviado com sucesso / " + message);
    }
}
