# Java-проєкт: Обчислення площі та периметра еліпса

## 🔧 Мета проєкту

Розробити клас `Ellipse`, що моделює геометричну фігуру еліпс. Реалізувати методи для обчислення площі, периметра, визначення чи є еліпс колом, а також метод опису. Кожен метод протестований вручну через `main()`.

---

## 🧱 Структура

untitled11/ └── src/ ├── Ellipse.java // Клас еліпса з логікою └── Main.java // Ручне тестування методів
---

## 🪜 Покрокова інструкція

### 1. Створення нового Java-проєкту
- Відкрий **IntelliJ IDEA**
- Натисни `File → New → Project`
- Обери `Java` та натисни **Next**
- Дай ім'я, наприклад `EllipseProject`
- Натисни **Finish**

---

### 2. Створення класів

**Ellipse.java:**
```java
public class Ellipse {
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }

    public double area() {
        return Math.PI * a * b;
    }

    public double perimeterApprox() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    public boolean isCircle() {
        return a == b;
    }

    public String describe() {
        return String.format("Ellipse with a = %.2f and b = %.2f", a, b);
    }
}
