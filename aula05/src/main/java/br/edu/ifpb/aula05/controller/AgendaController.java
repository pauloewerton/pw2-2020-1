package br.edu.ifpb.aula05.controller;

import br.edu.ifpb.aula05.model.Agenda;
import br.edu.ifpb.aula05.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AgendaController {

    @Autowired
    AgendaService agendaService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(path = {"/agenda"}, method = {RequestMethod.GET})
    public ModelAndView getAgenda() {
        ModelAndView mv = new ModelAndView("agenda");
        List<Agenda> agendaList = agendaService.findAll();
        mv.addObject("agenda", agendaList);

        return mv;
    }

    @RequestMapping(path = {"/agenda/{id}"}, method = {RequestMethod.GET})
    public ModelAndView getContato(@PathVariable("id") long id) {
        ModelAndView mv = new ModelAndView("contato");
        Agenda agenda = agendaService.findById(id);
        mv.addObject("contato", agenda);

        return mv;
    }
}
