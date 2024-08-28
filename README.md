# joaoPedro_golenia_VerificadorDeCPF

**Autor:** João Pedro Golenia  
**Contato:** joaopedrogolenia@Gmail.com

Este documento descreve o desenvolvimento do projeto de verificação de CPF.

## Descrição do Projeto

O objetivo deste projeto é criar um sistema de verificação de CPF utilizando a linguagem C#. O sistema foi desenvolvido em várias etapas, cada uma registrada com commits específicos em uma branch de desenvolvimento.

## Task01: Estrutura Inicial do Projeto

- **Criação das Branches:** Foram criadas as branches `main`, `dev`, e `task01`. A branch `task01` foi usada para o desenvolvimento das funcionalidades iniciais.

- **Commit `feat: Adicionando a estrutura das classes CPF e CPFValidador`:**  
  Criação das classes `CPF` e `CPFValidador`. A classe `CPF` gerencia a lista original de CPFs, removendo duplicatas. A classe `CPFValidador` é responsável pelas operações de verificação e filtragem de CPFs.

- **Commit `feat: Adicionando o método tamanhoCPF`:**  
  Implementação do método `tamanhoCPF` na classe `CPFValidador`, que filtra os CPFs baseando-se em seu tamanho. CPFs válidos são salvos em uma lista, e inválidos em outra.

- **Commit `feat: Adicionando o método imprimir`:**  
  Adição de um método que percorre e imprime as listas de CPFs válidos e inválidos.

- **Commit `feat: Adicionando o método 'ler' na main`:**  
  Implementação de um método na classe `main` para ler um arquivo `.txt` e salvar os CPFs em uma lista.

- **Commit `feat: Adicionando entrada de dados e corrigindo o método imprimir`:**  
  Criação da lógica principal para leitura de dados, validação por tamanho, e impressão dos resultados. Correção na lógica de filtragem de CPFs.

Task01 foi concluída com sucesso e a branch `task01` foi mesclada na branch `dev`.

## Task02: Filtragem e Remoção de Duplicatas

- **Commit `feat: adicionando método 'filtrarNumero' e atualizando listas`:**  
  Implementação de um método para filtrar os CPFs válidos, removendo caracteres indesejados, deixando apenas números, pontos e hífens.

- **Commit `feat: adicionando método 'removerDuplicatas' na classe CPF`:**  
  Criação de um método para remover duplicatas da lista de CPFs utilizando a estrutura de dados `LinkedHashSet`, mantendo a ordem original.

Task02 foi concluída com sucesso e a branch `task02` foi mesclada na branch `dev`.

## Task03: Refinamento da Filtragem e Validação

- **Commit `feat: Removendo caracteres`:**  
  Implementação de um método que remove todos os caracteres, exceto números, dos CPFs válidos. Deixou-se preparado o código para formatação futura dos CPFs.

- **Commit `fix: Corrigindo filtragem de caracteres`:**  
  Ajuste na filtragem para salvar CPFs numéricos em uma lista separada, preservando os dados originais para futuras validações.

- **Commit `fix: Corrigindo remoção de duplicatas`:**  
  Correção na lógica de remoção de duplicatas, trocando a estrutura de dados para `Map` para garantir a integridade dos dados e a ordem dos elementos.

- **Commit `fix: Atualizando para remoção de duplicatas com 'HashSet'`:**  
  Após análise, foi decidido retornar ao uso de `HashSet` para melhor eficiência na remoção de duplicatas.

Task03 foi concluída com sucesso e as melhorias foram integradas na branch `dev`.

## Agradecimentos

Agradeço à equipe 07 (Guardiões do GitHub) pelo apoio e ideias durante o desenvolvimento deste projeto. Também houve uma cooperação significativa com o bolsista Murilo Mazur, com quem troquei ideias para a evolução de nossos projetos.
