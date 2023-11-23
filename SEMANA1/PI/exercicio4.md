### Variáveis em Java e C++: Ponteiros e Manipulação de Memória

Quando declaramos uma variável em Java para tipos primitivos, como `int`, `double` ou `boolean`, não estamos criando explicitamente um ponteiro. Em Java, a declaração de variáveis de tipos primitivos reserva diretamente um espaço de memória para armazenar o valor desse tipo. Por exemplo, ao fazer `int numero = 10;` em Java, `numero` armazenará diretamente o valor inteiro `10`.

Em C++, a situação é similar para variáveis de tipos primitivos. Ao fazer `int numero = 10;` em C++, `numero` também armazena diretamente o valor inteiro `10`.

No entanto, em C++, temos suporte explícito para manipulação de ponteiros. Podemos declarar ponteiros, como `int* ponteiroNumero;`, que reservam um espaço de memória para armazenar o endereço de memória de uma variável do tipo `int`. Esses ponteiros permitem o acesso indireto aos valores por meio dos endereços de memória que armazenam.

Resumidamente, em Java, variáveis de tipos primitivos não são ponteiros; elas armazenam diretamente valores do tipo correspondente. Em C++, embora a declaração de variáveis de tipos primitivos não crie explicitamente ponteiros, a linguagem oferece suporte explícito para manipulação de ponteiros, permitindo acesso indireto aos valores por meio de endereços de memória.
