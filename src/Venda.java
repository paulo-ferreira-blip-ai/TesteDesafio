public class Venda {
    private String vendedor;
    private String cliente;
    private String produto;
    private double valorProduto;
    private String dataDeRegistro;

    @Override
    public String toString() {
        return "Venda{" +
                "vendedor: " + this.vendedor +
                ", cliente: " + this.cliente +
                ", produto: " + this.produto +
                ", valorProduto: " + valorProduto +
                ", dataDeRegistro: '" + dataDeRegistro + '\'' +
                '}';
    }

    public Venda() {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.produto = produto;
        this.valorProduto = valorProduto;
        this.dataDeRegistro = dataDeRegistro;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }
}
