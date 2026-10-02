package com.concessionaria.service;

import com.concessionaria.model.Cliente;
import com.concessionaria.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository repository;
    public ClienteService(ClienteRepository repository){this.repository=repository;}
    public List<Cliente> listar(){return repository.findAll();}
    public Cliente buscar(Long id){return repository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado."));}
    public Cliente salvar(Cliente cliente){
        if(cliente.getNome()==null || cliente.getNome().trim().isEmpty()) throw new RuntimeException("O nome do cliente é obrigatório.");
        if(cliente.getTipoPessoa()==null || cliente.getTipoPessoa().trim().isEmpty()) throw new RuntimeException("O tipo de pessoa é obrigatório.");
        if(cliente.getCpfCnpj()==null || cliente.getCpfCnpj().trim().isEmpty()) throw new RuntimeException("CPF/CNPJ é obrigatório.");
        if(cliente.getId()==null && repository.existsByCpfCnpj(cliente.getCpfCnpj())) throw new RuntimeException("Já existe um cliente cadastrado com este CPF/CNPJ.");
        return repository.save(cliente);
    }
    public void excluir(Long id){if(!repository.existsById(id)) throw new RuntimeException("Cliente não encontrado."); repository.deleteById(id);}
}
