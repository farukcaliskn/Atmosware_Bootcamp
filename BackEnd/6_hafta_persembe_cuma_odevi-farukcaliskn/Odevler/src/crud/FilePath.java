package crud;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FilePath {

	private String path;
	private final String date = createdDate();

	private String createdDate() {
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", locale);
		// new Date(System.currentTimeMillis());
		return dateFormat.format(new Date());
	}

	public FilePath() {

		this.path = "/home/farukcaliskan/Desktop/odev/default.txt";
		File file = new File("/home/farukcaliskan/Desktop/odev/default.txt");

		try {
			if (file.createNewFile()) {
				System.out.println("default.txt oluşturuldu!");
			} else {
				System.out.println("zaten data.txt dosya var");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public FilePath(String path) {
		super();
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDate() {
		return date;
	}

}
