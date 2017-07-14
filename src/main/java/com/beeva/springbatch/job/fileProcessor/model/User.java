package com.beeva.springbatch.job.fileProcessor.model;

public class User {
	
		//Sera mi clase con la cual voy a cachar los atributos que quiero recuperar de mi base de datos,
	//en mi caso lo quiero nombre y apellido
	
		private String nombre;
		private String apellido;
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		

}
