package aluguer;

import cliente.Cliente;

public class Aluguer {
    private String reserva;
    private Veiculo veiculo;
    private Cliente cliente;
    private Integer inicio;
    private Integer fim;
    private double precoTotal;
    private int codigo;

    public Aluguer(String reserva, Veiculo veiculo, Cliente cliente, Integer inicio, Integer fim, double precoTotal, int codigo){
        this.reserva = reserva;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.inicio = inicio;
        this.fim = fim;
        this.precoTotal = precoTotal;
        this.codigo = codigo;

        if (veiculo != null) {
            veiculo.adicionarAluguer(this);
        }
    }
   

    public String getReserva() {
        return reserva;
    }

    public void setReserva(String reserva) {
        this.reserva = reserva;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Integer getInicio() {
        return inicio;
    }

    public void setInicio(Integer inicio) {
        this.inicio = inicio;
    }

    public Integer getFim() {
        return fim;
    }

    public void setFim(Integer fim) {
        this.fim = fim;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
