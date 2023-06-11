package co.develhope.introduction._7;

public class If_Else_Statement {
    public static void main(String[] args) {
        int i;
        String myName = "Nicolo' Ferri";

        int numeroSpaziVuoti = myName.split(" ").length - 1;
        int numeroAccenti = myName.split("'").length - 1;


        if (myName.contains(" ") || myName.contains("'")) {
            if ((myName.length() - numeroSpaziVuoti - numeroAccenti) % 2 == 0) {
                System.out.println("il tuo nome ha un numero di lettere pari");
            }else
                System.out.println(" il tuo nome ha un numero di lettere dispari");

        }else {
            if ( myName.length() % 2 == 0) {
                System.out.println("il tuo nome ha un numero di lettere pari");
            }else {
                System.out.println(" il tuo nome ha un numero di lettere dispari");
                }
            }
        }
    }


