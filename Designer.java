public class Designer extends Karyawan {
	public void addGaji(int addGaji) {
       if((gaji+addGaji)<=salaryDes){
       	gaji=gaji+addGaji;
       	System.out.println("Gaji Berhasil Ditambahkan = "+addGaji);
       	System.out.println("Total Gaji Anda Sebesar = "+gaji);
       }
       else{
       	gaji=salaryDes;
       	System.out.println("Limit Gaji Designer");
       }
	}

	public void addGaji(int addGaji, String pesan) {
       if((gaji+addGaji)<=salaryDes){
       	gaji=gaji+addGaji;
       	System.out.println("Gaji Yang Didapat = "+gaji);
       	System.out.println(pesan);
       }
       else{
       	gaji=salaryDes;
       	System.out.println("Limit Gaji Designer");
       }
	}
}