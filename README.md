# Verificador de Segurança de Senhas

Algoritmo de verificação de senhas baseado no site [Password Meter](http://passwordmeter.com).

Este projeto usa o Maven, por isso, para compilá-lo e subir o servidor (Jetty) basta abrir o terminal e executar os comandos abaixo:

```bash
mvn clean install         # compilar e rodar os testes
mvn jetty:run             # subir o servidor (Jetty) na porta padrão (8080)
```

Para editar o projeto no Eclipse e baixar as dependências para o diretório da IDE, basta executar o comando abaixo:
```bash
mvn eclipse:clean eclipse:eclipse    # configura Eclipse e baixa dependências para o editor
```
