
package visao;

import controle.Aplicativo;// importa a classe Aplicativo do pacote controle

public interface InterfaceEntradaSaida {// cria a interface "InterfaceEntradaSaida"
    
    public int mostraMenuLerOpcao();// declara o método "mostraMenuLerOpcao"
    public void listarDadosBanco(Aplicativo app);// declara o método "listarDadosBanco"
    public void lerDadosExecutaCadastro(Aplicativo app);// declara o método "lerDadosExecutaCadastro"
    public void lerIndiceExecutaRemocao(Aplicativo app);// declara o método "lerIndiceExecutaRemocao"
    
}
