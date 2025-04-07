# ContaBanco

O projeto **ContaBanco** é uma aplicação simples em Java que simula a abertura de uma conta bancária. O usuário fornece seu nome, agência e número da conta, e o sistema gera um saldo aleatório para a conta, informando que este saldo já está disponível para saque.

---

## Índice

- [Funcionalidades](#funcionalidades)
- [Pré-requisitos](#pré-requisitos)
- [Como Executar](#como-executar)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Contribuições](#contribuições)
- [Licença](#licença)
- [Contato](#contato)

---

## Funcionalidades

- **Entrada de Dados:** Solicita ao usuário seu nome, agência e número da conta.
- **Geração de Saldo Aleatório:** Utiliza a classe `Random` para gerar um saldo aleatório.
- **Exibição de Mensagem:** Mostra uma mensagem de boas-vindas com as informações inseridas e o saldo gerado.

---

## Pré-requisitos

Para compilar e executar o projeto, você precisa ter instalado:

- **Java JDK** (versão 8 ou superior)

---

## Como Executar

Siga os passos abaixo para compilar e executar o projeto:

1. **Clone o repositório ou baixe os arquivos:**

   ```bash
   git clone https://seu-repositorio-url.git
   ```

2. **Navegue até o diretório do projeto:**

   ```bash
   cd ContaBanco
   ```

3. **Compile o projeto:**

   ```bash
   javac ContaTerminal.java
   ```

4. **Execute a aplicação:**

   ```bash
   java ContaTerminal
   ```

5. **Siga as instruções no terminal:**

   - Digite seu nome.
   - Digite a agência.
   - Digite o número da conta.

   Após informar os dados, a aplicação exibirá uma mensagem de boas-vindas com as informações e o saldo disponível para saque.

