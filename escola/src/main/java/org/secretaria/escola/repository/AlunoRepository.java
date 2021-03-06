package org.secretaria.escola.repository;

import java.util.List;

import org.secretaria.escola.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	public List<Aluno> findAllByNomeContainingIgnoreCase (String nome);
}
