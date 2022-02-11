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

###  🔮 Personalizando commits com emojis

Uma outra forma de identificar seus commits é por meio de emojis. Apesar de não serem uma forma oficial de padronizar seus commits, emojis podem ser muito uteis para indicar de uma forma rápida e bonita as alterações feitas em seu projeto.

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



