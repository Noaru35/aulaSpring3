package br.aula.etec.vini.aula3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalizacaoService {

    @GetMapping("/obtemlocal")
    public String obtemLocalizacao() {
        return "leléu";

    }
}
