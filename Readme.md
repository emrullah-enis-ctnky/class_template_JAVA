# 📌 Java'da Sınıf Kullanımı (Calculator App)

Bu proje, **Java'da sınıf kullanımını** göstermek amacıyla hazırlanmış basit bir hesap makinesi uygulamasıdır.

## 📂 Proje Yapısı

```plaintext
calculator_app/
├── calculatorBase.java  # İşlemleri gerçekleştiren sınıf
└── Main.java            # Ana çalışma sınıfı
```

## 🔹 Sınıf Tanımlama

```java
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
            System.out.println("Sayı sıfıra bölünemez!");
            return 0;
        } else {
            return number1 / number2;
        }
    }
}
```

## 🔹 Sınıfın Kullanımı

```java
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
```

## 📌 Çıktı Örneği

```plaintext
30
10
30
Sayı sıfıra bölünemez!
0
3.3333333333333335
```

## 📜 Lisans

Bu proje **GNU Genel Kamu Lisansı (GPL) v3** altında lisanslanmıştır. Detaylar için **LICENSE.txt** dosyasına göz atabilirsiniz.

---

✅ **Java'da sınıfların nasıl tanımlanacağını ve kullanılacağını öğrenmek isteyenler için basit bir örnek!** 🚀
