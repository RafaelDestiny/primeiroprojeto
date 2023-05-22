package med.voll.api.controller.medicos;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.controller.endereco.Endereco;




@Table(name = "medicos")
@Entity(name = "Medico")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")


    public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nome;
    private String email;
    private String crm;

    private String telefone;

    private Boolean ativo;


    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;


    @Embedded
    private Endereco endereco;

    public Medico(CadastroMedicos medicos) {
        this.ativo = true;

        this.nome = medicos.nome();
        this.email = medicos.email();
        this.crm = medicos.crm();
        this.telefone = medicos.telefone();
        this.especialidade = medicos.especialidade();
        this.endereco = new Endereco(medicos.endereco());
    }




    public void atualizarInformacoes(DadosAtualizarMedicos medicos) {

        if (medicos.nome() != null) {
            this.nome = medicos.nome();
        }
        if (medicos.telefone() != null) {
            this.telefone = medicos.telefone();
        }
        if (medicos.endereco() != null) {
            this.endereco.atualizarInformacoes(medicos.endereco());
        }


    }

    public void excluir() {
        this.ativo = false;
    }
}
