
import javax.swing.text.View;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuanLySanPham {
    public static void main(String[] args) {
        SanPham[] oSanPham = new SanPham[5];
        int n;
        try{
            BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nhap thong tin san pham");
            System.out.print("Số lượng sản phẩm n = ");
            n = Integer.parseInt(oBufferedReader.readLine());
            ThanhTien oList = new ThanhTien();
            oList.inputSanPham(oSanPham, n);
            oList.HienThiSanPham(oSanPham, n);
            oList.sumTinhTien1(oSanPham, n);

           // Collections.sort(oList.getThanhTien());

        }
        catch(Exception e){
            System.out.println(e.toString());
        }

    }
}