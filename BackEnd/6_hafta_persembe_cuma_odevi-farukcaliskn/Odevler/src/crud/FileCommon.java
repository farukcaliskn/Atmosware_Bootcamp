package crud;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

// step.1 -) File için CRUD işlemi yapacak bir algoritma yapınız ?

// step.2 -) oluşturulan her bir dosyaya enum ile
// ADMIN(yazma,okuma,oluşturmadır),WRITER(yazma veokumadaır),USER(okumak)
// rollerini en sola yazalım ==> ADMIN 30/Haziran/2022 12:26:01 yazdımmm

// step.3 -) Bir Dosya okuyacak başka bir dosyaya verileri yazacak ( Object)

// step.4 -) Bu projemiz şunuda yapsın ?
// person.txt ve homework.txt diye bir dosyamız olsun bu dosyalar
// person.txt dosyasında ==> kişi ismi ve soyisimi olacak
// homework.txt dosyasında ==> verilecek ödevler olacak
// Bilgisayar random olarak kişiye ödev verecek

public class FileCommon {

	// Sınıf değişkeni (Class variable)
	private static Scanner klavye;

	// file path
	private static String MY_PATH = new FilePath().getPath();

	// File new
	private static File file = new File(MY_PATH);

	// roles
	private static int MY_ROLES;

	// file class
	FilePath pathClass;

	// parametresiz constructor
	public FileCommon(File pathClass) {
		this.pathClass = new FilePath();
	}

	// Chooise Method
	public static int chooise() {
		klavye = new Scanner(System.in);
		System.out.println("Seçim yapınız.");
		System.out.println(
				"0-)Çıkış\n1-)Dosya oluştur\n2-)Dosya Yaz\n3-)Dosya Oku\n4-)Dosya Sil\n5-)Dosya Bilgileri\n6-)Rol değiştir\n7-)Bütün Dosyalar");
		return klavye.nextInt();
	}

	// ADMIN(1, "admin"), WRITER(2, "writer"), USER(3, "user");
	// mainMethod
	public static void mainMethod(int perm) throws IOException, FileClassException {
		int key = chooise();
		switch (key) {
		case 1:
			if (MY_ROLES != FileAuthorizetion.ADMIN.getKey())
				System.out.println("++++++++\nyetkiniz yok\n");
			else
				createDataFile(perm);
			break;

		case 2:
			System.out.println("Roles: " + MY_ROLES);
			System.out.println("enum: " + FileAuthorizetion.USER.getKey());
			if (MY_ROLES == FileAuthorizetion.USER.getKey()) // MY_ROLES == "USER"
				System.out.println("++++++++\nyetkiniz yok\n");
			else
				writeDataFile();
			break;

		case 3:
			ReadDataFile();
			break;

		case 4:
			if (MY_ROLES != FileAuthorizetion.ADMIN.getKey()) // MY_ROLES != "ADMIN"
				System.out.println("++++++++\nyetkiniz yok\n");
			else
				deleteDataFile();
			break;

		case 5:
			showFileData();
			break;
		case 6:
			permission();
			break;
		case 7:
			allFiles();
			break;

		case 0:
			systemExist();
			break;

		default:
			System.out.println("Seçim dışında bir değer girdiniz....");
			break;
		}
	}

	// permission
	private static int permission() {
		klavye = new Scanner(System.in);
		System.out.println("Rolunüzü yazınız\n1-)ADMIN\n2-)WRITER\n3-)USER");
		int roles = klavye.nextInt();
		MY_ROLES = roles;
		return roles;
	}

	// data Merge
	private static String dataMerge(String fileName) {
		StringBuilder builder = new StringBuilder();
		builder.append("/home/farukcaliskan/Desktop/odev/").append(fileName).append(".txt");
		return builder.toString();
	}

	// create path
	private static String createPath() {
		klavye = new Scanner(System.in);
		// "C:\\turkcell\\data.txt"
		System.out.println("Dosya adını giriniz...");
		String fileName = klavye.nextLine();
		FilePath pathClass = new FilePath(dataMerge(fileName));
		return pathClass.getPath();
	}

	// create method
	private static void createDataFile(int perm) throws IOException {
		System.out.println("*** Dosya Oluşturmak ***");
		String path = createPath();
		MY_PATH = path;
		file = new File(path);
		if (file.createNewFile()) {
			System.out.println(file.getAbsolutePath() + " Dosya oluşturuldu");
		} else {
			System.out.println("Oluşturulmadı");
		}
	}

	/////// write method
	private static void writeDataFile() {
		System.out.println("*** Dosya Yaz ***");
		klavye = new Scanner(System.in);
		System.out.println("Dosya yazmak için birşeyler yazınız...");
		String vocabulary = klavye.nextLine();
		System.out.println(MY_PATH);
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_PATH, true))) {
			// _35_FileIO4_1_FileClass class1 = new _35_FileIO4_1_FileClass();
			// bufferedWriter.write("ROL: " + MY_ROLES + " ==>" + class1.getDate() + " ==> "
			// + vocabulary);
			bufferedWriter.write(vocabulary);
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//////// read method
	private static void ReadDataFile() {
		System.out.println("*** Dosya Oku ***");
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(MY_PATH))) {
			StringBuilder builder = new StringBuilder();
			String satir = "";
			while ((satir = bufferedReader.readLine()) != null) {
				builder.append(satir);
			}
			System.out.println(builder);
		} catch (Exception e) {
			System.out.println("Okumada sorun oluştu");
			e.printStackTrace();
		}

	}

	// bütün dosyalar
	private static String allFiles() {
		String baseFilePath = file.getParent();
		System.out.println(baseFilePath);
		System.out.println("#########");
		for (File temp : new File(baseFilePath).listFiles()) {
			System.err.println(temp.getName());
		}
		System.out.println("#########");
		return baseFilePath;
	}

	///// delete method
	private static void deleteDataFile() throws FileClassException {
		System.out.println("*** Dosya Sil ***");
		klavye = new Scanner(System.in);
		String tempBaseFile = allFiles();
		System.out.println("Silmek istediğiniz dosya yazınız");
		String filesName = klavye.nextLine();
		String fileConcat = tempBaseFile + "\\" + filesName + ".txt";
		File deleteFile = new File(fileConcat);

		// try-with resources
		if (deleteFile.exists()) {
			System.out.println("Dosyanız siliniyor");
			deleteFile.delete();
		} else {
			System.out.println("Dosyanız silinemedi");
			// kendi exception yazdım
			throw new FileClassException("Silinemedi");
		}
	}

	////// exit
	private static void systemExist() {
		System.out.println("*** Çıkış ***");
		System.exit(0);

	}

	// show file
	private static void showFileData() {
		File file = new File(MY_PATH);
		System.out.println("toplam karakter sayısı: " + file.length());
		System.out.println("toplam GB : " + file.getTotalSpace());
		System.out.println("absolute path: " + file.getAbsolutePath());
		System.out.println("kullanılabileceğin GB : " + file.getUsableSpace());
		System.out.println("Değişikliği Tarihi: " + new Date(file.lastModified()));
	}

	public static void main(String[] args) throws FileClassException {
		try {
			// sadece 1 kere rol istesin
			int perm = permission();
			MY_ROLES = perm;
			for (;;) {

				synchronized (args) {
					mainMethod(perm);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
