package test;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		// These next three line are used to generate the database definition
		// file
		HibernateExporter exporter = new HibernateExporter("org.hibernate.dialect.MySQL5Dialect", "model");
		exporter.export(
				new File("C:\\Users\\HP\\git\\LocalOnlineExamRepository\\Multiple Choice Exam\\src\\resources\\DD.txt"));
	}
}
