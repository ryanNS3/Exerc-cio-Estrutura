public class Lista {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        System.out.println("Tamanho da Lista =" + lista.getTamanho());

        lista.adiciona("Claudio");

        System.out.println(lista);
        System.out.println("Tamanho da Lista =" + lista.getTamanho());
        System.out.println("Inicio da Lista =" + lista.getInicio().getElemento());
        System.out.println("Fim da Lista =" + lista.getFim().getElemento());

        lista.adiciona("Camila");

        System.out.println(lista);
        System.out.println("Tamanho da lista =" + lista.getTamanho());
        System.out.println("Inicio da lista =" + lista.getInicio().getElemento());
        System.out.println("Fim da lista =" + lista.getFim().getElemento());

    }
}