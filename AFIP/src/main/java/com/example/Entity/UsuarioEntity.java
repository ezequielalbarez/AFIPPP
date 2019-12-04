package com.example.Entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;



@Entity
public class UsuarioEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcuil;
	 
	private Long numfiscal;
	

	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "impuestoEntity", nullable = true)
	
	private List<ImpuestosEntity> impuestos;

	public Long getIdCuil() {
		return idcuil;
	}

	public void setIdCuil(Long idCuil) {
		this.idcuil = idCuil;
	}

	public Long getNum_fiscal() {
		return numfiscal;
	}

	public void setNum_fiscal(Long num_fiscal) {
		this.numfiscal = num_fiscal;
	}

	public List<ImpuestosEntity> getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(List<ImpuestosEntity> impuestos) {
		this.impuestos = impuestos;
	}

	
	 
	 
}


