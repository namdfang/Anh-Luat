package staff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import staff.entity.Staff;
import staff.service.StaffService;

@RestController
@RequestMapping("/api")
public class StaffController {
	@Autowired
	private StaffService staffservice;
	@GetMapping(value = "/staffs")
	public List<Staff> getAllStaffs() {
		return staffservice.getAllStaff();
	}
}
