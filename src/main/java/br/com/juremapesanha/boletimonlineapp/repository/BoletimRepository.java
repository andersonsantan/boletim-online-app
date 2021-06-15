package br.com.juremapesanha.boletimonlineapp.repository;

import br.com.juremapesanha.boletimonlineapp.model.Boletim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletimRepository extends JpaRepository<Boletim, Long> {
    Boletim findByMatricula(Long matricula);
    boolean existsByMatricula(Long matricula);

}
