package com.example.okcupidcopy;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class DataDTO implements Serializable {

	@SerializedName("profile")
	private List<ProfileDTO> profile;

	public List<ProfileDTO> getProfile(){
		return profile;
	}
}