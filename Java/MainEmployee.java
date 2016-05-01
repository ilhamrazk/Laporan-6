package employee;
import java.util.Scanner;
public class MainEmployee {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("============================");
            System.out.println("        PT.MAJU MAKMUR      ");
            System.out.println("============================");
            System.out.print("Nama : ");
            String nama = in.next();
            System.out.print("Id   : ");
            int id = in.nextInt();
            System.out.println("1.Manager");
            System.out.println("2.Pegawai Tetap");
            System.out.println("3.Pegawai Tidak Tetap");
            System.out.print("Jabatan : ");
            int jabatan = in.nextInt();
            System.out.print("Mempunyai Istri (y/n): ");
            String istri = in.next();
            System.out.print("Mempunyai Anak (y/n): ");
            String anak = in.next();
            System.out.print("Tahun Masuk Kerja : ");
            int tahun = in.nextInt();
            int a = 2016 - tahun;
            System.out.print("Gaji pokok : ");
            double gaji = in.nextDouble();
            
            switch(jabatan){
                case 1:{
                    Manager manager = new Manager();
                    manager.Set(nama, id, a, gaji, istri, anak);
                    manager.Tunjangan();
                    manager.Tunjanganistri();
                    manager.Tunjangananak();
                    manager.Tunjaganjabatan();
                    manager.Display();
                    break;
                }
                case 2:{
                    PegawaiTetap pegawaitetap = new PegawaiTetap();
                    pegawaitetap.Set(nama, id, a, gaji, istri, anak);
                    pegawaitetap.Tunjangan();
                    pegawaitetap.Tunjanganistri();
                    pegawaitetap.Tunjangananak();
                    pegawaitetap.Display();
                    break;
                }
                case 3:{
                    PegawaiTidakTetap pegawaitidaktetap = new PegawaiTidakTetap();
                    pegawaitidaktetap.Set(nama, id, a, gaji, istri, anak);
                    pegawaitidaktetap.Tunjangan();
                    pegawaitidaktetap.Tunjanganistri();
                    pegawaitidaktetap.Tunjangananak();
                    System.out.print("Lama Lembur (jam) : ");
                    int lembur = in.nextInt();
                    pegawaitidaktetap.setLamalembur(lembur);
                    pegawaitidaktetap.gajilembur();
                    pegawaitidaktetap.Display();
                    break;
                }
            }
    }
}