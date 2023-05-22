package med.voll.api.controller.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.controller.endereco.Endereco;

public record DadosListagemPacientes(
        @NotNull
        Long id,

        String nome,
        String email,
        String telefone,
        String cpf,
        @Valid
        Endereco endereco) {

    public DadosListagemPacientes(Paciente paciente){

        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(),paciente.getCpf(),paciente.getEndereco());




    }



}
