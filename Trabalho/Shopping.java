
/**
 * Escreva uma descrição da classe Shopping aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Shopping{
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    
    public Shopping(String nome,Endereco endereco,int x){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[x];
    }
    
    //getters
    public String getNome(){
        return nome;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public Loja[] getLojas(){
        return lojas;
    }
    
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    //metodo toString
    public String toString(){
        return "Nome do Shopping: "+nome+ "\n Endereço do Shopping: "+endereco+
        "\n Lojas: "+lojas;
    }
    
    //metodo para inserir lojas
    public boolean insereLoja(Loja loja){
        for(int i = 0; i < lojas.length; i++)
            if(lojas[i] == null){
                lojas[i] = loja;
                return true;
            }
        return false;
    }
    
    //metodo para remover as lojas
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;

                return true; 
            }
            if (lojas[lojas.length - 1] == null)
                return false;
        }

        return false;
    }

    
    //metodo para informar as quantidades diferentes de lojas
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int quantidade = 0;

        for (Loja loja : lojas) {
            if (loja instanceof Cosmetico && tipoLoja.equals("Cosmético")) {
                quantidade++;
            } else if (loja instanceof Vestuario && tipoLoja.equals("Vestuário")) {
                quantidade++;
            } else if (loja instanceof Bijuteria && tipoLoja.equals("Bijuteria")) {
                quantidade++;
            } else if (loja instanceof Alimentacao && tipoLoja.equals("Alimentação")) {
                quantidade++;
            } else if (loja instanceof Informatica && tipoLoja.equals("Informática")) {
                quantidade++;
            }
        }

        if (quantidade == 0) {
            return -1; // Retorna -1 se não houver lojas do tipo desejado
        }

        return quantidade;
    }

    
    public Informatica lojaSeguroMaisCaro() {
        Informatica seguroCaro = null;
        double menorQue = 0;
    
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i] instanceof Informatica) {
                double seguroEletronicos = ((Informatica) lojas[i]).getSeguroEletronicos();
            
                if (seguroEletronicos > menorQue) {
                    menorQue = seguroEletronicos;
                    seguroCaro = (Informatica) lojas[i];
                }
            }
        }
    
        return seguroCaro;
    }


}
