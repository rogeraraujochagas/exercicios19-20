package br.com.etechoracio.etec_boaviagem;

public enum  TipoGastoEnum {
    ALIMENTACAO("Alimentação"),
    COMBUSTIVEL("Combustivel"),
    TRANSPORTE("Transporte"),
    HOSPEDAGEM("Hospedagem"),
    OUTROS("Outros");

    private String descricao;

    public String toString(){
        return descricao;
    }

    TipoGastoEnum(String descricao) {
        this.descricao = descricao;
    }
}
