public class Produto extends SQLClass{            
    @Key

    int id;
    String descricao;
    double preco;    
    String um;

    Produto(){
        this.setTableName("PRODUTOS");
    }   
        
    public void printProduto(){

        System.out.println("ID: " + id + " Descrição: " + descricao + " Preço: " + preco + " Unidade de Medida: " + um);

    }
}
