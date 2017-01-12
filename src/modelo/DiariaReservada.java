package modelo;

import java.io.Serializable;
import javax.persistence.*;
import modelo.Diaria;

/**
 * Entity implementation class for Entity: DiariaReservada
 *
 */
@Entity

public class DiariaReservada extends Diaria implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public DiariaReservada() {
		super();
	}
   
}
