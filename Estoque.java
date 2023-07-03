public class Estoque extends SQLClass{    
    @Key
    int id;
    int produto_id;
    double quantidade;

    Estoque(){
        this.setTableName("ESTOQUE");
    }

    public void printEstoque(){

        System.out.println("ID: " + id + " Produto ID de estoque: " + produto_id + " Quantidade no estoque: " + quantidade);

    }
}
