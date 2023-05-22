package med.voll.api.controller.endereco;

import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacaoEndereco(

                                       @NotBlank
                                       String logradouro,
                                       @NotBlank
                                       String bairro,
                                       @NotBlank
                                       String cep,

                                       @NotBlank
                                       String cidade,

                                       @NotBlank
                                       String uf,


                                       String complemento,



                                       String numero) {

}
