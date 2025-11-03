package aluguer;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    private String matricula;
    private Modelo modelo;
    private String estacaoAtual;
    private boolean indisponibilidades = false;
    private List<Aluguer> aluguers;
    
    public Veiculo(String matricula, Modelo modelo, String estacaoAtual, boolean indisponibilidades){
        this.matricula = matricula;
        this.modelo = modelo;
        this.estacaoAtual = estacaoAtual;
        this.indisponibilidades = indisponibilidades;
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
     public boolean isIndisponibilidades() {
        return indisponibilidades;
    }

    public void setIndisponibilidades(boolean indisponibilidades) {
        this.indisponibilidades = indisponibilidades;
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
    
    
     //TUDO
    public void consultaVeiculo(){

    }
    //TUDO
    public void moveViatuaraEntreEstacao(){

    }

    //TUDO
    public void atualizaEstado(){

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
        return estacaoAtual;
    }

    public void setEstacaoAtual(String estacaoAtual) {
        this.estacaoAtual = estacaoAtual;
    }

   
 

}
