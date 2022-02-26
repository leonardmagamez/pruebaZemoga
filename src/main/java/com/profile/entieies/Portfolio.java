package com.profile.entieies;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="portfolio")
public class Portfolio {

	@Id
	private Long idportfolio;
	
	@Column
	private String description;
	
	@Column(name="experienceSummary")
	private String experienceSummary;
	
	@Column
	private Integer id;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="last_names")
	private String lastNames;
	
	@Column
	private String names;
	
	@Column
	private String tittle;
	
	@Column(name="twitter_user_id")
	private String twitterUserId;
	
	@Column(name="twitter_user_name")
	private String twitterUserName;
	
	@Column(name="user_id")
	private String userId;
	
	@Column
	private String address;
	
	@Column
	private String email;
	
	@Column
	private String experience;
	
	@Column(name="image_path")
	private String imagePath;
	
	@Column
	private String name;
	
	@Column
	private String phone;
	
	@Column(name="twitter_user")
	private String twitterUser;
	
	@Column(name="zip_code")
	private String zipCode;
	
	@Column
	private String title;

	public Long getIdportfolio() {
		return idportfolio;
	}

	public void setIdportfolio(Long idportfolio) {
		this.idportfolio = idportfolio;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExperienceSummary() {
		return experienceSummary;
	}

	public void setExperienceSummary(String experienceSummary) {
		this.experienceSummary = experienceSummary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLastNames() {
		return lastNames;
	}

	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getTwitterUserId() {
		return twitterUserId;
	}

	public void setTwitterUserId(String twitterUserId) {
		this.twitterUserId = twitterUserId;
	}

	public String getTwitterUserName() {
		return twitterUserName;
	}

	public void setTwitterUserName(String twitterUserName) {
		this.twitterUserName = twitterUserName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTwitterUser() {
		return twitterUser;
	}

	public void setTwitterUser(String twitterUser) {
		this.twitterUser = twitterUser;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}
