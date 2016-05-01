package employee;
public class PegawaiTidakTetap extends Employee {
    private int lamalembur;
    private int gajilembur;

    public void setLamalembur(int lamalembur) {
        this.lamalembur = lamalembur;
    }

    public int getLamalembur() {
        return lamalembur;
    }
    
    public void gajilembur(){
        if(this.lamalembur > 10){
            int a = this.lamalembur - 10;
            this.gajilembur = a*10000;
            System.out.println("Gaji Lembur = "+this.gajilembur);
        }
    }

    public int getGajilembur() {
        return gajilembur;
    }
    
    public void Display(){
        System.out.println("Nama                : "+super.getNama());
        System.out.println("Id                  : "+super.getId());
        System.out.println("Jabaan              : Pegawai Tidak Tetap");
        System.out.println("Istri               : "+super.getIstri());
        System.out.println("Anak                : "+super.getAnak());
        System.out.println("Lama kerja          : "+super.getLamakerja()+"Tahun");
        System.out.println("Tunjangan           : "+super.getTunjangan());
        System.out.println("Tunjagan Istri      : "+super.getTunjanganistri());
        System.out.println("Tunjangan Anak      : "+super.getTunjangananak());
        System.out.println("Bonus               : "+super.getBonus());
        System.out.println("Gaji Lembur         : "+this.gajilembur);
        System.out.println("Gaji                : "+super.getGaji());
        System.out.println("Total Gaji          : "+(super.getGaji()+super.getBonus()+super.getTunjangan()+super.getTunjanganistri()+super.getTunjangananak()+this.gajilembur));
    }
}
