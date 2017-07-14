package com.beeva.springbatch.job.fileProcessor.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		//userMapper me regresa un result set y a ese result set le extraere sus columnas y las seteare
		//a mi clase que hice para obtener mis datos, en este caso USER
		User user = new User();

		user.setNombre(rs.getString("nombre"));
		user.setApellido(rs.getString("apellido"));
		
		return user;
	}

}
