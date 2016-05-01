package employee;
public class Employee {
    private String nama;
    private int id;
    private String jabatan;
    private int lamakerja;
    private double gaji;
    private String istri;
    private String anak;
    private double tunjangan;
    private double bonus;
    private double tunjanganistri;
    private double tunjangananak;
    
    public void Set(String nama , int id ,int a, double gaji,String istri , String anak){
        this.nama = nama;
        this.id = id;
        this.lamakerja = a;
        this.gaji = gaji;
        this.istri = istri;
        this.anak = anak;
    }
    
    public int getlamakerja(){
        return lamakerja;
    }
    public void Tunjangan(){
        if(this.lamakerja < 5){
            System.out.println("Tidak Ada Tunjangan dan Bonus");
        }
        else if(this.lamakerja <= 10){
            this.bonus = (this.lamakerja*0.05*this.gaji);
            System.out.println("Bonus = "+this.bonus);
        }
        else if(this.lamakerja > 10){
            this.bonus = (this.lamakerja*0.1*this.gaji);
            this.tunjangan = (this.lamakerja*0.1*this.gaji);
            System.out.println("Bonus = "+this.bonus);
            System.out.println("Tunjangan = "+this.tunjangan);
        }        
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public double getBonus() {
        return bonus;
    }
    
    public void Tunjanganistri(){
        if(this.istri.equalsIgnoreCase("Y")){
            this.tunjanganistri = 0.1*(this.gaji+(this.lamakerja*this.gaji)+this.tunjangan);
            System.out.println("Tunjangan Istri = "+this.tunjanganistri);
        }
        else
            System.out.println("Tidak ada Tunjangan Istri");
    }
    
    public void Tunjangananak(){
        if(this.anak.equalsIgnoreCase("Y")){
            this.tunjangananak = 0.15*(this.gaji+(this.lamakerja*this.gaji)+this.tunjangan);
            System.out.println("Tunjangan Anak = "+this.tunjangananak);
        }
        else
            System.out.println("Tidak ada Tunjangan Anak");
    }

    public double getTunjanganistri() {
        return tunjanganistri;
    }

    public double getTunjangananak() {
        return tunjangananak;
    }

    public double getGaji() {
        return gaji;
    }

    public int getLamakerja() {
        return lamakerja;
    }

    public String getIstri() {
        return istri;
    }

    public String getAnak() {
        return anak;
    }

    public String getNama() {
        return nama;
    }

    public int getId() {
        return id;
    }

    public String getJabatan() {
        return jabatan;
    }
    
    
}