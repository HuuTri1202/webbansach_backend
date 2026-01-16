package huutri.vn.webbansach_backen.dao;

import huutri.vn.webbansach_backen.Entity.Quyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuyenRepository extends JpaRepository<Quyen, Integer> {


}
