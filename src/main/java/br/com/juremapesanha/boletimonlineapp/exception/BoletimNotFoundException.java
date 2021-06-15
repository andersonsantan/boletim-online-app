package br.com.juremapesanha.boletimonlineapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class BoletimNotFoundException extends Exception {
    public BoletimNotFoundException(Long matricula) {
        super("Não existe aluno com os dados informados");
    }
}
