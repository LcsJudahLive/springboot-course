package io.github.lcsjudahlive.service;

import io.github.lcsjudahlive.model.Cliente;
import io.github.lcsjudahlive.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    //@Autowired can be used here directly
    private ClientesRepository repository;

    @Autowired
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        repository.persistir();
    }

    public void validarCliente(Cliente cliente){
        //validações
    }

}
