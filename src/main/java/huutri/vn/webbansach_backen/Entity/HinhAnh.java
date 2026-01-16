package huutri.vn.webbansach_backen.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.core.SpringVersion;
@Entity
@Data
@Table(name = "hinh_anh")
public class HinhAnh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_anh")
    private  int maHinhAnh;

    @Column(name = "ten_hinh_anh", length = 256)
    private String tenHinhAnh;

    @Column(name = "la_icon") //tiny int
    private boolean laIcon;

    @Column(name = "link")
    private String link;

    @Column(name = "du_lieu_anh")
    @Lob
    private String duLieuAnh;

    @Column(name = "duong_dan")
    private String duongDan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_sach", nullable = false)
    private Sach sach;


}
