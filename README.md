# 🧹 Java Predicate: Filtrando Produtos com Expressão Funcional

Este projeto Java demonstra o uso da **interface funcional `Predicate`** para filtrar elementos de uma lista com base em uma condição. 
Utilizando o método `removeIf`, o programa remove da lista todos os produtos cujo preço seja maior ou igual a 100.0.

## 📦 Estrutura do Projeto

### ✅ `Product` (`entities.Product`)
Classe simples que representa um produto com:
- `name` → Nome do produto
- `preco` → Preço do produto
- 

- Inclui construtores, getters/setters e sobrescrita de `toString()` para exibição formatada.

- ### ✅ `productPredicate` (`util.productPredicate`)
Classe que implementa a interface `Predicate<Product>`.  
Define a **condição de remoção**: retorna `true` se o preço for **maior ou igual a 100.0**.


✅ Program (app.Program)

Classe principal que:

    Cria uma lista de produtos.

    Aplica list.removeIf(new productPredicate()) para filtrar os produtos.

    Imprime no console os produtos que não foram removidos (preço < 100.0).
    

💻 Exemplo de Saída

Product [name=Mouse, preco=50.0]
Product [name=HD Case, preco=80.9]

    Produtos como "TV" e "Notebook" foram removidos por terem preço >= 100.0.
    

🛠️ Como Executar

    Compile o projeto:

javac app/*.java entities/*.java util/*.java

    Execute:

java app.Program


📚 Conceitos Demonstrados

    Interface funcional Predicate<T>

    Programação funcional em Java (removeIf)

    Encapsulamento e uso de listas (List<Product>)

    Organização em pacotes (app, entities, util)
    

👩‍💻 Autora

Daniela Alineri
Projeto voltado para prática de funções lambda e interfaces funcionais no Java moderno.


---



