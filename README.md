# joaoPedro_golenia_VerificadorDeCPF
Autor:João Pedro Golenia
Contato:joao.golenia.pb@compasso.com.br

Este documento refere-se a uma pequena documentação do desafio de verificação de CPF

Task01: Criei uma branch main, uma branch 'dev' que deriva da 'main e uma branch'task01', nela que foram salvas as seguintes alterações:

.......................................................................................................................................................................
Commit feat: Adicionando a estrutura das clases CPF e CPFValidador
Aqui criei o esqueleto do programa, basicamente duas classes a 'CPF' e 'CPFValidador'
A classe 'CPF' será reponsável por armazenar a lista original de CPFs e remover as duplicatas, a classe tem uma lista de String chamada de cpf, um construtor, e um método acessor GetCpfs, já a classe 'CPFValidador' será reponsável por realizar todas as operações de verificação e filtragem, trabalhando com duas listas de String 'cpfsvalidos' , 'cpfsinvalidos':
................................................................................................................................................................................................
Commit feat: Adicionando o método tamanhoCPF
Aqui adicionei na classe 'CPFValidador' um método que faz uma filtragem de CPFs com base em seu tamanho, ele recebe como parametro um objeto do tipo 'CPF' e acessa a lista original de cpfs fornecida pelo usuário, dentro do metodo é feita uma pré filtragem, que retira temporiariamente carcteres especiais e faz a contagem do tamanho do cpf, se for igual a 11, o cpf é salvo na lista de válidos, se não é salvo na lista de inválidos, poderia nesse mesmo método filtrar todos caracteres especiais, mas para seguir o escopo do projeto é feita somente a contagem de carcteres
IMPORTANTE=== Os CPFs salvos na lista de válidos podem conter '.' e '-' a retirada desses carcteres e feita somente para acontagem, portanto na lista de válidos são aceitos formatos semelhantes a esses: '123.456.789-00'  '12345678900' , qualquer outro formato e considerado inválido.
................................................................................................................................................................................................
Commit feat: Adicionando o metodo imprimir
Aqui simplemsmente adicionei na classse 'CPFValidador' um método que percore as duas listas de CPFs, válidos e inválidos, e as imprime no console.
................................................................................................................................................................................................
Commit feat: Adicionando o metodo 'ler' na main
Aqui adicionei na Classe 'main' um método que recebe o caminho de um arquivo .txt e uma lista de String como parâmetro, faz a abertura do arquivo com base no caminho, faz a leitura de todas as linhas do arquivo e salva na lista de String.
................................................................................................................................................................................................
Commit feat: Adicionando entrada de dados e corrigindo o metodo imprimir
Aqui basicamente foi criada a lista de String e a variavel que contem o caminho do arquivo, a chamada do metodo ler, a instancia de um objeto do tipo CPF, a chamada do metodo pra validar por tamanho, e a chamada do metodo imprimir, tudo isso na classe main.
Foi feita uma pequena correção na regra de filtragem do metodo de filtar por tamanho na classe CPFValidador
OBSS o nome do commit posssui um pequeno erro , deveria ser 'feat: Adicionando entrada de dados e corrigindo o metodo tamanhoCPF'.
................................................................................................................................................................................................
                                                                    
Com isso é finalizada a task01 e realizado o merge com a branch dev!!                                   
                                                                    
partindo para a task02( branch 'taks02').                                            
.....................................................................

Commit feat: adicionando metodo 'filtrarNumero' e atualizando listas
Aqui foi criado um método que filtra a lista de válidos, ele retira possíveis letras e caracteres indesejados, permanecem apenas números e os caracteres '.' e '-'.
Os que não atendem a regra são removidos da lista de válidos e inseridos na lista de inválidos.
.......................................................................................................................................................................

Commit feat: adicionando metodo 'removerDuplicatas' na classe CPF
Esse método utiliza a estrutura de dados 'set', mais precisamente o 'LinkedHashSet, para criar uma lista de dados sem duplicatas e mantendo a ordem original dos elementos, então a lista original de CPFs é atualizada e não contem numeros repetidos, as dublicatas são ignoradas.
.......................................................................................................................................................................

Com isso é finalizada a task02 e realizado o merge com a branch dev!!                                   
                                                                    
partindo para a task03( branch 'taks03'). 
......................................................................................
Commit feat: Removendo caracteres 
Aqui adicionei um método que remove os caracteres da lista de validos, deixando somente os números.
deixei pronto no metodo imprimir 2 linhas de codigo que imprimem o cpf formatado, exemplo ao envés de imprimir '12345678900' imprime 123.456.789-00
porém não estou utilizando elas ainda, a fim de mostrar que meu programa está funcionando e removendo corretamente os caracteres.

Commit fix: Corrigindo filtragem de caracteres
Aqui fiz uma pequena alteração onde o metodo de filtragem de caracteres salava os cpfs sem os caractares em uma lista chamada cpfNumerico, mantendo a integridade dos dados originais que não são modificados, e posteriormente serão imprimidos no console.
A lista cpfNumerico vai ser utiliuzada para realizar os calculos de validação, vale lembrar que ela é um espelho da lista original, que contem os dados a serm impressos.















