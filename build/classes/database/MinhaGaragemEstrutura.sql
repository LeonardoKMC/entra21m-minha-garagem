
# Apaga o banco de dados
DROP DATABASE IF EXISTS minha_garagem;

# Criar o banco de dados
CREATE DATABASE IF NOT EXISTS minha_garagem;

# CTRL + ENTER = EXECUTA A LINHA QUE O CURSOR ESTÁ.
# CTRL + SHIFT + ENTER = EXECUTA TODO O CODIGO.

# Seleciona o banco de dados.
USE minha_garagem;
# deleta a tabela se ela existir
DROP TABLE IF EXISTS carros;

# Cria a tabela se ela não existir
CREATE TABLE IF NOT EXISTS carros (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,

    nome VARCHAR(150),
    cor VARCHAR(100),
    fabricante VARCHAR(255),
    placa VARCHAR(8),
    chassi VARCHAR(50),

    quilometragem FLOAT,
    potencia FLOAT,

    data_compra DATE,

    esta_funcionando BOOLEAN,
    permitida_circulacao BOOLEAN,

    quantidade_portas TINYINT,
    quantidade_batidas TINYINT,

    ano_fabricacao SMALLINT,
    ano_lancamento SMALLINT,
    tipo_pneu SMALLINT,

    renavam INT,

    descricao TEXT
);	
