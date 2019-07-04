//RodrigoDeAraujoSilva 01/07/2019
//Matriz Sequêncial , Threads em Lp2
//Calcular Matriz A x B

//////////////////////////////////MAIN///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////
public class Main {


    public static void main(String[] args) {

        int [] matrizA = new int[4]; //Criação de matriz A com 4 posições

        matrizA[0] = 2; //Atribuindo valores para cada Posição da Matriz A
        matrizA[1] = 1;
        matrizA[2] = 3;
        matrizA[3] = 0;


        int [] matrizB = new int[4]; // Criação de matriz B com 4 posições


        matrizB[0]= 3; // Atribuindo valores para cada Posição da Matriz B
        matrizB[1] = 4;
        matrizB[2] = 0;
        matrizB[3] = 2;


        System.out.println(matrizA[1] * matrizB[0]); //Testando print de resultado na tela.

    }
}
