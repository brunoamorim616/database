
package br.senai.sc.sistloja.modelo;

public class Cliente {
    
    private int idCliente;
    private String nomeCliente;
    private String enderecoCliente;
    private String bairroCliente;
    private String complemento;
    private int cepCliente;
    private int celularCliente;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(int cepCliente) {
        this.cepCliente = cepCliente;
    }

    public int getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(int celularCliente) {
        this.celularCliente = celularCliente;
    }
    
}
