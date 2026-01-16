package huutri.vn.webbansach_backen.tesr;

import huutri.vn.webbansach_backen.dao.ChiTietDonHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConTroller {
    private ChiTietDonHangRepository repository;

    @Autowired
    public TestConTroller(ChiTietDonHangRepository repository){
        this.repository = repository;
    }

    @GetMapping("/")
    public void test(){
        repository.findById()
    }

}
