package no.hvl.dat104.jpa;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(schema= "handleliste", name = "vare")
public class vare {

	@Id
	private String navn;

//	public vare(String navn) {
//		this.navn = navn;
//	}
//	
//	public vare() {
//		this.navn ="";
//	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	
}
