Programa escrito e implementado por
Guilherme Bernardo e Paulo César Pereira Belmont

Descrição: O programa faz perguntas para definir se o cachorro tem nome, se tem dono, etc
A seguir, ele fornece a descrição de cachorros no banco de dados e, se a descrição
inserida pelo cliente bater com alguma do anco de dados, é definida a a raça.
Após isso, a agenda é imprimda e, se o usuário Digitar "s", o programa finaliza,
se digitar "n", o programa executa os métodos do cachorro implementados em DogActions.
A partir da linha 382, podem ser chamados os métodos do cachorro livremente
Os métodos são os seguintes:

objeto: dogeA

showStats   - mostra os status
run         - correr
takeAWalk   - passear
eat         - comer
sleep       - dormir
pee         - urinar
poo         - defecar
accident    - sofrer um acidente
becomeSick  - ficar doente
latir       - latir

O cachorro tem status: fome(hunger), ânimo(humour),
vontade de urinar ou defecar(bladder) e energia(energy)
Estes variam de 0 a 10

Ao invocar o showStats, é informado o status do cachorro
os métodos alteram esses status (ex:run tira 4 de energia e aumenta o bladder, mas aumenta
o ânimo do cachorro)