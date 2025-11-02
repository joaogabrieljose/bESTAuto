package aluguer;

public class Veiculo {
    private String matricula;
    private Modelo modelo;
    private String estacaoAtual;
    private boolean indisponibilidades = false;
    
    public Veiculo(String matricula, Modelo modelo, String estacaoAtual, boolean indisponibilidades){
        this.matricula = matricula;
        this.modelo = modelo;
        this.estacaoAtual = estacaoAtual;
        this.indisponibilidades = indisponibilidades;
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

    public boolean isIndisponibilidades() {
        return indisponibilidades;
    }

    public void setIndisponibilidades(boolean indisponibilidades) {
        this.indisponibilidades = indisponibilidades;
    }

}
