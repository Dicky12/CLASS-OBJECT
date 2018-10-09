
public class main {

	
	public static void main(String[] args) {
		Kotak kotakHitam = new Kotak();
		
		kotakHitam.setPanjang(20);
		kotakHitam.setLebar(10);
		
		kotakHitam.hitungLuas();
		kotakHitam.hitungKeliling();
	
		System.out.println("Panjang : " + kotakHitam.getPanjang());
		System.out.println("Lebar : " + kotakHitam.getLebar());
		System.out.println("LuasKotak : " + kotakHitam.getLuas());
		System.out.println("KelilingKotak " + kotakHitam.getKeliling());
		System.out.println("___________________________________________");
				
		{
			//Hasil Mahasiswa
			mahasiswa mhs1 = new mahasiswa();
			mhs1.setNama("Muh Dicky Waizulqarni");
			mhs1.setNim("D0217502");
			mhs1.setAlamat("majene");
			mhs1.setGolonganDarah("A");
			mhs1.setStatus("Mahasiswa");
			mhs1.setTinggiBadan(167);
			mhs1.setBeratBadan(52);
			
			System.out.println("Nama : " + mhs1.getNama());
			System.out.println("Nim : " + mhs1.getNim());
			System.out.println("Alamat : " + mhs1.getAlamat());
			System.out.println("GolonganDarah : " + mhs1.getGolonganDarah());
			System.out.println("Status : " + mhs1.getStatus());
			System.out.println("TinggiBadan : " + mhs1.getTinggiBadan());
			System.out.println("BeratBadan : " + mhs1.getBaratBadan());
			System.out.println("---------------------------------------------");

			System.out.println("------Object Kelas node------");
			//membuat object darikelas node
			node node = new node();
			
			//method setter node
			node.label = "Sprite";
			node.Value = 1;
			
			//method getter node
			System.out.println("Nama Label : " + node.getlabel());
			System.out.println("jumlah label : " + node.getValue());
			
			
			//membuat object darikelas stack
			stack stack = new stack();
			System.out.println("------Object Kelas stack------");
			stack.value[0] = "Muh Dicky Waizluqarni";
			stack.value[1] = "Taufan";
			stack.value[2]= "Hesti";
			stack.value[3]= "Dicky";
			stack.value[4]= "Dicky";
			stack.value[5]= "Dicky";
			stack.value[6]= "Dicky";
			stack.value[7]= "Dicky";
			stack.value[8]= "Dicky";
			stack.value[9]= "Dicky";
			stack.value[10]= "Dicky";
			stack.value[11]= "Dicky";
			stack.value[12]= "Dicky";
			stack.value[13]= "Dicky";
			stack.value[14]= "Dicky";
			stack.value[15]= "Dicky";
			stack.value[16]= "Dicky";
			stack.value[17]= "Dicky";
			stack.value[18]= "Dicky";
			stack.value[19]= "Dicky";
			stack.value[20]= "Dicky";
			stack.value[21]= "Dicky";
			stack.value[22]= "Dicky";
			stack.value[23]= "Dicky";
			stack.value[24]= "Dicky";
			stack.value[25]= "Dicky";
			stack.value[26]= "Dicky";
			stack.value[27]= "Dicky";
			stack.value[28]= "Dicky";
			stack.value[29]= "Dicky";
			stack.value[30]= "Dicky";
			stack.value[31]= "Dicky";
			stack.value[32]= "Dicky";
			stack.value[33]= "Dicky";
			stack.value[34]= "Dicky";
			stack.value[35]= "Dicky";
			stack.value[36]= "Dicky";
			stack.value[37]= "Dicky";
			stack.value[38]= "Dicky";
			stack.value[39]= "Dicky";
			stack.value[40]= "Dicky";
			stack.value[41]= "Dicky";
			stack.value[42]= "Dicky";
			stack.value[43]= "Dicky";
			stack.value[44]= "Dicky";
			stack.value[45]= "Dicky";
			stack.value[46]= "Dicky";
			stack.value[47]= "Dicky";
			stack.value[48]= "Dicky";
			stack.value[49]= "Dicky";
			stack.value[50]= "Dicky";
			stack.value[51]= "Dicky";
			stack.value[52]= "Dicky";
			stack.value[53]= "Dicky";
			stack.value[54]= "Dicky";
			stack.value[55]= "Dicky";
			stack.value[56]= "Dicky";
			stack.value[57]= "Dicky";
			stack.value[58]= "Dicky";
			stack.value[59]= "Dicky";
			stack.value[60]= "Dicky";
			stack.value[61]= "Dicky";
			stack.value[62]= "Dicky";
			stack.value[63]= "Dicky";
			stack.value[64]= "Dicky";
			stack.value[65]= "Dicky";
			stack.value[66]= "Dicky";
			stack.value[67]= "Dicky";
			stack.value[68]= "Dicky";
			stack.value[69]= "Dicky";
			stack.value[70]= "Dicky";
			stack.value[71]= "Dicky";
			stack.value[72]= "Dicky";
			stack.value[73]= "Dicky";
			stack.value[74]= "Dicky";
			stack.value[75]= "Dicky";
			stack.value[76]= "Dicky";
			stack.value[77]= "Dicky";
			stack.value[78]= "Dicky";
			stack.value[79]= "Dicky";
			stack.value[80]= "Dicky";
			stack.value[81]= "Dicky";
			stack.value[82]= "Dicky";
			stack.value[83]= "Dicky";
			stack.value[84]= "Dicky";
			stack.value[85]= "Dicky";
			stack.value[86]= "Dicky";
			stack.value[87]= "Dicky";
			stack.value[88]= "Dicky";
			stack.value[89]= "Dicky";
			stack.value[90]= "Dicky";
			stack.value[91]= "Dicky";
			stack.value[92]= "Dicky";
			stack.value[93]= "Dicky";
			stack.value[94]= "Dicky";
			stack.value[95]= "Dicky";
			stack.value[96]= "Dicky";
			stack.value[97]= "Dicky";
			stack.value[98]= "Dicky";
			stack.value[99]= "Dicky";

			for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};
		}

}	
}
