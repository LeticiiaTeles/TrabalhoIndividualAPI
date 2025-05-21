package org.serratec.backend.trabalhoIndividual.repository;

import org.serratec.backend.trabalhoIndividual.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
