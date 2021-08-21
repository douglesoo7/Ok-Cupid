package com.example.okcupidcopy;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class ProfileDTO implements Serializable {

	@SerializedName("profile")
	private String profile;

	@SerializedName("Name")
	private String name;

	@SerializedName("Age")
	private String age;

	@SerializedName("State")
	private String state;

	@SerializedName("Self Summary")
	private String selfSummary;

	public String getProfile(){
		return profile;
	}

	public String getName(){
		return name;
	}

	public String getAge(){
		return age;
	}

	public String getState(){
		return state;
	}

	public String getSelfSummary(){
		return selfSummary;
	}
}