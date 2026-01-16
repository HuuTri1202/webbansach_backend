package huutri.vn.webbansach_backen.Entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "su_danh_gia")
public class SuDanhGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_danh_gia")
    private  long maDanhGia;

    @Column(name = "diem_xep_hang")
    private int diemXepHang;

    @Column(name = "nhan_xet")
    private String nhanXet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_sach", nullable = false)
    private Sach sach;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_nguoi_dung", nullable = false)
    private NguoiDung nguoiDung;
}
