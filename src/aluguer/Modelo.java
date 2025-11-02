package aluguer;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private String marca;
    private String descricao;
    private Categoria categoria;
    private int lotacao;
    private int capacidadeBagagem;
    private double precoDiario;
    private List<Veiculo> veiculos;

    public Modelo(String marca, String descricao, Categoria categoria, int lotacao, int capacidadeBagagem, double precoDiario){
        this.marca = marca;
        this.descricao = descricao;
        this.categoria = categoria;
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.precoDiario = precoDiario;
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo v){
        if (!veiculos.contains(v)) {
            veiculos.add(v);
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public int getCapacidadeBagagem() {
        return capacidadeBagagem;
    }

    public void setCapacidadeBagagem(int capacidadeBagagem) {
        this.capacidadeBagagem = capacidadeBagagem;
    }

    public double getPrecoDiario() {
        return precoDiario;
    }

    public void setPrecoDiario(double precoDiario) {
        this.precoDiario = precoDiario;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    
    
}
