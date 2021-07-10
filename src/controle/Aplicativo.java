
package controle;

import java.util.ArrayList;// importa a classe ArrayList do pacote java.util
import modelo.Avaliacao;// importa a classe Avaliacao do pacote modelo
import modelo.Banco;// importa a classe Banco do pacote modelo

public class Aplicativo implements InterfaceAplicativo {// cria classe "Aplicativo" que implementa a interface "InterfaceAplicativo" 
    
    private final Banco banco;// instancia o objeto "banco" da classe Banco

    //sobreescrita do método construtor 
    public Aplicativo(){
        this.banco = new Banco();// inicializa o objeto "banco" em questão atribuindo um novo Banco à ele
    }
    
    //implementa método da interface, que cadastra uma nova "avaliação"
    @Override
    public void cadastrar(String nome, String disciplina, String conteudo, int dia, int mes, int ano) {
        Avaliacao avaliacao = new Avaliacao(nome, disciplina, conteudo, dia, mes, ano);// instancia um objeto avaliação
        this.banco.adicionar(avaliacao);// executa a método adicionar() do objeto "banco" passando como parâmetro o objeto "avaliacao"
        this.banco.salvar("arquivo");// salva o "banco" com o novo objeto cadastrado no arquivo com nome "arquivo" por meio da execução do método "salvar()"

    }
    
    //implementa método da interface, que retorna um ArrayList com a descrição de cada objeto "avaliacao" presente no objeto "banco"
    @Override
    public ArrayList<String> listar() {  
        ArrayList<String> listaString = new ArrayList();// cria um ArrayList de String para armazenar as informações de cada objeto "avaliacao"
        //loop que é executado de acordo ao retorno do método "quantosTem()" do objeto banco (quantidade de objetos "avaliacao")
        for(int i= 0; i<this.banco.quantosTem();i++){
            listaString.add(this.banco.acessar(i).toString());//adiciona à "listaString" as informações de cada objeto "avaliacao" presente no objeto "banco", por meio meio da execução do método toString() de cada uma
        }
        return listaString;// retorna "listaString" com as informações de cada objeto "avaliacao"
    }

    //implementa método da interface, que deleta um objeto "avaliacao" do objeto "banco"
    @Override
    public void deletar(int indice) {
        // executa o método remover() do objeto "banco" passando como parâmetro o índice do objeto "avaliacao" que será deletado 
        // e o mostra na tela (como o método toString() da classe "Avaliacao" foi sobreescrito, será mostrado o retorno desse método)
        System.out.println(this.banco.remover(indice));
        this.banco.salvar("arquivo");// salva o "banco" com o objeto deletado no arquivo com nome "arquivo" por meio da execução do método "salvar()"
    }
    
}
