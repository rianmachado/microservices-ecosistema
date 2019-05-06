package io.cliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.cliente.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

    public Cliente recuperarClientePorName(String firstName);

}
