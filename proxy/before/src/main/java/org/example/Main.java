package org.example;

public class Main {
    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        ProdutoService produtoService = new ProdutoService(produtoDAO);

        produtoService.buscarProduto(1);
        produtoService.buscarProduto(2);
        produtoService.buscarProduto(3);
    }
}

class ProdutoService {
    private ProdutoDAO produtoDAO;

    public ProdutoService(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    public Object buscarProduto(long id) {
        return produtoDAO.find(id);
    }
}

class ProdutoDAO {
    public ProdutoDAO() {
        simulaTempoAlto();
        return new Object();
    }

    private void simulaTempoAlto() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class LogProdutoDAO extends ProdutoDAO {
    public Object find(long id) {
        System.out.println("Buscando produto com id" + id);
        return super.find(id);
    }
}