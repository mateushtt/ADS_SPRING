package br.com.mateushr.filmediretor.controller;

import br.com.mateushr.filmediretor.model.DiretorModel;
import br.com.mateushr.filmediretor.service.DiretorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/diretores")
public class DiretorController {

    @Autowired
    private DiretorService service;

    @GetMapping()
    public List<DiretorModel> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public DiretorModel findById(@PathVariable("id") long id){
        var diretorModel = service.findById(id);
        if(diretorModel.isPresent()){
            return diretorModel.get();
        }else{
            return null;
        }
    }

}
