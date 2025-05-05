package br.com.fiap.CP2.view;

import br.com.fiap.CP2.dao.BrinquedoDAO;
import br.com.fiap.CP2.dto.BrinquedoDTO;
import br.com.fiap.CP2.model.Brinquedo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/brinquedos")
@Validated  // habilita validação de @RequestParam/@PathVariable
public class BrinquedoController {

    @Autowired
    private BrinquedoDAO dao;

    @GetMapping("/buscar-por-id")
    public Brinquedo buscar(
            @RequestParam @Min(value = 1, message = "O id deve ser ≥ 1") int id
    ){
        return dao.buscar(id);
    }

    @GetMapping
    public List<Brinquedo> buscarTodos() {
        return dao.buscarTodos();
    }

    @PostMapping
    public Brinquedo salvar(
            @Valid @RequestBody BrinquedoDTO brinquedoDTO
    ){
        Brinquedo brinquedo = new Brinquedo();
        brinquedo.setNome(brinquedoDTO.getNome());
        brinquedo.setPreco(brinquedoDTO.getPreco());
        brinquedo.setTamanho(brinquedoDTO.getTamanho());
        brinquedo.setTipo(brinquedoDTO.getTipo());
        brinquedo.setClassificacao(brinquedoDTO.getClassificacao());

        dao.salvar(brinquedo);
        dao.commit();
        return brinquedo;
    }

    @PutMapping
    public Brinquedo atualizar(
            @RequestParam @Min(value = 1, message = "O id deve ser ≥ 1") int id,
            @Valid @RequestBody BrinquedoDTO brinquedoDTO
    ){
        Brinquedo brinquedo = new Brinquedo();
        brinquedo.setNome(brinquedoDTO.getNome());
        brinquedo.setPreco(brinquedoDTO.getPreco());
        brinquedo.setTamanho(brinquedoDTO.getTamanho());
        brinquedo.setTipo(brinquedoDTO.getTipo());
        brinquedo.setClassificacao(brinquedoDTO.getClassificacao());

        dao.atualizar(id, brinquedo);
        return brinquedo;
    }
}
