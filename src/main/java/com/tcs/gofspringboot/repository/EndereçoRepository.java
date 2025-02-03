package com.tcs.gofspringboot.repository;

import com.tcs.gofspringboot.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndereçoRepository extends JpaRepository<Endereco, String> {
}
