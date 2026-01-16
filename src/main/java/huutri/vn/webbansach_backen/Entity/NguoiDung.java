package huutri.vn.webbansach_backen.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "nguoi_dung")
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_nguoi_dung")
    private int maNguoiDung;

    @Column(name = "email")
    private String email;

    @Column(name = "mat_khau", length = 512)
    private String matKhau;

    @Column(name = "dia_chi_mua_hang")
    private String diaChiMuaHang;

    @Column(name = "ten")
    private String ten;

    @Column(name = "ho_dem")
    private String hoDem;

    @Column(name = "ten_dang_nhap")
    private String tenDangNhap;

    @Column(name = "gioi_tinh")
    private String gioiTing;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @Column(name = "dia_chi_giao_hang")
    private String diaChiGiaoHang;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinTable(
            name = "nguoidung_quyen",
            joinColumns = @JoinColumn(name = "ma_nguoi_dung"),
            inverseJoinColumns = @JoinColumn(name = "ma_quyen")
    )
    private List<Quyen> danhSachQuyen;

    @OneToMany(mappedBy = "nguoiDung",
            fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH

    })
    private List<SuDanhGia> danhSachSuDinhGia;

    @OneToMany(mappedBy = "nguoiDung",
            fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH

    })
    private List<DonHang> danhSachDonHang;

    @OneToMany(mappedBy = "nguoiDung",
            fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH

    })
    private List<SachYeuThich> danhSachYeuThich;
}
