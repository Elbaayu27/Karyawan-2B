public class Test {
	public static void main(String[] args) {
		Designer des = new Designer();
		Programmer prog = new Programmer();
		ProjectManager pm = new ProjectManager();

		des.setNama("Mega Iskanti");
		System.out.println("Nama Karyawan = " + des.getNama());
		des.setJabatan("Designer");
		System.out.println("Jabatan = " + des.getJabatan());
		des.setAlamat("Adelaide");
		System.out.println("Alamat Karyawan = " + des.getAlamat());
		des.addGaji(20, "Jangan Boros-Boros yaa :*");
		des.addGaji(15);
		System.out.println();



		prog.setNama("Ibrahim Zulfa");
		System.out.println("Nama Karyawan = " + prog.getNama());
		prog.setJabatan("Programmer");
		System.out.println("Jabatan = " + prog.getJabatan());
		prog.setAlamat("Berlin");
		System.out.println("Alamat Karyawan = " + prog.getAlamat());
		prog.addGaji(50, "Jangan Boros-Boros yaa :*");
		prog.addGaji(15);
		System.out.println();


		pm.setNama("Dwi Handayani");
		System.out.println("Nama Karyawan = " + pm.getNama());
		pm.setJabatan("Project Manager");
		System.out.println("Jabatan = " + pm.getJabatan());
		pm.setAlamat("Osaka");
		System.out.println("Alamat Karyawan = " + pm.getAlamat());
		pm.addGaji(80, "Jangan Boros-Boros yaa ");
		pm.addGaji(15);
	}
}