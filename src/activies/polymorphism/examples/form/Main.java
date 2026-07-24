package activies.polymorphism.examples.form;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Registration person1 = new Registration("Ana", 21, "Programadora", true);
        Registration person2 = new Registration("Lorrayne", 29, false);
        Registration person3 = new Registration("Larrisa");
        ArrayList<Registration> registrations = new ArrayList<>();
        registrations.add(person1);
        registrations.add(person2);
        registrations.add(person3);
        
        ArrayList<Registration> classifies = classifyNoActive(registrations);
        
        ArrayList<Registration> filledInFields = unfilledFields(classifies);

        printRegistrations(filledInFields);
    }

    /**
     * Classifica elementos da lista de registros não ativos.
     * @param registrations classifies Lista de registros classificados.
     */
    public static ArrayList<Registration> classifyNoActive(ArrayList<Registration> registrations) {
        ArrayList<Registration> classifies = new ArrayList<>();
        for(Registration registration: registrations) {
            if(!registration.isActive()) {
                classifies.add(registration);
            }
        }
        return classifies;
    }

    /**
     * Preencher campos nulos ou zeros.
     *
     * @param classifies Lista de registros ja classificados
     * @return classifies Lista com todos os campos preenchidos
     */
    public static ArrayList<Registration> unfilledFields(ArrayList<Registration> classifies) {
        Scanner scanner = new Scanner(System.in);
        for(Registration classify: classifies) {
            if(classify.getName() == null) {
                System.out.println("Digite o nome: ");
                String text = scanner.nextLine();
                classify.setName(text);
                scanner.nextLine();
            }
            if(classify.getAge() == 0){
                System.out.println("Informe a idade: ");
                int age = scanner.nextInt();
                classify.setAge(age);
            }
            if(classify.getPosition() == null) {
                System.out.println("Informe o cargo: ");
                String position = scanner.nextLine();
                classify.setPosition(position);
                scanner.nextLine();
            }
            if(!classify.isActive()) {
                classify.setActive(true);
            }
        }
        scanner.close();
        return classifies;
    }

    public static void printRegistrations(ArrayList<Registration> registrations) {
        for(Registration registration: registrations) {
            String string = registration.toString();
        }
    }
}