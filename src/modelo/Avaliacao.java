
package modelo;

import java.io.Serializable;// importa interface Serializable do pacote java.io

public class Avaliacao implements Serializable{// cria classe "Avaliacao" que implementa a interface Serializable, para serialização dos objetos
    
    private String nome;// declara a atributo "nome" de cada objeto "avaliacao"
    private int dia;// declara o atributo "dia" de cada objeto "avaliacao"
    private int mes;// declara o atributo "mes" de cada objeto "avaliacao"
    private int ano;// declara o atributo "ano" de cada objeto "avaliacao"
    private String disciplina; // declara o atributo "disciplina" de cada objeto "avaliacao"
    private String conteudo; // declara o atributo "conteudo" de cada objeto "avaliacao"
    
    // sobreescreve o método construtor 
    public Avaliacao(String nome, String disciplina, String conteudo, int dia,int mes,int ano){
        this.nome = nome;// inicializa o atributo "nome" do objeto "avaliacao" em questão com o nome passado pelo parâmetro
        this.disciplina = disciplina; // inicializa o atributo "disciplina" do objeto "avaliacao" em questão com a disciplina passada pelo parâmetro
        this.conteudo = conteudo; // inicializa o atributo "conteudo" do objeto "avaliacao" em questão com o conteudo passado pelo parâmetro
        this.dia = dia;// inicializa o atributo "dia" do objeto "avaliacao" em questão com o dia passado pelo parâmetro
        this.mes = mes;// inicializa o atributo "mes" do objeto "avaliacao" em questão com o mes passado pelo parâmetro
        this.ano = ano;// inicializa o atributo "ano" do objeto "avaliacao" em questão com o ano passado pelo parâmetro
    }
    
    // declara método getter do atributo "nome"
    public String getNome(){
        return this.nome;//retorna o atributo "nome" do objeto "avaliacao" em questão
    }
    
    // declara método setter do atributo "nome"
    public void setNome(String nome){
        this.nome = nome;//modifica o atributo "nome" do objeto "avaliacao" em questão
    }
    
    // declara método getter do atributo "dia"
    public int getDia(){
        return this.dia;// retorna o atributo "dia" do objeto "avaliacao" em questão 
    }
    
    // declara método setter do atributo "dia"
    public void setDia(int dia){
        this.dia = dia;// modifica o atributo "dia" do objeto "avaliacao" em questão
    }
    
    // declara método getter do atributo "mes"
    public int getMes(){
        return this.mes;// retorna o atributo "mes" do objeto "avaliacao" em questão
    }    
    
    // declara método setter do atributo "mes"
    public void setMes(int mes){
        this.mes = mes;// modifica o atributo "mes" do objeto "avaliacao" em questão
    }
    
    // declara método getter do atributo "ano"
    public int getAno(){
        return this.ano;// retorna o atributo "ano" do objeto "avaliacao" em questão
    }
    
    // declara método setter do atributo "ano"
    public void setAno(int ano){
        this.ano = ano;// modifica o atributo "ano" do objeto "avaliacao" em questão
    }
    
    // declara método getter do atributo "disciplina"
    public String getDisciplina(){
        return this.disciplina;// retorna o atributo "disciplina" do objeto "avaliacao" em questão
    }
    
    // declara método setter do atributo "disciplina"
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;// modifica o atributo "disciplina" do objeto "avaliacao" em questão
    }
    
    // declara método getter do atributo "conteudo"
    public String getConteudo(){
        return this.conteudo;// retorna o atributo "conteudo" do objeto "avaliacao" em questão
    }
    
    // declara método setter do atributo "conteudo"
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;// modifica o atributo "conteudo" do objeto "avaliacao" em questão
    }
   
    // sobreescreve o método toString
    @Override
    public String toString(){
        return (this.nome+". "+this.disciplina+". "+this.dia+"/"+this.mes+"/"+this.ano);             
    }
    
}

