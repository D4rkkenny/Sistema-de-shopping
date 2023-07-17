
/**
 * Escreva uma descrição da classe Alimentacao aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Alimentacao extends Loja{
    private Data dataAlvara;
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,Data dataAlvara,int x){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao,x);
        this.dataAlvara = dataAlvara;
    }
    //getters
    public Data getDataAlvara(){
        return dataAlvara;
    }
    //setters
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }
    //metodo toString
    public String toString(){
        return super.toString()+"\n Data de Alvara: "+dataAlvara;
    }
}
