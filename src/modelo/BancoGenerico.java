
package modelo;

import java.util.ArrayList;// importa classe ArrayList do pacote java.util

public abstract class BancoGenerico{//cria classe abstrata "BancoGenerico"
    
    abstract public int quantosTem();// declara o método abstrato "quantosTem()"
    abstract public Avaliacao acessar(int indice);// declara o método abstrato "acessar()"
    abstract public void adicionar(Avaliacao a);// declara o método abstrato "adicionar()"
    abstract public Avaliacao remover(int indice);// declara o método abstrato "remover()"
    abstract public ArrayList<Avaliacao> carregar(String arquivo);// declara o método abstrato "carregar()"
    abstract public void salvar(String arquivo);// declara o método abstrato "salvar()"
}
