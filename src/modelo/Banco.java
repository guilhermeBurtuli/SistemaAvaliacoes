
package modelo;

import java.io.FileInputStream;// importa a classe FileInputStream do pacote java.io
import java.io.FileNotFoundException;// importa a classe FileNotFoundException do pacote java.io
import java.io.FileOutputStream;// importa a classe FileOutputStream do pacote java.io
import java.io.IOException;// importa a classe IOException do pacote java.io
import java.io.ObjectInputStream;// importa a classe ObjectInputStream do pacote java.io
import java.io.ObjectOutputStream;// importa a classe ObjectOutputStream do pacote java.io
import java.util.ArrayList;// importa a classe ArrayList do pacote io

public class Banco extends BancoGenerico{ //cria classe "Banco" que herda da classe abstrata "BancoGenerico"
    
    private final ArrayList<Avaliacao> lista ; //instancia objeto "lista" da classe ArrayList com o tipo "Avaliacao"
    
    //sobreescreve o método construtor  
    public Banco(){
        this.lista = this.carregar("arquivo");// atribui à "lista" o conteúdo do arquivo retornado pelo método "carregar()", passando o arquivo com nome "arquivo"
    }

    //sobreescreve o método abstrato da superclasse, que retorna a quantidade de elementos presentes no objeto "lista"
    @Override
    public int quantosTem() {
        return this.lista.size();// executa e retorna o método size() do objeto "lista", que retorna sua quantidade de elementos 
    }

    //sobreescreve o método abstrato da superclasse, que retorna o elemento do objeto "lista" de acordo ao índice dado
    @Override
    public Avaliacao acessar(int indice) {
        return this.lista.get(indice);// retorna o elemento do objeto "lista" correspondente ao índice passado no método get()
    }                                   
    
    //sobreescreve o método abstrato da superclasse, que adiciona um novo elemento á última posição do objeto "lista"
    @Override
    public void adicionar(Avaliacao a) {
        this.lista.add(a);// executa o método add() e adiciona o elemento passado no parâmetro na última posição do objeto "lista"  
    }

    //sobreescreve o método abstrato da superclasse, que remove um elemento do objeto "lista"
    @Override
    public Avaliacao remover(int indice) {
        Avaliacao prova = this.lista.get(indice);// salva o elemento que irá ser apagado em uma variável
        this.lista.remove(indice);// executa o método remove() e remove do objeto "lista" o elemento passado no parâmetro
        return prova;// retorna o elemento que foi removido
    }
    
    //sobreescreve o método abstrato da superclasse, que carrega os dados de um arquivo e retorna um ArrayList com esses dados
    @Override
    public ArrayList<Avaliacao> carregar(String arquivo){
        
        ArrayList<Avaliacao> carrega = new ArrayList();// declara ArrayList para armazenar os dados do arquivo
        
        //monitora bloco de código que pode gerar exceções
        try {            
            FileInputStream inp = new FileInputStream(arquivo);// cria um arquivo para servir de leitura de dados no caminho especificado por "arquivo"
            ObjectInputStream objInp = new ObjectInputStream(inp);// cria um objeto que recebe de entrada o conteúdo do arquivo especificado            
            carrega = (ArrayList) objInp.readObject();// atribui ao ArrayList "carrega" o conteúdo presente no arquivo
            
        } catch (FileNotFoundException ex) { // captura e trata de exceções de encontrar arquivo 
            System.out.println("Exceção: "+ex+"\n Não foi possível encontrar o arquivo");
        } catch (IOException ex) {// captura e trata de exceções de entrada e saída
            System.out.println("Exceção: "+ex+"\n Problema de entrada ou saída");
        } catch (ClassNotFoundException ex) {// captura e trata exceções relacionadas à classes
            System.out.println("Exceção: "+ex+"\n Problema com classes");
        }
        
        return carrega;// retorna o ArrayList com os dados do arquivo    
        
    }
    
    //sobreescreve o método abstrato da superclasse, que salva o ArrayList "lista" em um arquivo
    @Override
    public void salvar(String arquivo){   
        
        //monitora bloco de código que pode gerar exceções
        try {            
            FileOutputStream out = new FileOutputStream(arquivo);// cria um arquivo para servir de gravação de dados no caminho especificado por "arquivo"
            ObjectOutputStream objOut = new ObjectOutputStream(out);// cria um objeto que recebe de caminho de saída o arquivo especificado
            
            objOut.writeObject(this.lista);// grava o objeto "lista" dentro do arquivo
            objOut.close();// fecha o arquivo
        
        } catch (FileNotFoundException ex) {//captura e trata de exceções de encontrar arquivo
            System.out.println("Exceção: "+ex+"\n Não foi possível encontrar o arquivo");
        } catch (IOException ex) {// captura e trata de exceções relacionadas à entrada e saída
            System.out.println("Exceção: "+ex+"\n Problema de entrada ou saída");
        } 
                      
    }
    
}


