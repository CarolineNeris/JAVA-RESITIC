### Conceito de Herança em Java e C++

**Herança em Java** é um mecanismo pelo qual uma classe pode herdar propriedades e comportamentos de outra classe. A classe que herda é chamada de subclasse ou classe filha, e a classe da qual ela herda é chamada de superclasse ou classe pai.

Para criar uma subclasse a partir de uma classe existente em Java, utiliza-se a palavra-chave `extends`. Por exemplo:
```java
class Veiculo {
    // Atributos e métodos da classe Veiculo
}

class Carro extends Veiculo {
    // Atributos e métodos específicos para a classe Carro
}
```
## Exemplo 1 em JAVA:
```java
class Animal {
    public void fazerBarulho() {
        System.out.println("Barulho genérico de um animal");
    }
}

class Cachorro extends Animal {
    public void fazerBarulho() {
        System.out.println("Latindo...");
    }
}
```
## Exemplo 2 em C++:
```c++
class Forma {
public:
    void desenhar() {
        std::cout << "Desenhando uma forma..." << std::endl;
    }
};

class Retangulo : public Forma {
public:
    void desenhar() {
        std::cout << "Desenhando um retângulo..." << std::endl;
    }
};

```
## Exemplo 3 em JAVA:
```java
class Pessoa {
    protected String nome;
    protected int idade;
}

class Estudante extends Pessoa {
    private int matricula;
}

```
## Exemplo 4 em C++:
```c++
class Figura {
public:
    void desenhar() {
        std::cout << "Desenhando uma figura..." << std::endl;
    }
};

class Circulo : public Figura {
public:
    void desenhar() {
        std::cout << "Desenhando um círculo..." << std::endl;
    }
};

```
## Exemplo 5 em JAVA:
```java
class Alimento {
    protected String nome;
    protected String tipo;
}

class Fruta extends Alimento {
    private boolean madura;
}

```
