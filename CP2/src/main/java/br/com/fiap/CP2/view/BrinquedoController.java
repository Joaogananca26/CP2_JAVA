package br.com.fiap.CP2.view;

import br.com.fiap.CP2.dao.BrinquedoDAO;

import br.com.fiap.CP2.dto.BrinquedoDTO;
import br.com.fiap.CP2.model.Brinquedo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoDAO dao;

    @GetMapping()
    public Brinquedo buscar(@RequestParam int id){
        Brinquedo brinquedo = new Brinquedo();
        try {
          brinquedo = dao.buscar(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return brinquedo;
    }

    @PostMapping()
    public Brinquedo salvar(@RequestBody BrinquedoDTO brinquedoDTO){
        Brinquedo brinquedo = new Brinquedo();

       brinquedo.setNome(brinquedoDTO.getNome());
       brinquedo.setPreco(brinquedoDTO.getPreco());
       brinquedo.setTamanho(brinquedoDTO.getTamanho());
       brinquedo.setTipo(brinquedoDTO.getTipo());
       brinquedo.setClassificacao(brinquedoDTO.getClassificacao());
        try{
            dao.salvar(brinquedo);
            dao.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return brinquedo;
    }
    @PutMapping()
    public Brinquedo atualizar(@RequestParam int id,@RequestBody BrinquedoDTO brinquedoDTO){
        Brinquedo brinquedo = new Brinquedo();
        brinquedo.setNome(brinquedoDTO.getNome());
        brinquedo.setPreco(brinquedoDTO.getPreco());
        brinquedo.setTamanho(brinquedoDTO.getTamanho());
        brinquedo.setTipo(brinquedoDTO.getTipo());
        brinquedo.setClassificacao(brinquedoDTO.getClassificacao());
        dao.atualizar(id,brinquedo);
        return brinquedo;
    }

}
