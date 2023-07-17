
/**
 * Escreva uma descrição da classe Data aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Data{
    private int dia;
    private int mes;
    private int ano;
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        //checar meses com 31 dias
        if (mes == 1 && mes == 3 && mes == 5 && mes == 7 && mes == 8 && mes == 10 && mes == 12){
            if(dia > 31 && dia <= 0)
                System.out.println("Data Invalida! A data foi atribuida para o valor padrão de 01/01/2000");
                dia = 01;
                mes = 01;
                ano = 2000;
            
        }else if(mes == 2){
            if (ano % 4 == 0){
                if (dia > 29 && dia <=0){
                    System.out.println("Data Invalida! A data foi atribuida para o valor padrão de 01/01/2000");
                    dia = 01;
                    mes = 01;
                    ano = 2000;
                }
            }
            //checar meses com 30 dias
        }else if(mes == 4 && mes == 6 && mes == 9 && mes == 11){
            if (dia > 30 && dia <= 0){
                System.out.println("Data Invalida! A data foi atribuida para o valor padrão de 01/01/2000");
                dia = 01;
                mes = 01;
                ano = 2000;
            }
        }     
    }
    //getters
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    //setters
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    //metodo toString
    public String toString(){
        return (+dia+"/"+mes+"/"+ano);
    }
    public boolean verificaAnoBissexto(){
        if (ano % 4 == 0)
            return true;
        else
            return false;
    }
}
