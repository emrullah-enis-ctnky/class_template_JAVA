/*
 * Bu dosya, GNU Genel Kamu Lisansı (GPL) sürüm 3 veya daha üstü altında lisanslanmıştır.
 * Detaylı bilgi için lütfen LICENSE.txt dosyasına bakınız.
 *
 * Bu program, faydalı olacağı umuduyla dağıtılmaktadır,
 * ancak HERHANGİ BİR GARANTİ VERİLMEMEKTEDİR;
 * hatta SATILABİLİRLİK veya BELİRLİ BİR AMACA UYGUNLUK garantisi bile verilmez.
 *
 * GNU Genel Kamu Lisansı'nın bir kopyasını LICENSE.txt dosyasında bulabilirsiniz.
 */

package calculator_app;

public class Main {

	public static void main(String[] args) {
		calculatorBase calculator = new calculatorBase();
		System.out.println(calculator.addition(10, 20));
		System.out.println(calculator.subtraction(20, 10));

		System.out.println(calculator.multiplacation(5, 6));
		System.out.println(calculator.division(10, 0));
		System.out.println(calculator.division(10, 3));


	}

}
