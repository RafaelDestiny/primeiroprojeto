package med.voll.api.controller.endereco;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor



public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco medicos) {

        this.logradouro = medicos.logradouro();
        this.bairro = medicos.bairro();
        this.cep = medicos.cep();
        this.uf = medicos.uf();
        this.cidade = medicos.cidade();
        this.numero = medicos.numero();
        this.complemento = medicos.complemento();


    }

    public void atualizarInformacoes(DadosEndereco medicos) {


        if (medicos.logradouro() != null) {
            this.logradouro = medicos.logradouro();

        }

        if (medicos.bairro() != null) {
            this.bairro = medicos.bairro();
        }
        if (medicos.cep() != null) {
            this.cep = medicos.cep();
        }
        if (medicos.uf() != null) {
            this.uf = medicos.uf();
        }
        if (medicos.cidade() != null) {
            this.cidade = medicos.cidade();
        }
        if (medicos.numero() != null) {
            this.numero = medicos.numero();
        }
        if (medicos.complemento() != null) {
            this.complemento = medicos.complemento();
        }

    }


    public void atualizarInformacoes(DadosAtualizacaoEndereco dados) {

        if (dados.logradouro() != null) {
            this.logradouro = dados.logradouro();

        }

        if (dados.bairro() != null) {
            this.bairro = dados.bairro();
        }
        if (dados.cep() != null) {
            this.cep = dados.bairro();
        }

        if (dados.bairro() != null) {
            this.bairro = dados.bairro();
        }

        if (dados.uf() != null) {
            this.uf = dados.bairro();
        }

        if (dados.cidade() != null) {
            this.cidade = dados.bairro();
        }

        if (dados.numero() != null) {
            this.numero = dados.bairro();
        }

        if (dados.complemento() != null) {
            this.complemento = dados.bairro();
        }
    }
}
















