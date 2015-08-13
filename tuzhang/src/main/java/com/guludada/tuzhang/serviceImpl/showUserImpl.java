package com.guludada.tuzhang.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.guludada.tuzhang.dao.usersDao;
import com.guludada.tuzhang.domain.usersBean;
import com.guludada.tuzhang.service.showUser;


public class showUserImpl implements showUser{
@Autowired
private usersDao usersdao;

	public usersDao getUsersdao() {
		return usersdao;
	}
	
	public void setUsersdao(usersDao usersdao) {
		this.usersdao = usersdao;
	}
	public String showuser() {
		List<usersBean> userslist = usersdao.getUsers();
		System.out.println(userslist.get(0).getNickname()); 
		usersBean usersbean = userslist.get(0);
		return usersbean.getNickname();
	}

}
