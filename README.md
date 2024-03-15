# Padroes-de-projeto-criacionais

Padrões de Projeto Criacionais:
    Padrões de projeto criacional são um conjunto de padrões que se concentram na abstração do processo de instanciação de objetos. Eles lidam com os mecanismos de criação de objetos, isolando o sistema de classes concretas, tornando-o mais independente das classes que estão sendo instanciadas. Esses padrões visam promover flexibilidade, reutilização e desacoplamento na criação de objetos.

    "Um padrão que define uma interface para criar um objeto, mas permite as classes decidirem qual classe instanciar. O Factory Method permite a uma classe deferir a uma instanciação para subclasses." - Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides, Group of Four(GOF).

Padrão Factory:
    Define uma interface para criar um objeto, mas permite que as subclasses alterem o tipo de objetos que serão criados.

Padrão Abstract Factory:
    O padrão de projeto Abstract Factory é um padrão de criação que fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. Ele é útil quando você precisa garantir que os objetos criados pertençam a famílias específicas e são projetados para funcionar juntos. O Abstract Factory permite que você crie instâncias de classes relacionadas sem especificar suas classes concretas.

    A ideia principal é fornecer uma interface para criar famílias de objetos, mas deixar as subclasses decidirem quais classes concretas instanciar.

Padrão Singleton
    O padrão Singleton é um padrão de design que garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância. Ele é útil em situações em que você deseja limitar o número de instâncias de uma classe, como quando você precisa de um único objeto compartilhado em toda a sua aplicação.

Padrão Monostate
    O Monostate é um padrão de design que permite que múltiplos objetos compartilhem o mesmo estado interno, mas pareçam ser instâncias independentes para o mundo exterior. Em outras palavras, os objetos do Monostate compartilham o mesmo estado (variáveis de instância), mas cada objeto tem sua própria identidade aparente. Isso pode ser útil em situações em que você deseja que diferentes objetos tenham o mesmo estado, mas não quer criar uma verdadeira instância compartilhada, como no Singleton.