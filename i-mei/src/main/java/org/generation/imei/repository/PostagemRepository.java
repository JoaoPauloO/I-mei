package org.generation.imei.repository;

import java.util.List;

import org.generation.imei.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List<Postagem> findAllbyTituloContainingIgnoreCase(String titulo);

}
