
CREATE TABLE produto (
                nome VARCHAR(30) PRIMARY KEY,
                preco FLOAT NOT NULL,
                quantidade INTEGER NOT NULL,
                tipo VARCHAR(30) NOT NULL
);


CREATE TABLE componentes (
                id SERIAL PRIMARY KEY,
                senha_pedido INTEGER NOT NULL,
                nome_componente VARCHAR(30) NOT NULL
                
);


CREATE TABLE pedido (
		id SERIAL PRIMARY KEY,
                senha_pedido INTEGER NOT NULL,
                preco FLOAT NOT NULL
);

insert into produto(nome, preco, quantidade, tipo)
values('Mate', 4, 20, 'bebida');
insert into produto(nome, preco, quantidade, tipo)
values('Suco de uva', 5, 20, 'bebida');
insert into produto(nome, preco, quantidade, tipo)
values('Suco de Laranja', 5, 20, 'bebida');
insert into produto(nome, preco, quantidade, tipo)
values('Coca-cola', 4, 20, 'bebida');
insert into produto(nome, preco, quantidade, tipo)
values('Ice tea', 4, 20, 'bebida');

insert into produto(nome, preco, quantidade, tipo)
values('Bolonhesa', 0, 30, 'molho');
insert into produto(nome, preco, quantidade, tipo)
values('4 queijos', 4, 30, 'molho');
insert into produto(nome, preco, quantidade, tipo)
values('Sugo', 4, 30, 'molho');
insert into produto(nome, preco, quantidade, tipo)
values('Branco', 4, 30, 'molho');
insert into produto(nome, preco, quantidade, tipo)
values('Funghi', 4, 30, 'molho');

insert into produto(nome, preco, quantidade, tipo)
values('Lasanha', 25, 30, 'favorito');
insert into produto(nome, preco, quantidade, tipo)
values('Penne a Matriciana', 25, 30, 'favorito');
insert into produto(nome, preco, quantidade, tipo)
values('Penne a Carbonara', 15, 30, 'promocao');
insert into produto(nome, preco, quantidade, tipo)
values('Spaghetti alho e óleo', 15, 30, 'promocao');

insert into produto(nome, preco, quantidade, tipo)
values('Almôndega', 6, 35, 'extra');
insert into produto(nome, preco, quantidade, tipo)
values('Frango à Parmegiana', 7, 35, 'extra');
insert into produto(nome, preco, quantidade, tipo)
values('Frango Dourado', 5, 35, 'extra');
insert into produto(nome, preco, quantidade, tipo)
values('Peito de Peru', 4, 35, 'extra');
insert into produto(nome, preco, quantidade, tipo)
values('Polpetone', 8, 35, 'extra');

insert into produto(nome, preco, quantidade, tipo)
values('Alcaparra', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Alho', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Alho Poró', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Azeitona Preta', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Bacon', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Brócolis', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Camarão', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Carne de Sol', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Cenoura', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Champignon', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Cebola', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Ervilha', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Frango', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Gorgonzola', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Linguiça Calabresa', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Milho', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Ovo de Codorna', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Palmito', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Passas', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Peru', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Queijo Coalho', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Queijo Minas', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Salmão', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Tomate', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Tomate Seco', 0, 100, 'ingrediente');
insert into produto(nome, preco, quantidade, tipo)
values('Mussarela', 0, 100, 'ingrediente');


insert into produto(nome, preco, quantidade, tipo)
values('Farfalle', 18, 100, 'massa');
insert into produto(nome, preco, quantidade, tipo)
values('Fettuccine', 18, 100, 'massa');
insert into produto(nome, preco, quantidade, tipo)
values('Spaghetti', 17, 100, 'massa');
insert into produto(nome, preco, quantidade, tipo)
values('Penne', 17, 100, 'massa');
insert into produto(nome, preco, quantidade, tipo)
values('Ravioli de Queijo com Presunto', 24, 100, 'massa');
insert into produto(nome, preco, quantidade, tipo)
values('Ravioli de Ricota', 22, 100, 'massa');
insert into produto(nome, preco, quantidade, tipo)
values('Ravioli de Tomate Seco', 24, 100, 'massa');
insert into produto(nome, preco, quantidade, tipo)
values('Ravioli de Gorgonzola', 25, 100, 'massa');
insert into produto(nome, preco, quantidade, tipo)
values('Gnocchi', 20, 100, 'massa');
insert into produto(nome, preco, quantidade, tipo)
values('Cappelletti de Carne', 20, 100, 'massa');
insert into produto(nome, preco, quantidade, tipo)
values('Cappelletti de Frango', 20, 100, 'massa');

INSERT INTO componentes(senha_pedido, nome_componente) VALUES(1, 'Cappelletti de Frango');
INSERT INTO pedido(senha_pedido, preco) VALUES(1,34.0);
select * from componentes, pedido;