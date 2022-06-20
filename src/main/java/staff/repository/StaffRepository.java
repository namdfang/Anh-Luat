package staff.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import staff.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {
	@Query("select sta from Staff sta")
	List<Staff> getStaff();
}
