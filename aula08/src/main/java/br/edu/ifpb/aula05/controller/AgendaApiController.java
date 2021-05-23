package br.edu.ifpb.aula05.controller;

import br.edu.ifpb.aula05.model.Agenda;
import br.edu.ifpb.aula05.service.AgendaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(value = "API REST Agenda")
@RestController
@RequestMapping(value = "/api")
public class AgendaApiController {

    @Autowired
    private AgendaService agendaService;

    @ApiOperation(value = "Retorna lista de contatos.")
    @GetMapping(produces = "application/json")
    public @ResponseBody List<Agenda> getContatos() {
        return agendaService.findAll();
    }

    @ApiOperation(value = "Retorna um contato específico pelo seu ID.")
    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody Agenda getContato(@PathVariable Long id) {
        return agendaService.findById(id);
    }

    @ApiOperation(value = "Cria um novo contato.")
    @PostMapping(produces = "application/json")
    public @ResponseBody Agenda createContato(@RequestBody @Valid Agenda contato) {
        return agendaService.save(contato);
    }
}
