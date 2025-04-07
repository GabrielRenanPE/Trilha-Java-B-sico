ContaBanco
O projeto ContaBanco é uma aplicação simples em Java que simula a abertura de uma conta bancária. O usuário fornece seu nome, agência e número da conta, e o sistema gera um saldo aleatório para a conta, informando que este saldo já está disponível para saque.

Índice
Funcionalidades

Pré-requisitos

Como Executar

Estrutura do Projeto

Contribuições

Licença

Contato

Funcionalidades
Entrada de Dados: Solicita ao usuário seu nome, agência e número da conta.

Geração de Saldo Aleatório: Utiliza a classe Random para gerar um saldo aleatório.

Exibição de Mensagem: Mostra uma mensagem de boas-vindas com as informações inseridas e o saldo gerado.

Pré-requisitos
Para compilar e executar o projeto, você precisa ter instalado:

Java JDK (versão 8 ou superior)

Como Executar
Siga os passos abaixo para compilar e executar o projeto:

Clone o repositório ou baixe os arquivos:

bash
Copy
Edit
git clone https://seu-repositorio-url.git
Navegue até o diretório do projeto:

bash
Copy
Edit
cd ContaBanco
Compile o projeto:

bash
Copy
Edit
javac ContaTerminal.java
Execute a aplicação:

bash
Copy
Edit
java ContaTerminal
Siga as instruções no terminal:

Digite seu nome.

Digite a agência.

Digite o número da conta.

Após informar os dados, a aplicação exibirá uma mensagem de boas-vindas com as informações e o saldo disponível para saque.

Estrutura do Projeto
Copy
Edit
ContaBanco/
├── ContaTerminal.java
└── README.md
ContaTerminal.java: Arquivo principal contendo a implementação da lógica da conta bancária.

README.md: Este arquivo de documentação.

