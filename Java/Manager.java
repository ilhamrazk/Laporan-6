package employee;
public class Manager extends Employee{
    private double tunjanganjabatan;

    public void Tunjaganjabatan(){
        this.tunjanganjabatan = 0.1*(super.getGaji()+(super.getGaji()*super.getlamakerja())+super.getTunjangan());
        System.out.println("Tunjangan Jabatan = "+this.tunjanganjabatan);
    }

    public double getTunjanganjabatan() {
        return tunjanganjabatan;
    }
    
    public void Display(){
        System.out.println("Nama                : "+super.getNama());
        System.out.println("Id                  : "+super.getId());
        System.out.println("Jabaan              : Manager");
        System.out.println("Istri               : "+super.getIstri());
        System.out.println("Anak                : "+super.getAnak());
        System.out.println("Lama kerja          : "+super.getLamakerja()+"Tahun");
        System.out.println("Tunjangan           : "+super.getTunjangan());
        System.out.println("Tunjangan Jabatan   : "+this.tunjanganjabatan);
        System.out.println("Tunjagan Istri      : "+super.getTunjanganistri());
        System.out.println("Tunjangan Anak      : "+super.getTunjangananak());
        System.out.println("Bonus               : "+super.getBonus());
        System.out.println("Gaji                : "+super.getGaji());
        System.out.println("Total Gaji          : "+(super.getGaji()+super.getBonus()+super.getTunjangan()+super.getTunjanganistri()+super.getTunjangananak()));
    }
}