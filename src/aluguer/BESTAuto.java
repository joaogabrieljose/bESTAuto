package aluguer;

import java.util.ArrayList;
import java.util.List;

import estacao.Estacao;

/**
 * Classe que representa o sistema
 */
public class BESTAuto {

    private final List<Estacao> estacaes = new ArrayList<>();
    private final List<Modelo> modelos = new ArrayList<>();
    private final List<Veiculo> veiculos = new ArrayList<>();
    private final List<Aluguer> alugueres = new ArrayList<>();

    public BESTAuto(){}


    

    public List<Estacao> getEstacaes() {
        return estacaes;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public List<Aluguer> getAlugueres() {
        return alugueres;
    }

    


}
