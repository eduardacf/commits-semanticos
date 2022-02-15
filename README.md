# EM CONSTRUÇÃO!!!


Conheça a aplicação clicando [aqui.](https://geracao-de-commits.herokuapp.com/swagger-ui.html#/ "aqui.")


<center>
<h2>
Sistema de geração de commits de forma semântica
</h2> 
</center>


###  📱 Endpoints:
##### (Com emojis)

**GET:** `/commits` - Monta a estrutura do commit juntamente com o código do git (git commit ..... )

**GET:** `/commits/comments` - Monta o comentário para o commit.

------------


##### (Sem emojis)
**GET:** `/commits/custom` - Monta a estrutura do commit juntamente com o código do git (git commit ..... ) -

**GET:** `/commits/comments/custom` - Monta o comentário para o commit.

###  📚 Tipo e Descrição
O commit semântico possui os elementos estruturais abaixo (tipos), que informam a intenção do seu commit ao utilizador(a) de seu código.

- `fix` - Commits do tipo fix Essencialmente definem o tratamento de correções de bugs;

- `feat`- Commits do tipo feat Tratam adições de novas funcionalidades ou dequaisquer outras novas implantações ao código;

- `docs` - Commits do tipo docs indicam que houveram mudanças na documentação, como por exemplo no Readme do seu repositório. (Não inclui alterações em código);

- `style` - Commits do tipo style indicam que houveram alterações referentes a formatações de código, semicolons, trailing spaces, lint... (Não inclui alterações em código);

- `refactor` - Commits do tipo refactor Tipo utilizado em quaisquer mudanças que sejam executados no código, porém não alterem a funcionalidade final da tarefa impactada;

- `build` - Commits do tipo build Alterações que afetam o sistema de construção ou dependências externas (escopos de exemplo: gulp, broccoli, npm);

- `test` - Commits do tipo test Adicionando testes ausentes ou corrigindo testes existentes nos processos de testes automatizados (TDD);

- `env` - Commits do tipo env utilizado quando se modifica ou adiciona algum arquivo de CI/CD.Exemplo: modificar um comando do Dockerfile ou adicionar um step a um Jenkinsfile.

- `chore` - Commits do tipo chore indicam atualizações de tarefas de build, configurações de administrador, pacotes... como por exemplo adicionar um pacote no gitignore. (Não inclui alterações em código)

### ☄️ Estrutura de comentário de um commit

     (tipo) : (Descrição)
     [Linha em branco]
     (rodapé opcional)

#### Descrição
- Fornece informações contextuais sobre as alterações no código.

- Use para explicar "o que" e "porque" foi realizado essa modificação, ao invez de "como".

#### Rodapé
- Um rodapé **PODE** ser fornecido depois de uma linha em branco após o corpo.

- Caso exista um ticket no jira, criar um referência assim: **issue TP-666** ou **closes issue TP-666**


###  🔮 Personalizando commits com emojis

Uma outra forma de identificar seus commits é por meio de tipo+ emojis acrescentado. Apesar de não serem uma forma oficial de padronizar seus commits, emojis podem ser muito uteis para indicar de uma forma rápida e bonita as alterações feitas em seu projeto.

Abaixo segue uma lista com emojis e pra que situações eles podem ser utilizados.

### 🚀 Padrões de emojis

| Fix  | 🐛  |
| ------------ | ------------ |
|  Feat | ✨  |
|  Docs | 📝  |
|  Style | 🎨  |
|  Refactor |  🔨 |
|  Build | 🚧  |
|  Test | ✅  |
|  Env | 💥  |
|  Chore | ➕  |

### Dicas para commits:

❌ O que não fazer:

> correcoes feitas

> Aprimorado UI da página de login usando padrão definido no figma e react-responsive-caroussel no carrossel

✅ O que fazer:

> 🐛 bug - Imagens não aparecendo no login corrigido

> 🎨 style - Estilização da página de login

