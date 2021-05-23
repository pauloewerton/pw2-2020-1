package br.edu.ifpb.aula05.utils;

import br.edu.ifpb.aula05.model.Agenda;
import br.edu.ifpb.aula05.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DummyData {

    @Autowired
    AgendaRepository repository;

    //@PostConstruct
    public void saveContacts() {
        Agenda a1 = new Agenda();
        a1.setNome("Paulo");
        a1.setTelefone("8388778877");

        Agenda a2 = new Agenda();
        a2.setNome("Maria");
        a2.setTelefone("85887899873");

        Agenda aSaved1 = repository.save(a1);
        Agenda aSaved2 = repository.save(a2);
        System.out.println(aSaved1.getId());
        System.out.println(aSaved2.getId());
    }
}
