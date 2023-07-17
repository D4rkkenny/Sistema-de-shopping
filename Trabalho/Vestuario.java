
/**
 * Escreva uma descrição da classe Vestuario aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Vestuario extends Loja{
    private boolean produtosImportados;
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,boolean produtosImportados,int x){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao,x);
        this.produtosImportados = produtosImportados;
    }
    //getters
    public boolean getProdutosImportados(){
        return produtosImportados;
    }
    //setters
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }
    //metodo toString
    public String toString(){
        return super.toString()+"\n Ver se os produtos são importados: "+produtosImportados; 
    }
}
