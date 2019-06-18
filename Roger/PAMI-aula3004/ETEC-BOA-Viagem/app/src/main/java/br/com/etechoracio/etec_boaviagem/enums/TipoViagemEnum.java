package br.com.etechoracio.etec_boaviagem.enums;

import java.util.Date;

public enum TipoViagemEnum {
    LAZER,
    NEGOCIOS;

public class Viagem;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String destino;
    private TipoViagemEnum tipoViagem;
    private Date dataChegada;
    private Date dataSaida;
    private Double orcamento;
    private Integer quantidadePessoas;
}
