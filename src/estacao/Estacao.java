package estacao;

import java.util.ArrayList;
import java.util.List;

import aluguer.Veiculo;

public class Estacao {
    private String codigo;
    private String localizacao;
    private int capacidade;
    private List<Veiculo> veiculos;
    private boolean ativo = false ;
    private TipoEstacao tipo;

    public Estacao(String codigo, String localizacao, int capacidade, boolean ativo, TipoEstacao tipo){
        this.codigo = codigo;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
        this.ativo = ativo;
        this.veiculos = new ArrayList<>();
        this.tipo = tipo;
    }

    public Veiculo viaturaCentralDisponivel(){
        if (this.tipo != TipoEstacao.CENTRAL) {
            throw new IllegalArgumentException("esta estação não é a central...");
        }
        for(Veiculo v: veiculos){

            if (!v.isIndisponibilidades()) {
                v.setIndisponibilidades(true);
                return v;
            }
        }
        throw new IllegalArgumentException("nenhuma viatura disponivel na central...");
    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public TipoEstacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoEstacao tipo) {
        this.tipo = tipo;
    }

    
    
}
