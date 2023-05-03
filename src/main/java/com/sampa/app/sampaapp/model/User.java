package com.sampa.app.sampaapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, unique = true)
	@NotBlank(message = "Please enter username")
	@Size(min = 3, max = 20)
	@Pattern(regexp = "^[a-zA-Z0-9_-]{3,20}$")
	private String username;
	
	@Column(nullable = false, unique = true)
	@NotBlank(message = "Please enter email")
	@Email(message = "Please provide a valid email")
	private String email;
	
	@Column(nullable = false)
	@NotBlank(message = "Please enter password")
	@Size(min = 8, max = 64)
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%?&#])[A-Za-z\\d@$!%?&#]{8,64}$", message = "Password must contain at least one lowercase letter, one uppercase letter, one digit, one special character, and be between 8 and 64 characters long.")
	private String password;
}
