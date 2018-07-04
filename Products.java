
public class Products {

	public static String getDescription() {
		return Okno.tf.getText();
	}
	
	public static int getQuantity() {
		int ilosc = Integer.parseInt(Okno.tf2.getText());
		return ilosc;
	}
	
	public static double getPrice() {
		double cena = Double.parseDouble(Okno.tf3.getText());
		return cena;
	}
	
	public static Object getVatRate() {
		return Okno.chooseVat.getSelectedItem();
	}
	
	public static double calculateTotal() {
		int ilosc = Integer.parseInt(Okno.tf2.getText());
		double cena = Double.parseDouble(Okno.tf3.getText());
		return ilosc * cena;
	}
	
	public static double calculateVat() {
		double cena = Double.parseDouble(Okno.tf3.getText());
		String var = (String) getVatRate();
		String var2 = var.substring(0, var.length() - 1);
		double vat = Double.parseDouble(var2);
		return cena * (vat / 100);
		
	}
	
	public static double calculateGross() {
		return calculateTotal() + calculateVat();
	}
	

}
