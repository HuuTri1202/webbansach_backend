package huutri.vn.webbansach_backen.dao;

import huutri.vn.webbansach_backen.Entity.ChiTietDonHang;
import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietDonHangRepository extends JpaRepository<ChiTietDonHang, Long> {


}
