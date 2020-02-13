
package com.research24x7.hibernate.beginners.entity;


import com.sun.corba.se.impl.presentation.rmi.IDLNameTranslatorImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Getter
@Setter
@AllArgsConstructor

@Entity (name =  "Employee")
@Table (name = "employee")
public class Employee {


	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="emp_id", nullable=false, unique=true)
	private int id;
	
	@Column(name="emp_name", length=28, nullable=false)
	private String name;
	
	@Column(name="emp_lastname", length=28, nullable=false)
	private String lastname;
	
	@Column(name="emp_dni", nullable=false)
	private Long dni;

	@Column(name="emp_email", nullable=false)
	private Long email;

	@Column(name="emp_mobile", nullable=false)
	private Long mobile;


    public Employee() {

        super ();
    }

	public Employee(String name, String lastname, Long dni, Long email, Long mobile) {
		this.name = name;
		this.lastname = lastname;
		this.dni = dni;
		this.email = email;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public Long getEmail() {
		return email;
	}

	public void setEmail(Long email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
}
