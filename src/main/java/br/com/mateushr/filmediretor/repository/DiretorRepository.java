package br.com.mateushr.filmediretor.repository;

import br.com.mateushr.filmediretor.model.DiretorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DiretorRepository extends JpaRepository<DiretorModel, Long> {

    Optional<DiretorModel> findById(long id);
}
