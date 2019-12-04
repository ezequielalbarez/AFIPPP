package com.example.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class ImpuestosEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idimpuestos;
		
		 @Column(name = "descripcion") //columna de base de datos :)
		    private String descripcion;
		 
		   @Column(name = "fecha")
		   private Date fecha;

		   
		public Long getId_impuestos() {
			return idimpuestos;
		}

		public void setId_impuestos(Long id_impuestos) {
			this.idimpuestos = id_impuestos;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

	}

