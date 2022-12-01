package br.com.mateushr.filmediretor.repository;

import br.com.mateushr.filmediretor.model.FilmeModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FilmeRepository extends JpaRepository<FilmeModel, Long> {

    Optional<FilmeModel> findById(long id);

    public Page<FilmeModel> findAll(Pageable pageable);

    List<FilmeModel> findByNameContainsIgnoreCaseOrderByName(String name);

}
