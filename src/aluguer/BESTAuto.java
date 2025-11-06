package aluguer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import estacao.Estacao;

/**
 * Classe que representa o sistema
 */
public class BESTAuto {

    private final List<Estacao> estacoes = new ArrayList<>();
    private final List<Modelo> modelos = new ArrayList<>();
    private final List<Veiculo> veiculos = new ArrayList<>();
    private final List<Aluguer> alugueres = new ArrayList<>();

    public BESTAuto() {}

    public List<Estacao> getEstacoes() {
        return estacoes;
    }

    public void setEstacoes(List<Estacao> novas) {
        estacoes.clear();
        if (novas != null) {
            estacoes.addAll(novas);
        }
    }

    public void addEstacao(Estacao e) {
        if (e != null) estacoes.add(e);
    }

    public boolean removeEstacao(Estacao e) {
        return estacoes.remove(e);
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void addModelo(Modelo m) {
        if (m != null) modelos.add(m);
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void addVeiculo(Veiculo v) {
        if (v != null) veiculos.add(v);
    }

    public List<Aluguer> getAlugueres() {
        return alugueres;
    }

    public void addAluguer(Aluguer a) {
        if (a != null) alugueres.add(a);
    }

}
