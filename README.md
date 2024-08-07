link para o tutorial em pdf : https://docs.google.com/document/d/10OKCvtmh_KZe6kU6e8QnaL20GXmq7O9k5z1rlKglrEE/edit?usp=sharing

Guilherme Ilan Barboza Carvalho
Atividade 1 – Testes Unitários e o Stack Overflow

https://stackoverflow.com/questions/34571/how-do-i-test-a-class-that-has-private-methods-fields-or-inner-classes

How do I test a class that has private methods, fields or inner classes?


Descrevendo o Problema
O problema abordado na pergunta é como testar métodos e campos privados ou classes internas em uma classe Java. Normalmente, métodos privados são escondidos da interface pública de uma classe, e portanto, não são diretamente acessíveis para testes unitários.
Exemplo: Tenho uma classe pessoa e preciso testar o método “saudacao()”.
Na classe de teste não é possível acessar o método “saudacao()” pois é privado.

Solução
Para testar o método privado” saudacao()”, utilizamos reflexão para acessar e invocar o método. A reflexão permite que o código Java inspecione ou modifique a execução de uma aplicação em tempo de execução.

Veja que inicio a classe pessoa com o nome “Guilherme”, e na linha abaixo crio uma reflexão chamada “method” passando o método “saudacao” (que eu quero testar ) e coloco sua acessibilidade como true, tornando ele público naquela reflexão, após isso executo o method.invoke(pessoa) que chama o método getNome na instância pessoa e retorna o resultado, o resultado é armazenado na variável nome e por fim, verificamos se o valor retornado pelo método getNome é igual a "Guilherme".
Essa mesma técnica é possível ser usada para mudar a acessibilidade dos fields como no exemplo abaixo:
Iniciamos a classe como Guilherme e mudamos diretamente o filed para “Gabriel” após mudar sua acessibilidade, depois verificamos o resultado. Essa abordagem permite que você teste métodos e campos privados sem modificar a visibilidade dos mesmos, mantendo o encapsulamento da classe.
Outras respsotas:

A resposta sugerindo testar métodos privados através de métodos públicos, ou reconsiderar o design, não foi a mais votada porque:
A resposta que usa reflexão para testar métodos privados é mais prática e direta, sem necessidade de mudanças no design do código.
Complexidade Real: Em projetos reais, métodos privados podem conter lógica complexa que precisa ser testada separadamente.
Encapsulamento: Usar reflexão respeita o encapsulamento, enquanto tornar métodos privados públicos para testes pode violar este princípio.

Conclusão
A resposta mais votada é preferida por sua aplicabilidade prática e por permitir testes completos sem comprometer os princípios de design do código.

