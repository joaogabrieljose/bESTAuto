package cliente;

public class Cliente {
    private String nome;
    private String nif;
    private String contacto;
    private String historiaAluguer;

    public Cliente (String nome, String nif, String contacto, String historiaAluguer){
        this.nome = nome;
        this.nif = nif;
        this.contacto = contacto;
        this.historiaAluguer = historiaAluguer;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getHistoriaAluguer() {
        return historiaAluguer;
    }

    public void setHistoriaAluguer(String historiaAluguer) {
        this.historiaAluguer = historiaAluguer;
    }
    
}
