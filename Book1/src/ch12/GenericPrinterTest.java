package ch12;

/*
 * 날짜 : 2022/09/25
 * 이름 : 이해빈
 * 내용 : GenericPrinter<T> 클래스 사용하기 P394 
 */
public class GenericPrinterTest {
	public static void main(String[] args) {
	
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}
}
