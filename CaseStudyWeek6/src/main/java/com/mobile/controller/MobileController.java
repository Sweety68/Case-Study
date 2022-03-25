package com.mobile.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

@RestController
@RequestMapping("/mobile")                  //  http://localhost:6666/mobile
public class MobileController {
		
		@Autowired
		MobileService service;
		
		//post-insert,put-update,get-get,delete-remove
		
		@PostMapping("/addMobile")               //  http://localhost:6666/mobile/addMobile
		public Mobile addMobile(@RequestBody Mobile mobile) {
			
			return service.addMobile(mobile);
			
		}
		
		@PutMapping("/updateMobile")            //  http://localhost:6666/mobile/updateMobile
		public Mobile updateMobile(@RequestBody Mobile mobile) {
			
			return service.updateMobile(mobile);
			
		}

		@GetMapping("/getMobile/{mid}")        //  http://localhost:6666/mobile/getMobile/mid
		public Optional<Mobile> getMobile(@PathVariable("mid") int mId) {
			
			return service.getMobile(mId);
			
		}
		
		@GetMapping("/getAllMobiles")          //  http://localhost:6666/mobile/getAllMobiles
		public Iterable<Mobile> getAllMobiles() {
			
			return service.getAllMobiles();
			
		}
		
		@DeleteMapping("/deleteMobile/{mid}")      //  http://localhost:6666/mobile/deleteMobile/mid
		public void deleteMobile(@PathVariable("mid") int mId) {
			
			 service.deleteMobile(mId);
			
		}
	}


