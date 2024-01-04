package ab;

import java.util.Date;

@Entity
@Valid
@Table(name = "LeadsData")
public class LeadData
{
	@Column(name = "lead_id")
	@Column(unique = true)
	@NotBlank(message = "Leadid cannot be blank")
	private Long leadId;

	@Column(name = "first_Name")	
	@NotBlank(message = "FirstName cannot be blank")
	private String firstName;
	
	@Column(name = "middle_Name")
	private String middleName;
	
	@Column(name = "last_Name")
	@NotBlank(message = "LastName cannot be blank")
	private String lastName;
	
	@Column(name = "mobile_Number")
	//For Mobile validation is handled in controller file 
	@NotBlank(message = "MobileNumber cannot be blank")
	private Long mobileNumber;

	@Column(name = "DOB")	
	@NotBlank(message = "Date Of Birth cannot be blank")
	private Date dateOfBirth;
	
	@Column(name = "Gender")	
	//For gender validation is handled in controller file 
	@NotBlank(message = "Gender cannot be blank")
	private String gender;
	
	
	@Column(name = "email")	
	@Email
	@NotBlank(message = "Email cannot be blank")
	private String email;

	public Long getLeadId() {
		return leadId;
	}

	public void setLeadId(Long leadId) {
		this.leadId = leadId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}