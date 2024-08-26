Main.java: Este arquivo é o ponto de entrada do programa e demonstra como usar o serviço ProdutoService para exibir produtos. Ele inicia a aplicação e interage com a camada de serviço.

DatabaseConnection.java: Este arquivo é responsável por gerenciar a conexão com o banco de dados usando JDBC. Ele utiliza variáveis de ambiente para obter as informações de conexão, o que é uma prática comum para manter a segurança e a flexibilidade da configuração.

Produto.java: Define a estrutura de dados para o produto. Este modelo é usado para representar os dados recuperados do banco de dados e passá-los entre as camadas da aplicação.

ProdutoRepository.java: Manipula operações de banco de dados, como a consulta de produtos. Ele usa JDBC para conectar-se ao banco de dados e executar a consulta SQL para recuperar todos os produtos. Além disso, é possível adicionar métodos para inserção, atualização e exclusão de produtos.

ProdutoService.java: Contém a lógica de negócios e interage com o ProdutoRepository para realizar operações sobre os produtos. Ele usa o repositório para buscar os produtos e pode incluir outras operações de negócio.