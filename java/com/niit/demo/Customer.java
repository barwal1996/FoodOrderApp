package com.niit.demo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set<Food> food = new HashSet<Food>(0);

	public Customer() {
	}

	public Customer(String name) {
		this.name = name;
	}

	public Customer(String name, Set<Food> food) {
		this.name = name;
		this.food = food;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 250)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Food> getfood() {
		return this.food;
	}

	public void setProducts(Set<Food> food) {
		this.food = food;
	}

}