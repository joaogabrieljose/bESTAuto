package estacao;

import java.util.ArrayList;
import java.util.List;

import aluguer.Veiculo;
import pds.tempo.HorarioSemanal;

public class Estacao {
      private String id;
    private String localizacao;
    private int capacidade;
    private List<Veiculo> veiculos;
    private boolean ativo = false;
    private TipoEstacao tipo;
    private HorarioSemanal horarioSemanal;

   
    public Estacao(String id, String localizacao, int capacidade, boolean ativo, TipoEstacao tipo){
        this.id = id;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
        this.ativo = ativo;
        this.veiculos = new ArrayList<>();
        this.tipo = tipo;
        // CORREÇÃO: chamar o método estático na classe HorarioSemanal
        this.horarioSemanal = HorarioSemanal.sempreFechado();
    }

    public Veiculo viaturaCentralDisponivel() {
        if (this.tipo != TipoEstacao.CENTRAL) {
            throw new IllegalArgumentException("Esta estação não é a central.");
        }

        for (Veiculo v : veiculos) {
            if (v.getIndisponibilidades().isEmpty()) {
                return v;
            }
        }
        throw new IllegalArgumentException("Nenhuma viatura disponível na central.");
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public HorarioSemanal getHorarioSemanal() {
        return horarioSemanal;
    }

    public void setHorarioSemanal(HorarioSemanal horarioSemanal) {
        this.horarioSemanal = horarioSemanal;
    }

    
    
    
}
