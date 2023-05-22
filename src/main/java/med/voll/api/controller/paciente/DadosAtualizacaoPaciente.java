package med.voll.api.controller.paciente;

import jakarta.validation.Valid;
import med.voll.api.controller.endereco.DadosAtualizacaoEndereco;

public record DadosAtualizacaoPaciente(

                                         Long id,
                                         String nome,
                                         String telefone,

                                         String email,
                                         String cpf,
                                         @Valid
                                         DadosAtualizacaoEndereco endereco) {
}
