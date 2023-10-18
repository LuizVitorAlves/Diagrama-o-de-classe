public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos das interfaces ReprodutorMusical, AparelhoTelefonico e NavegadorInternet

    @Override
    public void tocar() {
        System.out.println("Sua musica está tocando.");
    }

    @Override
    public void pausar() {
        System.out.println("Sua musica foi pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Tocando a musica selecionada.");
    }

    @Override
    public void ligar() {
        System.out.println("Chamando, aguarde.");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz, deixe seu recado.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso.");
    }
}