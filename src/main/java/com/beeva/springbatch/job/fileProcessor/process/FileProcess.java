package com.beeva.springbatch.job.fileProcessor.process;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.beeva.springbatch.job.fileProcessor.model.*;



@Component
public class FileProcess implements ItemProcessor<User,Cliente> { //Al ItemProcessor le mando mi objeto USER
	//y regresare un tipo CLIENTE

	//Clase que realiza el procesamiento de mis datos, lo que hago es que de cierta manera mi objeto que es de tipo
	//USER lo vuelvo a convertir en un objeto tipo CLIENTE, esta procesamiento podria ser omitido
	
	public Cliente process(User user) throws Exception {
		Cliente cliente = new Cliente();
		cliente.setNombre(user.getNombre());
		cliente.setApellido(user.getApellido());
		return cliente;
	}

}
