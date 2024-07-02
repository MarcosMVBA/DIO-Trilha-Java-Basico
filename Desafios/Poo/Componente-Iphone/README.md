```mermaid
classDiagram

    class ReprodutorMusical{
          
      +SelecionarMusica()
      +tocar()
      +Pausar()
      }

    class AparelhoTelefonico{
      +Ligar()
      +Atender()
      +Correio()
    }
    class NavegadorInternet{

      +ExcluirPagina()
      +AdicionarNovapagina()
      +AtualizarPagina()
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
