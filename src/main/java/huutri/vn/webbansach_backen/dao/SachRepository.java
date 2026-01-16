package huutri.vn.webbansach_backen.dao;

import huutri.vn.webbansach_backen.Entity.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SachRepository extends JpaRepository<Sach, Integer> {


}
