package huutri.vn.webbansach_backen.dao;

import huutri.vn.webbansach_backen.Entity.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiDungRepository extends JpaRepository<NguoiDung, Integer> {


}
