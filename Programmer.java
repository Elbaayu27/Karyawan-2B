public class Programmer extends Karyawan {
	public void addGaji(int addGaji) {
       if((gaji+addGaji)<=salaryProg){
       	gaji=gaji+addGaji;
       	System.out.println("Gaji Berhasil Ditambahkan = "+addGaji);
       	System.out.println("Total Gaji Anda Sebesar = "+gaji);
       }
       else{
       	gaji=salaryProg;
       	System.out.println("Limit Gaji Programmer");
       }
	}

	public void addGaji(int addGaji, String pesan) {
       if((gaji+addGaji)<=salaryProg){
       	gaji=gaji+addGaji;
       	System.out.println("Gaji Yang Didapat = "+gaji);
       	System.out.println(pesan);
       }
       else{
       	gaji=salaryProg;
       	System.out.println("Limit Gaji Programmer");
       }
	}
}