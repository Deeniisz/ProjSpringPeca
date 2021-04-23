package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Peca;
import br.com.service.PecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class PecaController {

    @Autowired
    private PecaService pecaService;

    @PostMapping(Constant.API_PECA)
    public void save(@RequestBody Peca peca){
        pecaService.save(peca);
    }

    @GetMapping(Constant.API_PECA)
    public List<Peca> findAll(){
        return pecaService.findAll();
    }

    @PutMapping(Constant.API_PECA)
    public void update (@RequestBody Peca peca){
        pecaService.save(peca);
    }

    @DeleteMapping(Constant.API_PECA + "/{id}")
    public void delete(@PathVariable("id") String id){
        pecaService.delete(id);
    }

    @GetMapping(Constant.API_PECA + "/{id}")
    public Optional<Peca> findById(@PathVariable("id") String id){
        return pecaService.findById(id);
    }
}
