package aluguer;

import java.util.ArrayList;
import java.util.List;

import pds.tempo.IntervaloTempo;

public class Veiculo {

    private String matricula;
    private Modelo modelo;
    private String estacao;
    private List<IntervaloTempo> indisponibilidades = new ArrayList<>();
    private List<Aluguer> aluguers;
    
    public Veiculo(String matricula, Modelo modelo, String estacao){
        this.matricula = matricula;
        this.modelo = modelo;
        this.estacao = estacao;
        this.indisponibilidades = new ArrayList<>();
        this.aluguers = new ArrayList<>();

        if (modelo != null) {
            modelo.adicionarVeiculo(this);
        }
    }

    public void adicionarAluguer(Aluguer aluguer){
        if (!aluguers.contains(aluguer)) {
            aluguers.add(aluguer);
        }
    }
    
    public List<Aluguer> getAluguers() {
        return aluguers;
    }

    public void consultaAluguer(Veiculo veiculo){
        if (veiculo == null || veiculo.getAluguers() == null || veiculo.getAluguers().isEmpty()) {
            System.out.println("Nenhum aluguer encontrado para este veículo");  
            return;  
        }

        for(Aluguer a : veiculo.getAluguers()){
           System.out.println("Reserva "+  a.getReserva());
        }
    }

    
    public List<IntervaloTempo> getIndisponibilidades() {
        return indisponibilidades;
    }

    public void setIndisponibilidades(List<IntervaloTempo> indisponibilidades) {
        this.indisponibilidades = indisponibilidades;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getEstacaoAtual() {
        return estacao;
    }

    public void setEstacaoAtual(String estacaoAtual) {
        this.estacao = estacaoAtual;
    }

   
 

}
