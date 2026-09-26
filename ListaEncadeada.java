public class ListaEncadeada<Tipo> {
    private No<Tipo> inicio;
    private No<Tipo> fim;
    private int tamanho;

    public ListaEncadeada() {
        this.tamanho = 0;
    }

    // Método auxiliar para verificar se um elemento existe na lista
    private boolean existe(Tipo elemento) {
        No<Tipo> atual = this.inicio;
        while (atual != null) {
            if (atual.getElemento() != null && atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    // Alteração no método get(int posicao)
    public No<Tipo> get(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho || this.inicio == null) {
            System.out.println("Elemento não localizado.");
            return null;
        }

        No<Tipo> atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            } else {
                System.out.println("Elemento não localizado.");
                return null;
            }
        }
        return atual;
    }

    // Alteração no método adiciona (validando repetição e valores em branco)
    public void adiciona(Tipo elemento) {
        // Validação: Não permitir inserir nomes em branco
        if (elemento == null || (elemento instanceof String && ((String) elemento).trim().isEmpty())) {
            System.out.println("Erro: Não é permitido inserir elementos em branco.");

        }

        // Validação: Não permitir inserir nomes repetidos na lista
        if (existe(elemento)) {
            System.out.println("Erro: Elemento já existente na lista.");

        }

        No<Tipo> celula = new No<Tipo>(elemento);
        if (this.inicio == null && this.fim == null) {
            this.inicio = celula;
            this.fim = celula;
        } else {
            this.fim.setProximo(celula);
            this.fim = celula;
        }
        this.tamanho++;
    }

    // Implementação do método remover(Tipo elemento)
    public void remover(Tipo elemento) {
        if (this.inicio == null) {
            System.out.println("Erro: Elemento não localizado para remoção (lista vazia).");
            return;
        }

        No<Tipo> atual = this.inicio;
        No<Tipo> anterior = null;

        while (atual != null) {
            if (atual.getElemento() != null && atual.getElemento().equals(elemento)) {
                if (anterior == null) { // Remoção do primeiro nó
                    this.inicio = atual.getProximo();
                    if (this.inicio == null) {
                        this.fim = null;
                    }
                } else {
                    anterior.setProximo(atual.getProximo());
                    if (atual == this.fim) {
                        this.fim = anterior;
                    }
                }
                this.tamanho--;
                System.out.println("Elemento removido com sucesso.");
                return;
            }
            anterior = atual;
            atual = atual.getProximo();
        }

        // Quando não localizar o elemento no método remover dar mensagem de erro
        System.out.println("Erro: Elemento não localizado na lista.");
    }

    public int buscarPosicao(Tipo elemento) {
        No<Tipo> atual = this.inicio;
        int posicao = 0;

        while (atual != null) {
            if (atual.getElemento() != null && atual.getElemento().equals(elemento)) {
                return posicao;
            }
            atual = atual.getProximo();
            posicao++;
        }

        System.out.println("Elemento não localizado.");
        return -1;
    }

    public void alterar(Tipo elementoAntigo, Tipo elementoNovo) {
        // Validação do novo elemento
        if (elementoNovo == null || (elementoNovo instanceof String && ((String) elementoNovo).trim().isEmpty())) {
            System.out.println("Erro: O novo elemento não pode ser em branco.");
            return;
        }

        if (existe(elementoNovo)) {
            System.out.println("Erro: O novo elemento já existe na lista.");
            return;
        }

        No<Tipo> atual = this.inicio;
        while (atual != null) {
            if (atual.getElemento() != null && atual.getElemento().equals(elementoAntigo)) {
                atual.setElemento(elementoNovo);
                System.out.println("Dados alterados com sucesso.");
                return;
            }
            atual = atual.getProximo();
        }

        System.out.println("Erro: Elemento a ser alterado não localizado.");
    }

    public No<Tipo> getInicio() {
        return inicio;
    }

    public void setInicio(No<Tipo> inicio) {
        this.inicio = inicio;
    }

    public No<Tipo> getFim() {
        return fim;
    }

    public void setFim(No<Tipo> fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + ", fim=" + fim + ", tamanho=" + tamanho + "]";
    }
}