package com.mvc.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mvc.model.LoginBean;

@Repository
public class LoginDaoImpl 
{

	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void insertdata(LoginBean loginBean)
	{
		String sql="insert into loginDetail values(?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] {loginBean.getFname(),loginBean.getLname(),
				loginBean.getEmail(),loginBean.getGender(),loginBean.getLocation()});
		
		}
	}
	
