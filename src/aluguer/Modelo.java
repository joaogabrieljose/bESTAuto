package aluguer;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private String id;
    private String modelo;
    private Categoria categoria;
    private String marca;
    private int lotacao;
    private int bagagem;
    private double preco;
    private List<Veiculo> veiculos;

    public Modelo(String id, String modelo, Categoria categoria, String marca, int lotacao, int bagagem, double preco){
      this.id = id;
      this.modelo = modelo;
      this.categoria = categoria;
      this.marca = marca;
      this.lotacao = lotacao;
      this.bagagem = bagagem;
      this.preco = preco;
      this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo v){
        if (!veiculos.contains(v)) {
            veiculos.add(v);
        }
    }

       public List<Veiculo> getVeiculos() {
        return veiculos;
    }

       public String getId() {
           return id;
       }

       public void setId(String id) {
           this.id = id;
       }

       public String getModelo() {
           return modelo;
       }

       public void setModelo(String modelo) {
           this.modelo = modelo;
       }

       public Categoria getCategoria() {
           return categoria;
       }

       public void setCategoria(Categoria categoria) {
           this.categoria = categoria;
       }

       public String getMarca() {
           return marca;
       }

       public void setMarca(String marca) {
           this.marca = marca;
       }

       public int getLotacao() {
           return lotacao;
       }

       public void setLotacao(int lotacao) {
           this.lotacao = lotacao;
       }

       public int getBagagem() {
           return bagagem;
       }

       public void setBagagem(int bagagem) {
           this.bagagem = bagagem;
       }

       public double getPreco() {
           return preco;
       }

       public void setPreco(double preco) {
           this.preco = preco;
       }

       public void setVeiculos(List<Veiculo> veiculos) {
           this.veiculos = veiculos;
       }

   
 
    
}
