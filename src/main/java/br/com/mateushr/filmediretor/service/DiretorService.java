package br.com.mateushr.filmediretor.service;

import br.com.mateushr.filmediretor.model.DiretorModel;
import br.com.mateushr.filmediretor.repository.DiretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiretorService {

    @Autowired
    private DiretorRepository repository;

    public List<DiretorModel> findAll(){
        return repository.findAll();
    }

    public Optional<DiretorModel> findById(long id){
        return repository.findById(id);
    }
}
