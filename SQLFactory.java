public class SQLFactory{
    public static void main(String[] args){
    
//-------------SISTEMA DA TABELA PRODUTOS
        Produto produto1 = new Produto();

        produto1.id = 1;
        produto1.descricao = "jeans";
        produto1.um = "kg";
        produto1.preco = 25.50;
        
        boolean prod1 = Database.inserirRegistro(produto1);
        System.out.println(prod1);
        produto1.printProduto();

        produto1.id = 2;
        produto1.descricao = "T-shirt";
        produto1.um = "m";
        produto1.preco = 50;

        boolean prod2 = Database.inserirRegistro(produto1);
        System.out.println(prod2);
        produto1.printProduto();

        produto1.id = 2;
        produto1.um = "cm";

        boolean update1 = Database.atualizarRegistro(produto1);
        System.out.println(update1);
        produto1.printProduto();

        produto1.id = 1;

        boolean delete1 = Database.deletarRegistro(produto1);
        System.out.println(delete1);
        produto1.printProduto();


//-------------SISTEMA DA TABELA ESTOQUE
        Estoque estoque1 = new Estoque();

        estoque1.id = 1;
        estoque1.produto_id = 2;
        estoque1.quantidade = 1;

        boolean estoq1 = Database.inserirRegistro(estoque1);
        System.out.println(estoq1);
        estoque1.printEstoque();


//-------------SISTEMA DA TABELA PEDIDOS
        Pedido pedido1 = new Pedido();

        pedido1.id = 1;
        pedido1.produto_id = 2;
        pedido1.quantidade = 2;
        pedido1.valor = 100;

        boolean ped1 = Database.inserirRegistro(pedido1);
        System.out.println(ped1);
        pedido1.printPedido();

//-------------Caso quiser excluir as tabelas para fazer o processo anterior é só descomentar ou excluir a coluna no banco manualmente:
// Produto produto1 = new Produto();
// produto1.id = 2;
// boolean delete2 = Database.deletarRegistro(produto1);


// Estoque estoque1 = new Estoque();
// estoque1.id = 1;
// boolean delete3 = Database.deletarRegistro(estoque1);


// Pedido pedido1 = new Pedido();
// pedido1.id = 1;
// boolean delete4 = Database.deletarRegistro(pedido1);

        
        // System.out.println("-------SELECT-------");
        // System.out.println(produto1.selectSQL());

        // System.out.println("-------INSERT-------");
        // System.out.println(produto1.insertSQL());

        // System.out.println("-------UPDATE-------");
        // System.out.println(produto1.updateSQL());

        // System.out.println("-------DELETE-------");
        // System.out.println(produto1.deleteSQL());
    
    }
}