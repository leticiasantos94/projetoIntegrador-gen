package com.projetointegrador.redesocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projetointegrador.redesocial.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema,Long>{
	public List<Tema> findAllByDescricaoContainingIgnoreCase(@Param ("descricao") String descricao);
}
