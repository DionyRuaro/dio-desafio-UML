public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");
    }
}
