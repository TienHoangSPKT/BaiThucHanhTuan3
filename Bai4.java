import java.util.Scanner;

public class Bai4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so tien gui ban dau (VND): ");
        double soTienGui = sc.nextDouble();

        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatNam = sc.nextDouble();

        System.out.print("Nhap so thang gui: ");
        int soThang = sc.nextInt();

        double laiSuatThang = laiSuatNam / 12 / 100;
        double tienLai = soTienGui * laiSuatThang * soThang;
        double tongTien = soTienGui + tienLai;

        System.out.println("\n------ KET QUA ------");
        System.out.printf("So tien gui ban dau: %.0f VND\n", soTienGui);
        System.out.printf("Lai suat hang nam: %.2f%%\n", laiSuatNam);
        System.out.printf("So thang gui: %d\n", soThang);
        System.out.printf("Tien lai: %.0f VND\n", tienLai);
        System.out.printf("Tong so tien cuoi ky: %.0f VND\n", tongTien);

        sc.close();
    }
}
