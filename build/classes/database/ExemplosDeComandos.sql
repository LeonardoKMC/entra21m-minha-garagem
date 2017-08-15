# retorna TODOS os registros da tabela com TODAS as colunas.
SELECT * FROM carros;

# Retona TODOS os registros com APENAS as colunas informadas.
SELECT nome, fabricante, cor  FROM carros;

# Pode estipular como a coluna vai ser apresentada (apelido ou ALIAS) colocando o nome depois de AS e entre ''
SELECT nome AS 'Modelo', fabricante AS 'Marca', cor AS 'Cor', quantidade_portas AS 'Quantidade de Portas'  FROM carros;

# Retorna a quantidade de registros
SELECT COUNT(*) FROM carros;

# Exemplo INSERT na tabela informando as colunas desejadas.
INSERT INTO carros 
(id, nome, cor, fabricante, placa, chassi, quilometragem, potencia, data_compra, esta_funcionando, Permitida_circulacao, quantidade_portas, quantidade_batidas, ano_fabricacao, ano_lancamento, tipo_pneu, renavam, descricao)
VALUE
(1, "Gol", "Azul Bebê", "VW", "ABC-2000", 
"2ab578roadf6546",  32165498, 85, '2017-08-07', 
true, false, 4, 0, 2017, 2016, 175,879654654, "");

# Inserir na tabela de carros um registro com somente alguns campos(colunas).
INSERT INTO carros 
(nome, cor, fabricante, potencia, data_compra)
VALUE
("Palio", "Rosa Choque", "Fiat", 65, '2013-04-29');

# Limpa a tabela
TRUNCATE carros;
SELECT * FROM carros;

# Exemplo de insert
INSERT INTO carros(fabricante, cor, nome)
VALUES
("VW", "Cinza", "Golf"),
("VW", "Vermelho", "Jetta"),
("VW", "Preto", "Saveiro"),
("VW", "Pink", "New Beetle"),
("VW", "Azul", "Fusca"),
("VW", "Verde", "Novo Fusca"),
("VW", "Cinza", "Up"),
("VW", "Lilas", "Kombi"),
("VW", "Cobalto", "Bora"),
("VW", "Vermelho", "Passat");

# Exemplos de Select apresentadndo determinadas linhas (delimitador de informação)
SELECT id, nome, quantidade_batidas FROM carros
WHERE id> 4;

SELECT id, nome, quantidade_batidas FROM carros
WHERE id>= 4;

SELECT id, nome, quantidade_batidas FROM carros
WHERE id< 4;

SELECT id, nome, quantidade_batidas FROM carros
WHERE id<= 4;

SELECT id, nome, quantidade_batidas FROM carros
WHERE id<> 4;

# Ordenando os itens da coluna por ordem alfabética
SELECT nome, fabricante, cor FROM carros ORDER BY fabricante ASC, nome ASC, cor ASC;

# Faz a contagem dos itens especificados
SELECT cor, COUNT(cor) FROM carros
GROUP BY cor
ORDER BY COUNT(cor) DESC