package med.voll.api.controller.paciente;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.controller.endereco.Endereco;

@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Paciente")
@Table(name = "pacientes")

public class Paciente {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   private Long id;

   private String nome;

   private String telefone;

   private String email;

   private String cpf;

   @Embedded
   private Endereco endereco;

   public Paciente(CadastroPaciente paciente) {
      this.nome = paciente.nome();
      this.email = paciente.email();
      this.telefone = paciente.telefone();
      this.cpf = paciente.cpf();
      this.endereco = new Endereco(paciente.endereco());


   }

   public void atualizarInformacoes(DadosAtualizacaoPaciente dados) {
      if (dados.nome() != null) {
         this.nome = dados.nome();
      }


      if (dados.telefone() != null) {
         this.telefone = dados.telefone();
      }
      if (dados.email() != null) {
         this.email = dados.email();
      }

      if (dados.cpf() != null) {
         this.cpf = dados.cpf();
      }

       if (dados.endereco() != null) {
         endereco.atualizarInformacoes(dados.endereco());
      }



   }
}









