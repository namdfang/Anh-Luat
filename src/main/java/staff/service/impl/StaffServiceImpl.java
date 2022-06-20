package staff.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import staff.entity.Staff;
import staff.repository.StaffRepository;
import staff.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {
	private StaffRepository staffRepository;

	@Override
	public List<Staff> getAllStaff() {
		return staffRepository.getStaff();
	}
}
