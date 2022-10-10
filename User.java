package com.springJpa.entity;

	import java.io.Serializable;

	import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

//import org.springframework.security.core.GrantedAuthority;
	//import org.springframework.security.core.authority.SimpleGrantedAuthority;
	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	import com.fasterxml.jackson.annotation.JsonInclude;

	@Entity
	@Table(name = "Users")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	//@JsonIgnoreProperties(value = { "roles", "authorities" })
	public class User implements Serializable, UserDetails{

		@Column(name = "ID", nullable = false, unique = true)
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private int id;
		@Column(name = "USERNAME")
		private String username;
		@Column(name = "PASSWORD")
		private String password;
		@Column(name = "ROLES")
		private String rolse;
		@Column(name="ID_TT")
		private int id_tt;
		
		
		public int getId_tt() {
			return id_tt;
		}

		public void setId_tt(int id_tt) {
			this.id_tt = id_tt;
		}

		public String getRolse() {
			return rolse;
		}

		public void setRolse(String rolse) {
			this.rolse = rolse;
		}

		public int getId() {
			return id;
		}

		public String getUsername() {
			return username;
		}

		public String getPassword() {
			return password;
		}
		
		public String[] getRoles() {
			return roles;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public void setRoles(String[] roles) {
			this.roles = roles;
		}
		@Transient
		private String[] roles;

		public User() {
		}

		public User(int id, String username, String password) {
			this.id = id;
			this.username = username;
			this.password = password;
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}

