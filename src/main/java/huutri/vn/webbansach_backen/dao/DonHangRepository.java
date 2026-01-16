package huutri.vn.webbansach_backen.dao;

import huutri.vn.webbansach_backen.Entity.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonHangRepository extends JpaRepository<DonHang, Integer> {


}
