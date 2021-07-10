
package controle;

import java.util.ArrayList;// importa a classe ArrayList do pacote java.util

public interface InterfaceAplicativo { //cria interface "InterfaceAplicativo"
    
    public void cadastrar(String nome, String disciplina, String conteudo, int dia, int mes, int ano); //declara o método "cadastrar()"
    public ArrayList<String> listar();// declara o método "listar()"
    public void deletar(int indice);// declara o método "deletar()"
    
}
