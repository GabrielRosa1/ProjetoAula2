# 🏬 Sistema de Vendas (POO em Java) - APS 1

Sistema em Java para ler um arquivo **CSV** com vendas de uma loja e gerar **estatísticas gerais**, por **cliente** e por **produto**, aplicando conceitos de **POO**, **List** e **Map**.

---

## ✅ Funcionalidades

### Leitura e armazenamento

* Lê o arquivo `vendas.csv`
* Armazena as vendas em memória (ex: `ArrayList<Venda>`)
* (Opcional) imprime as vendas no console

### 📊 Cálculos gerais

* **Faturamento total da loja** (∑ `quantidade * precoUnitario`)
* **Quantidade total de itens vendidos** (∑ `quantidade`)
* **Valor médio por venda** *(ou por item, dependendo da implementação)*

### 👤 Estatísticas por cliente

* **Cliente que mais gastou**
* **Total gasto por cliente**
* **Quantidade de compras por cliente**

### 📦 Estatísticas por produto

* **Produto mais vendido (em quantidade)**
* **Produto com maior faturamento**
* **Quantidade total vendida por produto**
* **Faturamento total por produto**

---

## 🧱 Modelagem (Classes)

* **Venda**

  * `codigo`, `cliente`, `produto`, `quantidade`, `precoUnitario`, `data`

* **Cliente**

  * `nome`, `totalGasto`, `quantidadeCompras`

* **Produto**

  * `nome`, `totalVendido`, `faturamento`

* **Loja / SistemaVendas**

  * guarda `ArrayList<Venda>` e `HashMap` para clientes/produtos
  * calcula as estatísticas e expõe métodos como:

    * `getFaturamentoTotal()`
    * `getClienteQueMaisGastou()`
    * `getProdutoMaisVendido()`
    * `getProdutoMaiorFaturamento()`

---

## 📂 Estrutura esperada

Coloque o arquivo **`vendas.csv`** na raiz do projeto (ou no caminho configurado no código), com o formato:

```csv
codigoVenda,cliente,produto,quantidade,precoUnitario,data
1,Ana,Notebook,1,3500.00,2024-03-01
2,Bruno,Mouse,2,80.00,2024-03-01
...
```

---

## ▶️ Como executar

1. Abra o projeto no **IntelliJ**
2. Verifique se o arquivo `vendas.csv` está no local correto
3. Rode a classe `Loja`

Saída esperada: relatório no console com os cálculos e estatísticas.

---

## 🧠 Conceitos aplicados

* Leitura de arquivos (CSV)
* Estruturas de dados: `ArrayList` e `HashMap`
* Programação Orientada a Objetos
* Encapsulamento e separação de responsabilidades
* Modelagem de domínio (Venda / Cliente / Produto / Sistema)

---

## 📌 Observações

* O `main` apenas **inicia o sistema** (sem lógica de negócio).
* As estatísticas estão em classes responsáveis (ex: `SistemaVendas`/`Loja`).
* Não ocorreu o uso de IA para desenvolver esse trabalho (apenas para ajudar a escrever o ReadMe).

---
