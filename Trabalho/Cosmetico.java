
/**
 * Escreva uma descrição da classe Cosmetico aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Cosmetico extends Loja{
    private double taxaComercializacao;
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,int x, double taxaComercializacao){
        super(nome,quantidadeFuncionarios,salarioBaseFuncionario,endereco,dataFundacao,x);
        this.taxaComercializacao = taxaComercializacao;
        
    }
    //getters
    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }
    //setters
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }
    //metodo toString
    public String toString(){
        return super.toString()+"\n Taxa de Comercialização: "+taxaComercializacao;
    }
}
