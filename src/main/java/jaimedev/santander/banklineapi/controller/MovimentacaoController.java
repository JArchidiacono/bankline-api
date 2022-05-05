package jaimedev.santander.banklineapi.controller;

import jaimedev.santander.banklineapi.dto.NovaMovimentacao;
import jaimedev.santander.banklineapi.dto.NovoCorrentista;
import jaimedev.santander.banklineapi.model.Movimentacao;
import jaimedev.santander.banklineapi.repository.MovimentacaoRepository;
import jaimedev.santander.banklineapi.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovaMovimentacao movimentacao) {
        service.save(movimentacao);
    }
}
