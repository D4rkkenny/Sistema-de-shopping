public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    
    public Loja(String nome, int quantidadeFuncionario, double salarioBaseFuncionario,Endereco endereco, Data dataFundacao,int x){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[x];
    }

    public Loja(String nome, int quantidadeFuncionarios,Endereco endereco, Data dataFundacao,int x) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[x];
    }

    //Getter

    public String getNome(){
        return nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public Data getDataFundacao(){
        return dataFundacao;
    }
    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }
    //Setter

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    
    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }
    
    // Método toString

    public String toString() {
        return "Loja:" + nome + ",\n Quantidade de Funcionários:" + quantidadeFuncionarios + "\n Salário Base dos Funcionário:" + salarioBaseFuncionario+
        endereco.toString()+"\n Data Fundacão: "+dataFundacao.toString()+"\n Produtos: "+estoqueProdutos;
    }

    // Método gastosComSalario
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
    }

    // Método tamanhoDaLoja
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }
    
    //metodo para imprimir os produtos
    public void imprimeProdutos(){
        for(int i = 0; i < estoqueProdutos.length;i++)
            System.out.println(estoqueProdutos[i]);
    }
    
    //metodo para inserir Produtos
    public boolean insereProduto(Produto produto){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] == null){
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }
    
    //metodo para remover Produtos
    public boolean removeProduto(String nomeProduto) {
        boolean produtoRemovido = false;
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                produtoRemovido = true;
                break;
            }
        }
        return produtoRemovido;
    }
}