//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    ListaEncadeada<String> lista = new ListaEncadeada<>();

    System.out.println("Tamanho da Lista =" + lista.getTamanho());

    lista.adiciona("Claudio");

    System.out.println(lista);
    System.out.println("Tamanho da Lista =" + lista.getTamanho());
    System.out.println("Inicio da Lista =" + lista.getInicio().getElemento());
    System.out.println("Fim da Lista =" + lista.getFim().getElemento());

    lista.adiciona("Camila");
    lista.adiciona("Miguel");
    lista.adiciona("Elise");

    System.out.println(lista);
    System.out.println("Tamanho da lista =" + lista.getTamanho());
    System.out.println("Inicio da lista =" + lista.getInicio().getElemento());
    System.out.println("Fim da lista =" + lista.getFim().getElemento());

    System.out.println(lista.get(1));
    lista.alterar("Camila", "Bernado");
    System.out.println(lista.get(1));








}
