package fr.gtm.proxibanque.domain;

import java.time.LocalDate;

public class Chequier {
	
	private Integer id; 
	private LocalDate dateEnvoi;
	private LocalDate dateReception;
	public Chequier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chequier(Integer id, LocalDate dateEnvoi, LocalDate dateReception) {
		super();
		this.id = id;
		this.dateEnvoi = dateEnvoi;
		this.dateReception = dateReception;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDateEnvoi() {
		return dateEnvoi;
	}
	public void setDateEnvoi(LocalDate dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	public LocalDate getDateReception() {
		return dateReception;
	}
	public void setDateReception(LocalDate dateReception) {
		this.dateReception = dateReception;
	} 
	
	
}
