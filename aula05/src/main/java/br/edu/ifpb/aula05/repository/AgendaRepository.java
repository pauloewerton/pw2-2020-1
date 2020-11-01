package br.edu.ifpb.aula05.repository;

import br.edu.ifpb.aula05.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
}
