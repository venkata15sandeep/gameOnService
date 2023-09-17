package com.gamesApp.gameOn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamesApp.gameOn.models.DashboardTable;
import com.gamesApp.gameOn.repositories.DashboardRepo;
import com.gamesApp.gameOn.requests.GroupRequest;

@Service
public class DashboardServices {
	
	@Autowired
	DashboardRepo dashRepo;

	public String saveDetails(GroupRequest gr) {
		DashboardTable dt= new DashboardTable();
		dt.setGroupID(gr.getGroupID());
		dt.setGroupName(gr.getGroupName());
		dt.setGroupSize(gr.getGroupSize());
		dt.setGroupType(gr.getGroupType());
		dt.setGendersAllowed(gr.getGendersAllowed());
		dt.setCity(gr.getCity());
		dt.setState(gr.getState());
		dt.setCountry(gr.getCountry());
		dt.setPin(gr.getPin());
		dt.setgLocation(gr.getgLocation());
		dashRepo.save(dt);
		return "data saved";
	}
}
