package com.pedrohjc.vitrualstore.repositorios;

import com.pedrohjc.vitrualstore.modelos.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;



public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long> {

}
