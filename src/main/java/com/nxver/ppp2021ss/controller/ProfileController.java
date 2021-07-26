package com.nxver.ppp2021ss.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxver.ppp2021ss.dto.ProfileDto;


@RestController
@RequestMapping("api/v1/profiles")
public class ProfileController {

	@GetMapping
	public ResponseEntity<List<ProfileDto>> getProfile(){
		ProfileDto profile = ProfileDto.builder()
				.personName("KIM C")
				.build();
		
//		ProfileDto profile2 = ProfileDto.builder()
//				.personName("Kim C friend1")
//				.build();
		
		List<ProfileDto> profileList = new ArrayList<>();
		profileList.add(profile);
		return ResponseEntity.ok(profileList);
		
	}
	
}