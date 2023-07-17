
/**
 * Escreva uma descrição da classe Bijuteria aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Bijuteria extends Loja{
    private double metaVendas;
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,int x,double metaVendas){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao,x);
        this.metaVendas = metaVendas;
    }
    //getters
    public double getMetaVendas(){
        return metaVendas;
    }
    //setters
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
    public String toString(){
        return super.toString()+"\n Meta de Vendas: "+metaVendas;
    }
}
