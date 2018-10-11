public class ProjectManager extends Karyawan {
	public void addGaji(int addGaji) {
       if((gaji+addGaji)<=salaryPM){
       	gaji=gaji+addGaji;
       	System.out.println("Gaji Berhasil Ditambahkan = "+addGaji);
       	System.out.println("Total Gaji Anda Sebesar = "+gaji);
       }
       else{
       	gaji=salaryPM;
       	System.out.println("Limit Gaji Project Manager");
       }
	}

	public void addGaji(int addGaji, String pesan) {
       if((gaji+addGaji)<=salaryPM){
       	gaji=gaji+addGaji;
       	System.out.println("Gaji Yang Didapat = "+gaji);
       	System.out.println(pesan);
       }
       else{
       	gaji=salaryPM;
       	System.out.println("Limit Gaji Project Manager");
       }
	}
}