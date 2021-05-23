package br.edu.ifpb.aula05.service;

import br.edu.ifpb.aula05.model.Agenda;

import java.util.List;

public interface AgendaService {
    List<Agenda> findAll();
    Agenda findById(Long id);
    Agenda save(Agenda agenda);
}
