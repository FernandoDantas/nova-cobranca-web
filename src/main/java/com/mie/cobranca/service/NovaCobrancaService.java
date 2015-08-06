package com.mie.cobranca.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.mie.cobranca.model.Cobranca;
import com.mie.cobranca.model.Status;
import com.mie.cobranca.repository.Cobrancas;
import com.mie.cobranca.util.jpa.Transactional;

public class NovaCobrancaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Cobrancas cobrancas;
	
	@Transactional
	public Cobranca salvar(Cobranca cobranca) {
		cobranca.setStatus(Status.PENDENTE);
		cobranca = this.cobrancas.guardar(cobranca);
		
		return cobranca;
	}

}