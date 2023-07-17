
/**
 * Escreva uma descrição da classe Produto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Produto{
    private String nome;
    private double preco;
    private Data dataValidade;
    public Produto(String nome, double preco,Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    //getter
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public Data getDataValidade(){
        return dataValidade;
    }
    //setter
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    //metodo toString
    public String toString(){
        return ("Nome: "+nome+"\n Preço: "+preco+"\n Data de validade: "+dataValidade.toString());
    }
    
    public boolean estaVencido(Data dataValidade){
        if (dataValidade.getAno() > 2021){ //por não ter especificado na questão coloquei uma data para vencimento de 2 anos
            return true;
        }else if(dataValidade.getAno() == 2021){
            if (dataValidade.getMes() > 5){
                return true;
            }else if(dataValidade.getMes() == 5){
                if(dataValidade.getDia() > 27)
                return true;
                else
                    return false;
            }else
                return false;
        }else
            return false;
           
    }
}