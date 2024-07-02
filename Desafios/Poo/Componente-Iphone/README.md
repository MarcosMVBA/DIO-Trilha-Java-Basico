```mermaid
classDiagram
    Iphone <|-- Reprodutor
    Iphone <|-- Telefone
    Iphone <|-- Navegador

    
   

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
'''
