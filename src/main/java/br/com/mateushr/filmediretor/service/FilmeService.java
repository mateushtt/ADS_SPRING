package br.com.mateushr.filmediretor.service;

import br.com.mateushr.filmediretor.model.FilmeModel;
import br.com.mateushr.filmediretor.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;

    public Optional<FilmeModel> findById(long id){

        return repository.findById(id);
    }

    public Page<FilmeModel> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }
    public List<FilmeModel> findAll(){
        return repository.findAll();
    }

    public FilmeModel save(FilmeModel model){

        return repository.save(model);
    }

    public FilmeModel update(FilmeModel model){
        var found = repository.findById(model.getId());
        if(found.isPresent()){
            found.get().setName(model.getName());
            found.get().setGender(model.getGender());
            found.get().setDiretor(model.getDiretor());
            return repository.save(found.get());
        }else{
            return null;
        }
    }

    public void delete(long id){
        var found = repository.findById(id);
        if(found.isPresent()){
            repository.delete(found.get());
        }
    }
}
