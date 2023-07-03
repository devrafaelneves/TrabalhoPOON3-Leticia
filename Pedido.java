public class Pedido extends SQLClass{
    Pedido(){
        this.setTableName("PEDIDOS");
    };

    int id;
    int produto_id;
    double quantidade;
    double valor;
    
    public void printPedido(){

        System.out.println("ID: " + id + " Produto ID de pedido: " + produto_id + " Quantidade no pedido: " + quantidade);

    }
}
