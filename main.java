import java.util.Stack;


public class main {

	public static void main(String[] args) {
	System.out.println("------Object Kelas Kotak------");
	// membuat object dari class kotak
	kotak main = new kotak();
		
	// method setter kotak
	main.setpanjang(10.23);
	main.setlebar(4.56);
		
	// method getter kotak
	System.out.println("panjang : " + main.getpanjang());
	System.out.println("lebar : " + main.getlebar());
	System.out.println("luas : " + main.getpanjang()*main.getlebar());
	System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
	
	System.out.println("------Object Kelas mahasiswa------");
	//membuat object dari class mahasiswa
	mahasiswa mahasiswa = new mahasiswa();
	
	//method setter mahasiswa
	mahasiswa.nama = "muhammad mohar";
	mahasiswa.nim = "D0217321";
	mahasiswa.alamat = "Pambusuang";
	mahasiswa.golonganDarah = "--";
	mahasiswa.status = "pelajar";
	mahasiswa.tinggiBadan = "165";
	mahasiswa.beratBadan = "60";
	
	//method getter mahasiswa
	System.out.println("nama : " + mahasiswa.getnama());
	System.out.println("nim : " + mahasiswa.getnim());
	System.out.println("alamat : " + mahasiswa.getalamat());
	System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
	System.out.println("Status : " + mahasiswa.getstatus());
	System.out.println("tinggi badan : " + mahasiswa.gettinggiBadan());
	System.out.println("berat badan : " + mahasiswa.getberatBadan());

	System.out.println("------Object Kelas node------");
	//membuat object dari kelas node
	node node = new node();
	
	//method setter node
	node.label = "AQUA";
	node.Value = 1;
	
	//method getter node
	System.out.println("Nama Label : " + node.getlabel());
	System.out.println("jumlah label : " + node.getValue());

	System.out.println("------Object Kelas stack------");
	//membuat object dari kelas stack
	stack stack = new stack();
	
	stack.value[0] = "muhammad mohar";
	stack.value[1] = "aswad";
	stack.value[2]= "udin";
	stack.value[3]= "sadly";
		stack.value[4]= "nafisah";
	stack.value[5]= "linda";
	stack.value[6]= "selvi";
	stack.value[7]= "evi";
	stack.value[8]= "ira";
	stack.value[9]= "wahab";
	stack.value[10]= "sisi";
	stack.value[11]= "nengsi";
	stack.value[12]= "roni";
	stack.value[13]= "ilham";
	stack.value[14]= "rustam";
	stack.value[15]= "ruslan";
	stack.value[16]= "rusdi";
	stack.value[17]= "intan";
	stack.value[18]= "aira";
	stack.value[19]= "ardi";
	stack.value[20]= "jumardi";
	stack.value[21]= "arifin";
	stack.value[22]= "mustari";
	stack.value[23]= "lukman";
	stack.value[24]= "nani";
	stack.value[25]= "jumuriah";
	stack.value[26]= "risma";
	stack.value[27]= "sarlina";
	stack.value[28]= "riswan";
	stack.value[29]= "madi";
	stack.value[30]= "assad";
	stack.value[31]= "udin";
	stack.value[32]= "ahmad";
	stack.value[33]= "sadly";
	stack.value[34]= "lina";
	stack.value[35]= "rusdan";
	stack.value[36]= "faer";
	stack.value[37]= "aswad";
	stack.value[38]= "aswandi";
	stack.value[39]= "risdayanti";
	stack.value[40]= "dedi";
	stack.value[41]= "subandi";
	stack.value[42]= "irfan";
	stack.value[43]= "fuad";
	stack.value[44]= "farid";
	stack.value[45]= "windah";
	stack.value[46]= "nugi";
	stack.value[47]= "suluha";
	stack.value[48]= "azizah";
	stack.value[49]= "aminah";
	stack.value[50]= "haddeni";
	stack.value[51]= "subir";
	stack.value[52]= "bobi";
	stack.value[53]= "umar";
	stack.value[54]= "renita";
	stack.value[55]= "mita";
	stack.value[56]= "pipit";
	stack.value[57]= "rosalina";
	stack.value[58]= "nilasari";
	stack.value[59]= "fatur";
	stack.value[60]= "arul";
	stack.value[61]= "ali";
	stack.value[62]= "abai";
	stack.value[63]= "arman";
	stack.value[64]= "sarwan";
	stack.value[65]= "sudarmin";
	stack.value[66]= "hasmirah";
	stack.value[67]= "nelan";
	stack.value[68]= "akbar";
	stack.value[69]= "firdan";
	stack.value[70]= "surti";
	stack.value[71]= "mirnawati";
	stack.value[72]= "santi";
	stack.value[73]= "saenal";
	stack.value[74]= "arjun";
	stack.value[75]= "firman";
	stack.value[76]= "indah";
	stack.value[77]= "asia";
	stack.value[78]= "ridu";
	stack.value[79]= "hasrul";
	stack.value[80]= "prabawati";
	stack.value[81]= "wulan";
	stack.value[82]= "sri";
	stack.value[83]= "nelli";
	stack.value[84]= "riska";
	stack.value[85]= "anita";
	stack.value[86]= "anisa";
	stack.value[87]= "fildan";
	stack.value[88]= "dandi";
	stack.value[89]= "anggi";
	stack.value[90]= "damar";
	stack.value[91]= "arif";
	stack.value[92]= "enal";
	stack.value[93]= "alfia";
	stack.value[94]= "sakir";
	stack.value[95]= "hafis";
	stack.value[96]= "lisa";
	stack.value[97]= "safar";
	stack.value[98]= "hasna";
	stack.value[99]= "indri";
	stack.setvalueAt(4 ,"udin");

	//menampilkan stack
	for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};

	
	}
}
