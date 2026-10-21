package ma.ensias.employee1.demo;

public class SonarDemo {

    // 1. Bug potentiel : NullPointerException
    public int getLength() {
        String text = null;
        return text.length();
    }

    // 2. Mauvaise comparaison de String
    public boolean compareNames(String name) {
        return name == "admin";
    }

    // 4. Catch vide
    public void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println(result);
        } catch (Exception e) {
        }
    }

    // 5. Condition inutile
    public boolean checkAge(int age) {
        if (age == age) {
            return true;
        }

        return false;
    }


    // 6. Méthode privée jamais utilisée
    private void unusedMethod() {
        System.out.println("Never used");
    }
}
