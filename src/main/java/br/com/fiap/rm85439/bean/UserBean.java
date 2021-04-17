package br.com.fiap.rm85439.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.fiap.rm85439.dao.UserDAO;
import br.com.fiap.rm85439.model.User;

@ManagedBean
public class UserBean {
	
	private User user = new User();
	
	public void save() {
		new UserDAO().save(this.user);
		this.user = new User();
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage("Usuário cadastrado."));
	}
	
	public List<User> getUsers(){
		return new UserDAO().getAll();
	}

	public void executar() {
		System.out.println("Acionando o Bean.");
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
