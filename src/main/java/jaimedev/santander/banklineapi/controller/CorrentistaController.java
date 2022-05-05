package jaimedev.santander.banklineapi.controller;

import jaimedev.santander.banklineapi.dto.NovoCorrentista;
import jaimedev.santander.banklineapi.model.Correntista;
import jaimedev.santander.banklineapi.repository.CorrentistaRepository;
import jaimedev.santander.banklineapi.service.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository repository;

    @Autowired
    private CorrentistaService service;

    @GetMapping
    public List<Correntista> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovoCorrentista correntista) {
        service.save(correntista);
    }
}
