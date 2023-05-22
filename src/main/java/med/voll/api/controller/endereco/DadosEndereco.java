package med.voll.api.controller.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
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
