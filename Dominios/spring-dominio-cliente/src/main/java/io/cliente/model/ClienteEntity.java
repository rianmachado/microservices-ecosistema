package io.cliente.model;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class ClienteEntity {

	public String uuid;
	public String nome;

	public ClienteEntity() {
	}

	public ClienteEntity(String nome) throws UnsupportedEncodingException {
		this.nome = nome;
		this.uuid = new String(UUID.randomUUID().toString().getBytes("UTF-8"));
	}


}
