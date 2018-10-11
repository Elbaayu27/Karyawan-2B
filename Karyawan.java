public class Karyawan {
	public String nama;
	public String jabatan;
	public String alamat;
	protected int gaji;

	final int salaryDes= 70;
	final int salaryProg=90;
	final int salaryPM=100;

	public void addGaji(int addGaji) {
		gaji+=addGaji;
		System.out.println(gaji);
	}
	public void addGaji(int addGaji, String pesan) {
		gaji+=addGaji;
		System.out.println(gaji);
		System.out.println(pesan);
	}
	public void setNama(String addNama) {
		nama = addNama;
	}
	public void setAlamat(String addAlamat) {
		alamat = addAlamat;
	}
	public String getNama(){
		return nama;
	}
	public String getAlamat(){
		return alamat;
	}
	public void setJabatan(String addJabatan){
		jabatan = addJabatan;
	}
	public String getJabatan(){
		return jabatan;
	}
}