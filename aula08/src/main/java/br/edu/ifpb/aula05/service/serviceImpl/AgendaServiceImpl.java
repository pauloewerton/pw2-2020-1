package br.edu.ifpb.aula05.service.serviceImpl;

import br.edu.ifpb.aula05.model.Agenda;
import br.edu.ifpb.aula05.repository.AgendaRepository;
import br.edu.ifpb.aula05.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaServiceImpl implements AgendaService {

    @Autowired
    AgendaRepository repository;

    @Override
    public List<Agenda> findAll() {
        return repository.findAll();
    }

    @Override
    public Agenda findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Agenda save(Agenda agenda) {
        return repository.save(agenda);
    }
}
