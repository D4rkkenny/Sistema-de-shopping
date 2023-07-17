
/**
 * Escreva uma descrição da classe Informatica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Informatica extends Loja{
    private double seguroEletronicos;
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,int x,double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao,x);
        this.seguroEletronicos = seguroEletronicos;
    }
    //getters
    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }
    //setters
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }
    //metodo toString
    public String toString(){
        return super.toString()+ "\n Seguro dos Eletronicos: "+seguroEletronicos;
    }
}
