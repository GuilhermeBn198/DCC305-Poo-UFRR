 
    TALVEZ SEJA MELHOR CRIAR UM STATIC Q INCREMENTA NO CONSTRUTOR PRA 
    ACRIAR X INDICES DE VETOR DE CHAR
    
    GUILHERME, LEIA ISSO KKKKKKKKKK

    O main cria os objetos dessa classe, q vai se comportar 
    como thread por herdar Thread, a classe Thread já é default do java.lang, ent n precisa import
    Aq tem um construtor q já cria a thread pra cada obj criado no main (os 3 ratos)
    O construtor seta o nome e recebe o mapa(checar) e seta isFree=false pq o rato
    tá preso

    O método run é a tarefa da thread em si, todo objeto =que 
    estiver nessa classe thread vai executar a thread dentro de run
    Resumindo: criando um rato da classe Passo, ele faz o q tá em run

    TEMOS QUE
    COPIAR A MATRIZ LABIRINTO PRA CADA OBJ TER A SUA
    SINCRONIZAR AS THREADS PROS LABIRINTOS N SE SOBREPOREM
    IMPLEMENTAR OS PASSOS DE CADA RATO
    