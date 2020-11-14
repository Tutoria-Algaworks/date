# Date API

![Java CI with Maven](https://github.com/Tutoria-Algaworks/date/workflows/Java%20CI%20with%20Maven/badge.svg?branch=master)

Exemplo de uso da anotação @JsonFormat com pattern de data no formato brasileiro.

Este pequeno projeto consiste em uma POC (Proof of Concept) do uso na anotação @JsonFormat para receber datas no formato "dd/MM/yyyy" em uma REST API construída com SpringBoot.

Existe apenas um endpoint, que atende no path **POST /date** com o seguinte payload:

```json
{
    "date": "26/02/1988"
}
```

O endpoint faz apenas um "System.out", pois seu intuito é mostrar como receber a data no formato desejado. Existem dois [testes integrados](https://github.com/Tutoria-Algaworks/date/blob/master/src/test/java/com/example/date/DateControllerIT.java), uma para o caso de sucesso e outro para o caso de falha.
Eles são executados ao fazer push via github actions. O badge no início desse readme mostra o resultado da execução.
