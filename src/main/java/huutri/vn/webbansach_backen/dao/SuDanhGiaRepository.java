package huutri.vn.webbansach_backen.dao;

import huutri.vn.webbansach_backen.Entity.SuDanhGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuDanhGiaRepository extends JpaRepository<SuDanhGia, Long> {


}
