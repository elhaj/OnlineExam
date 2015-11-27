package test;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HibernateExporter exporter = new HibernateExporter("org.hibernate.dialect.MySQL5Dialect", "model");
		exporter.setGenerateDropQueries(true);
		exporter.exportToConsole();
	}

}
