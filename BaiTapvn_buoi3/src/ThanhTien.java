
/*
Tạo 1 class Sản phẩm có các thuộc tính sau:
maSanPham, tenSanPham, giaBan, soLuong
a) Nhập 5 sản phẩm có các thông tin trên
b) Tính thành tiền của từng sản phẩm theo số lượng theo công thức với 2 trường hợp:
  Nếu số lượng mua nhiều hơn 20 sản phẩm thì tính theo công thức:
    thanhTien = giaBan * soLuong * 0.15
    (mua nhiều hơn 20 sản phẩm thì được giảm giá 15%)
  Nếu số lượng mua nhỏ hơn 20 sản phẩm thì không được giảm giá và tính theo công thức:
    thanhTien = giaBan * SoLuong
   Hiển thị thông tin sản phẩm có thêm thông tin Thành tiền ứng từng sản phẩm
c) Sắp xếp theo chiều giảm dần Danh sách thông tin theo Thành tiền
  Sau đó, hiển thị thông tin ra màn hình kết quả sắp xếp giảm dần thông tin danh sách sản phẩm
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;

public class ThanhTien {

    //phuong thuc Nhap du lieu: danh sach 5 sản phẩm
        void inputSanPham(SanPham[] oSanPham, int n)
        {
            try{
                BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
                for(int i = 0; i <= n; i++)
                {
                    oSanPham[i] = new SanPham();
                    System.out.print("+ Mã sản phẩm: ");
                    oSanPham[i].maSanPham = Integer.parseInt(oBufferedReader.readLine());

                    System.out.print("\t+ Tên sản phẩm: ");
                    oSanPham[i].tenSanPham = oBufferedReader.readLine();

                    System.out.print("\t+ Gía bán: ");
                    oSanPham[i].giaBan = Integer.parseInt(oBufferedReader.readLine());

                    System.out.print("\t+ Số lượng: ");
                    oSanPham[i].soLuong = Integer.parseInt(oBufferedReader.readLine());   // ép kiểu
                }
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }
        public void HienThiSanPham(SanPham[] oSanPham, int n)
        {
            for(int i=0; i<=n; i++)
            {
                System.out.print("ID: " + oSanPham[i].getMaSanPham() + "\n");
                System.out.print("Ten San pham: " + oSanPham[i].getTenSanPham() + "\n") ;
                System.out.print("Gia ban" + oSanPham[i].getGiaBan() + "\n") ;
                System.out.print("Soluong" + oSanPham[i].getSoLuong() + "\n");
            }
        }

    /*
    Tính thành tiền của từng sản phẩm theo số lượng theo công thức với 2 trường hợp:
  Nếu số lượng mua nhiều hơn 20 sản phẩm thì tính theo công thức:
    thanhTien = giaBan * soLuong * 0.15
    (mua nhiều hơn 20 sản phẩm thì được giảm giá 15%)
  Nếu số lượng mua nhỏ hơn 20 sản phẩm thì không được giảm giá và tính theo công thức:
    thanhTien = giaBan * SoLuong
   Hiển thị thông tin sản phẩm có thêm thông tin Thành tiền ứng từng sản phẩm
     */
    double thanhTien = 0;
    float TinhTien(int giaBan, int soLuong)
    {
        if(soLuong >= 20)
        {
            thanhTien = (int) (giaBan * soLuong * 0.15);
        }else if(soLuong < 20)
        {
            thanhTien = giaBan * soLuong;
        }
        return (float) thanhTien;
    }

        public void sumTinhTien1 (SanPham[] oSanPham,int n)
        {
            float sumTinhTien = 0;

            for (int i = 0; i <= n; i++) {
                sumTinhTien = TinhTien(oSanPham[i].getGiaBan(), oSanPham[i].getSoLuong());
                System.out.println("\n + Thành tiền của sp " + oSanPham[i].getMaSanPham() + " la: " + sumTinhTien);
            }

        }
    public double getThanhTien() {
        return thanhTien;
    }
}
