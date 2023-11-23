/*Em Java, uma classe é uma estrutura que define um tipo de objeto. Ela descreve os atributos e comportamentos que os objetos desse tipo terão.

A diferença entre uma classe e um objeto é que a classe é como um molde, uma especificação que define as propriedades e métodos dos objetos, enquanto o objeto é uma instância específica dessa classe, ou seja, é uma variável que foi criada com base nessa estrutura e ocupa um espaço na memória.

Aqui estão 5 exemplos simples em C++ e em Java:

Exemplo em C++:
Classe em C++:
*/

#include <iostream>
using namespace std;

class Carro {
public:
    string marca;
    int ano;
    void acelerar() {
        cout << "Acelerando..." << endl;
    }
};

int main() {
    Carro carro1; // Objeto do tipo Carro
    carro1.marca = "Toyota";
    carro1.ano = 2020;
    carro1.acelerar();

    return 0;
}

/*Em JAVA:*/

public class Carro {
    public String marca;
    public int ano;
    public void acelerar() {
        System.out.println("Acelerando...");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(); // Objeto do tipo Carro
        carro1.marca = "Toyota";
        carro1.ano = 2020;
        carro1.acelerar();
    }
}
 
