package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.controller.medicos.*;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
@Autowired
private MedicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastro (@RequestBody @Valid CadastroMedicos medicos){

        repository.save(new Medico(medicos));
    }

    @GetMapping
    public Page<DadosListagemMedicos> Listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){

        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedicos::new);
    }
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarMedicos medicos){

        var medico = repository.getReferenceById(medicos.id());
        medico.atualizarInformacoes(medicos);



    }

    @DeleteMapping("/{id}")
    @Transactional

    public void excluir(@PathVariable Long id){

        var medico = repository.getReferenceById(id);
        medico.excluir();
    }

}
