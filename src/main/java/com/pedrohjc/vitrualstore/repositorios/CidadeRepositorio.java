package com.pedrohjc.vitrualstore.repositorios;

import com.pedrohjc.vitrualstore.modelos.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepositorio extends JpaRepository<Cidade, Long> {

}
