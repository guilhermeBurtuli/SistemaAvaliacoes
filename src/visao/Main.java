package visao;

import controle.Aplicativo;// importa a classe Aplicativo do pacote controle

public class Main {// cria classe "Main"
    public static void main (String[] args){// declara método main
        
        Aplicativo app = new Aplicativo();// instancia objeto "app" da classe Aplicativo
        EntradaSaidaSystem ios = new EntradaSaidaSystem();// instancia objeto "ios" da classe EntradaSaidaSystem
        int opcao ;// declara variável "opcao"  
        //cria loop para continuar ou encerrar o programa
        do {
            opcao = ios.mostraMenuLerOpcao();// atribui à "opcao" o retorno do método "mostraMenuLerOpcao()"
            //escolhe à opção do usuário
            switch (opcao){
                case 1:// caso "opcao" = 1 (listar)
                    ios.listarDadosBanco(app);// executa o método "listarDadosBanco()"
                    break;
                case 2:// caso "opcao" = 2 (cadastrar)
                   ios.lerDadosExecutaCadastro(app);// executa o método "lerDadosExecutaCadastro()"
                    break;
                case 3:// caso "opcao" = 3 (remover)
                    ios.lerIndiceExecutaRemocao(app);// executa o método "lerIndiceExecutaRemocao()"
                    break;
                case 0:// caso "opcao" = 0 (sair)
                    System.out.println("\n*********VOCÊ SAIU DO PROGRAMA*********\n");
                    break;
            }       
        }while (opcao != 0);// encerra a execução do programa quando 0 é digitado
    }
}
