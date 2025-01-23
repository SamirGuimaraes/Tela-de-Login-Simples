# Login Application - README

## Sobre o Projeto

Este projeto consiste em uma aplicação gráfica simples de login criada com **Java Swing**. A interface permite que o usuário insira um nome de usuário e uma senha, e oferece as seguintes funcionalidades:

1. Verificar se os campos de login foram preenchidos.
2. Exibir mensagens ao usuário através de caixas de diálogo personalizadas.
3. Permitir o reinício do processo de cadastro ou a saída do programa dependendo da interação do usuário.

## Funcionalidades

### Tela Principal
- **Campos de texto:**
  - `Usuário`: Campo para inserir o nome de usuário.
  - `Senha`: Campo para inserir a senha (caracteres mascarados).
- **Botões:**
  - `Cadastrar`: Valida as informações inseridas e exibe mensagens de acordo com o preenchimento dos campos.
  - `Limpar`: Limpa os campos de texto, permitindo que o usuário reinicie a inserção de dados.

### Fluxo de Operações
#### Botão "Cadastrar"
1. **Verificação de Campos:**
   - Se os campos **Usuário** ou **Senha** estiverem vazios, será exibida uma caixa de diálogo com a mensagem: "Usuário ou Senha incompleto".
     - Opções disponíveis:
       - **Cadastrar Novamente:** Reabre a janela de login.
       - **Sair:** Fecha a aplicação.
   
2. **Cadastro Completo:**
   - Se os campos estiverem preenchidos, será exibida uma caixa de diálogo com a mensagem: "Cadastro completo".
     - Opções disponíveis:
       - **Cadastrar Novamente:** Reabre a janela de login.
       - **Sair:** Fecha a aplicação.

#### Botão "Limpar"
- Limpa os campos de entrada (**Usuário** e **Senha**) para que o usuário possa inserir novos dados.

## Estrutura do Código

### Classe `Login`
A classe principal que herda de `JFrame` e contém a interface gráfica e lógica do programa.

#### Componentes Gráficos
- **Labels:**
  - `lbUsuario`: Exibe o texto "Usuário".
  - `lbSenha`: Exibe o texto "Senha".
  - `lbMensagemTopo`: Mensagem inicial informando o que deve ser feito.

- **Campos de Entrada:**
  - `tfUsuario`: Campo de texto para o nome do usuário.
  - `jpSenha`: Campo de senha mascarado.

- **Botões:**
  - `jbCadastro`: Botão para realizar a validação e o cadastro.
  - `jbLimpar`: Botão para limpar os campos de entrada.

- **Painéis:**
  - `panelUsuario`: Contém o rótulo e o campo de entrada do usuário.
  - `panelSenha`: Contém o rótulo e o campo de entrada da senha.
  - `panelBotoes`: Contém os botões de ação.
  - `panelDados`: Agrupa os painéis de entrada e a mensagem superior.
  - `panelPrincipal`: Painel principal que organiza todos os elementos.

#### Lógica do Programa
A lógica principal está nos eventos dos botões:

1. **Botão `jbCadastro`:**
   - Verifica se os campos estão vazios:
     - Se **vazios**:
       - Exibe uma caixa de diálogo (`JOptionPane.showOptionDialog`) com as opções "Cadastrar Novamente" e "Sair".
       - Dependendo da escolha do usuário:
         - **Cadastrar Novamente:** Cria uma nova instância da classe `Login`.
         - **Sair:** Encerra a aplicação.
     - Se **preenchidos**:
       - Exibe uma caixa de diálogo confirmando o cadastro completo e as mesmas opções ("Cadastrar Novamente" ou "Sair").

2. **Botão `jbLimpar`:**
   - Reseta os campos de entrada, limpando o texto inserido.

#### Configurações da Janela
- Título da Janela: `Login`.
- Tamanho da Janela: 400x350 pixels.
- Centralização da janela na tela: `setLocationRelativeTo(null)`.
- Comportamento ao fechar: `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)`.