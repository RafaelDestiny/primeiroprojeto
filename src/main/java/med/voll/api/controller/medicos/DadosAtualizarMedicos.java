package med.voll.api.controller.medicos;

import jakarta.validation.constraints.NotNull;
import med.voll.api.controller.endereco.DadosEndereco;

public record DadosAtualizarMedicos


                                     (

                                             @NotNull
                                             Long id,

                                             String nome,

                                             String telefone,



                                             DadosEndereco endereco) {

}
