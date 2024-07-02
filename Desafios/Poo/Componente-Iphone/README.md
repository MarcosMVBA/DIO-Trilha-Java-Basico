
## Desafio Poo

    Adicionei uma classe chamada User, pra poder navegar no sistema "Iphone". 

  




```mermaid
classDiagram

    class ReprodutorMusical{
          
      +SelecionarMusica(String)
      +tocar()
      +Pausar()
      }

    class AparelhoTelefonico{
      +Ligar(String)
      +Atender()
      +Correio()
    }
    class NavegadorInternet{

      +ExibirPagina(String)
      +AdicionarNovapagina()
      +AtualizarPagina()
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
