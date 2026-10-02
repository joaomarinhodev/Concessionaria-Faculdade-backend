package com.concessionaria.controller;

import com.concessionaria.model.Cliente;
import com.concessionaria.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {
    private final ClienteService service;
    public ClienteController(ClienteService service){this.service=service;}
    @GetMapping public ResponseEntity<List<Cliente>> listar(){return ResponseEntity.ok(service.listar());}
    @GetMapping("/{id}") public ResponseEntity<Cliente> buscar(@PathVariable Long id){return ResponseEntity.ok(service.buscar(id));}
    @PostMapping public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(cliente));}
    @DeleteMapping("/{id}") public ResponseEntity<Void> excluir(@PathVariable Long id){service.excluir(id); return ResponseEntity.noContent().build();}
}
