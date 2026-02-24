package com.pbe.brinquedos.repository;

import com.pbe.brinquedos.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
