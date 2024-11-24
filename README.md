## Exercícios - Classe e objeto! <img src="https://cdn-icons-png.flaticon.com/512/226/226777.png" alt="Java" width="40" />

- Questão 1:
  - 
- Uma lâmpada exposta em uma loja pode ser representado por:
    - String modelo;
    - int potencia;
    - String tipo;
    - int voltagem;
    - String cor;
    - double preco;
    - boolean emEstoque;

- Questão 4:
  - 
   - No arquivo "Lampada.java"
  
- Questão 7:
  - 
  ```
  class Registro De Eleitor
  {
  /**
  * Declaração dos campos desta classe
  */
  int tituloDeEleitor; // número do título do eleitor
  String nome; // nome do eleitor
  short zonaEleitoral; // número da zona eleitoral
  } // fim da classe
  ```
  - A classe acima possui alguns erros de sintaxe como:
    - O titulo da classe não pode conter espaçamento.
    - É preciso identificar se a classe é publica ou privada. (boa prática)
    - Também não possui identificadores de acesso nos atributos.
    - A classe não possui construtores.
- Questão 8:
  - 
  ```
  class Teste2
  {
  /**
  * Declaração dos campos desta classe
  */
  int num1,num2;
  /**
  * Declaração dos métodos desta classe
  */
  int maior()
  {
  if (num1 > num2)
  return true;
  else return false;
  }
  void menor()
  {
  if (num1 < num2)
  return num1;
  else return num2;
  }
  } // fim da classe
  ```
  - Os erros encontrados foram:
    - A função maior foi declarada para retornar um valor inteiro mas retorna um valor booleano.
    - A função menor foi declarada para não retornar valor, mas está tentando retornar um inteiro.

- Questão 13:
  - 
  - na pasta "ContaBancaria"

- Questão 14:
  - 
  - O encapsulamento oculta os detalhes internos de uma classe e permite o acesso restrito aos seus dados. Aumentando a segurança do código e garantindo que os dados sejam manipulados de forma consistente.
 
### Aluno: César Augusto
### Professor: Francisco Paulo de Freitas 
