package de.tekup.vue.dto.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

	private String name;
	private String email;
	private String password;
	// add theses fields to HTML
	private String gender;
	private String note;
	private boolean married;
	private LocalDate birthDate;
	private String profession;
	
	public void setBirthDate(String date) {
		this.birthDate = LocalDate.parse(date);
	}
}
