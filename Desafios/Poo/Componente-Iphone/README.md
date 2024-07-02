```mermaid
classDiagram

    class Reprodutor{
          
      +SelecionarMusica()
      +tocar()
      +Pausar()
      }

    class Telefone{
      +Ligar()
      +Atender()
      +Correio()
    }
    class Navegador{

      +ExcluirPagina()
      +AdicionarNovapagina()
      +AtualizarPagina()
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
