
package visao;

import controle.Aplicativo;// importa a classe Aplicativo do pacote controle
import java.util.Scanner;// importa a classe Scanner do pacote java.util

public class EntradaSaidaSystem implements InterfaceEntradaSaida {// cria a classe "EntradaSaidaSystem" que implementa a interface "InterfaceEntradaSaida"
    
    private final Scanner teclado = new Scanner(System.in);// declara objeto Scanner para a leitura de dados de entrada
    
    //implementa método da interface, que mostra na tela o menu de opções e retorna a opção do usuário
    @Override
    public int mostraMenuLerOpcao() {
        System.out.println("\n******* MENU *********\n");
        System.out.println(" 1 - LISTA DADOS NO BANCO\n 2 - CADASTRAR AVALIAÇÃO\n 3 - REMOVER POR ÍNDICE\n 0 - SAIR\n");
        System.out.print("Digite sua opção: ");
        int op = this.teclado.nextInt();// armazena a entrada do teclado correspondente a opção do usuário
        this.teclado.nextLine();// lê o "\n" liberado pela execução do "this.teclado.nextInt()", para que não dê erro nas leituras seguintes
        System.out.println("______________________________________________________________");
        return (op);// retorna a opção digitada
    }

    //implementa método da interface, que lista a descrição de cada objeto "avaliação" 
    @Override
    public void listarDadosBanco(Aplicativo app) { 
        System.out.println("\n ********** LISTA DE AVALIAÇÕES: **********\n");
        //cria loop que se repete de acordo à quantidade de objetos "avaliacao" existentes
        for(int i= 0; i<app.listar().size();i++){
            System.out.println(app.listar().get(i)+"\n");//mostra na tela a informação de cada objeto "avaliacao" existente
        }
        System.out.println("______________________________________________________________");
    }

    //implementa método da interface, que executa o cadastro de um novo objeto "avaliacao"
    @Override
    public void lerDadosExecutaCadastro(Aplicativo app) {
        System.out.println("\n********CADASTRAR AVALIAÇÃO********\n");
        
        System.out.print("Digite seu nome: ");
        String nome = this.teclado.nextLine();// armazena o "nome" digitado pelo usuário
        
        System.out.print("Digite a que disciplina se refere esta avaliação: ");
        String disciplina = this.teclado.nextLine();// armazena a "disciplina" digitada pelo usuário
        
        System.out.print("Digite o conteúdo da avaliação: ");
        String conteudo = this.teclado.nextLine();// armazena o "avaliacao" digitado pelo usuário
        
        System.out.print("Digite o dia: ");
        int dia = this.teclado.nextInt();// armazena o "dia" digitado pelo usuário
        System.out.print("Digite o mês: ");
        int mes = this.teclado.nextInt();// armazena o "mes" digitado pelo usuário
        System.out.print("Digite o ano: ");
        int ano = this.teclado.nextInt();// armazena o "ano" digitado pelo usuário
        System.out.print("\n/////////// AVALIAÇÃO CADASTRADA! //////////\n");
        System.out.println("______________________________________________________________");
        // executa o método "cadastrar()" do "app", passando como parâmetros o que foi digitado pelo usuário
        app.cadastrar(nome, disciplina, conteudo, dia, mes ,ano);
    }

    //implementa método da interface, que executa a remoção de um objeto "avaliacao" 
    @Override
    public void lerIndiceExecutaRemocao(Aplicativo app) {
        System.out.println("\n***********REMOVER AVALIAÇÃO****************\n");
        System.out.print("Digite o índice da prova que deseja remover: ");
        int indice = this.teclado.nextInt();// armazena o índice da "avaliacao" que será removida digitado pelo usuário 
        app.deletar(indice);// executa o método "deletar()" do "app" passando como parâmetro o índice digitado
        System.out.println("\n/////////AVALIAÇÃO REMOVIDA!///////////\n");
        System.out.println("______________________________________________________________");
    }
    
}
