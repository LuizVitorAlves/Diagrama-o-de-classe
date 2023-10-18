


public class TelaDoCelular {
    public static void main(String[] args){
        iPhone MeuCelular = new iPhone();

        System.out.println("Testando o Reprodutor Musical:");
        MeuCelular.tocar();
        MeuCelular.pausar();
        MeuCelular.selecionarMusica();

        System.out.println("Testando o Aparelho Telefônico:");
        MeuCelular.ligar();
        MeuCelular.atender();
        MeuCelular.iniciarCorreioVoz();

        System.out.println("Testando o Navegador na Internet:");
        MeuCelular.exibirPagina();
        MeuCelular.adicionarNovaAba();
        MeuCelular.atualizarPagina();
    }
}