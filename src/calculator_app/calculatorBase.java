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

public class calculatorBase {
	public int addition(int number1, int number2) {
		return number1 + number2;


	}

	public int subtraction(int number1, int number2) {

		return number1 - number2;


	}

	public int multiplacation(int number1, int number2) {

		return number1 * number2;


	}

	public double division(double number1, double number2) {
		if (number2 == 0) {

			System.out.println("Sayı sıfıra bölünemez!");// İkinci sayı 0 olursa return değeri 0 olur.
			return number2;

		} else {

			return number1 / number2;

		}


	}

}
