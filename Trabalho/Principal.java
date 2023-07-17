class Principal{
    public static void main(String[] args){
        int opcao = 3;
        while (opcao != 3){
            System.out.println("(1)Criar uma Loja");
            System.out.println("(2)Criar um Produto");
            System.out.println("(3)Sair.");
            opcao = Teclado.leInt("Informe a opção desejada");
            if(opcao == 1){
                Endereco endereco = new Endereco(Teclado.leString("Informe o nome da rua da loja: "),
                                    Teclado.leString("Informe a cidade da loja: "),
                                    Teclado.leString("Informe o estado onde a loja se encontra: "),
                                    Teclado.leString("Informe o pais da loja: "),
                                    Teclado.leString("Informe o CEP da loja: "),
                                    Teclado.leString("Informe o numero da loja: "),
                                    Teclado.leString("Informe o complemento da loja: "));
                                    
                Data data = new Data(Teclado.leInt("Informe o dia que a loja foi fundada: "),
                                    Teclado.leInt("Informe o mes que a loja foi fundada: "),
                                    Teclado.leInt("Informe o ano que a loja foi fundada: "));
                                    
                Loja loja = new Loja(Teclado.leString("Informe o nome da loja: "),
                                    Teclado.leInt("Informe a quantidade de funcionarios: "),
                                    Teclado.leDouble("Informe o Salario dos funcionarios: "),
                                    endereco,data,Teclado.leInt("informe a Quantidade de produtos: "));
                        
            }else if (opcao == 2){
                Data data2 = new Data(Teclado.leInt("Informe o dia que o produto vence: "),
                                                       Teclado.leInt("Informe o mes que o produto vence: "),
                                                       Teclado.leInt("Informe o ano que o produto vence: "));
                                                       
                Produto produto = new Produto(Teclado.leString("Informe o nome do produto: "),
                                              Teclado.leDouble("Infomre o preço do produto: "),
                                              data2);
                
                if (produto.estaVencido(data2))
                    System.out.println("Produto Vencido!");
                else
                    System.out.println("Produto não vencido!");
            }else
                break;
        }
    }
}