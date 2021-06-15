package br.com.juremapesanha.boletimonlineapp.controller;


import br.com.juremapesanha.boletimonlineapp.exception.BoletimNotFoundException;
import br.com.juremapesanha.boletimonlineapp.model.Boletim;
import br.com.juremapesanha.boletimonlineapp.repository.BoletimRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping
public class BoletimController {

    BoletimRepository boletimRepository;

    public BoletimController(BoletimRepository boletimRepository) {
        this.boletimRepository = boletimRepository;
    }
    @RequestMapping(path = "/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @RequestMapping(path = "/alunos")
    public ModelAndView listarAlunos(){
        ModelAndView modelAndView = new ModelAndView("alunos");
        Iterable<Boletim> boletins = boletimRepository.findAll();
        modelAndView.addObject("boletins", boletins);
        return modelAndView;
    }

    @ResponseStatus(code = HttpStatus.OK)
    @RequestMapping(path = "/aluno")
    public ModelAndView boletimAluno(@RequestParam Long matricula) throws BoletimNotFoundException {

        if (boletimRepository.existsByMatricula(matricula)){
            Boletim boletim = boletimRepository.findByMatricula(matricula);
            ModelAndView modelAndView = new ModelAndView("/boletim-aluno");
            modelAndView.addObject("boletim", boletim);
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("/boletim-notfound");
        return modelAndView;
    }
}
