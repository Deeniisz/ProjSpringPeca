package br.com.service;

import br.com.model.Peca;
import br.com.repository.PecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PecaService {

    @Autowired
    private PecaRepository pecaRepository;

    public void save(Peca peca){
        pecaRepository.save(peca);
    }

    public List<Peca> findAll (){
        return pecaRepository.findAll();
    }

    public Optional<Peca> findById(String id){
        return pecaRepository.findById(id);
    }

    public void delete(String id){
        pecaRepository.deleteById(id);
    }
}
