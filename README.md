En este repositorio se encuentra la taréa de instaDAM propuesta por el profesor Igor Lorenzo Girardín, esta consta de diferentes partes:

--Clase Main: en la que se implementará la interfaz visual del programa utilizando Joptionpane para que funcione a base de botones y gestión de eventos,

  llamando a los metodos de la clase InstaDAM
  
--Clase InstaDAM: clase en la que se implementan los metodos abstractos de la clase menuInstaDAM, en la que se llama a los constructores y metodos de 

  las respectivas clases para realizar las diferentes operaciones.
  
--Interfaz menuInstaDAM: esta interfaz contiene cuatro métodos abstractos,

  1-regtistrarse: que llama a un metodo de la clase registro para iniciar el proceso
  
  2-hacerPublicacion:llama al metodo de la clase Publicaciones para comenzar el proceso de subir una publicación
  
  3-iniciarSesion:llama a la clase usuario para que se establezca uno de los usuarios com el usuario en uso actual
  
  4-ver publicacion:llama a la clase Publicaciones para visualizar las publicaciones realizadas hasta ahora
  
--Clase Publicaciones: contiene toda la informació y metodos sobre las publicaciones, asi como metodos para subirlas o eliminarlas

--Clase Registro: permite crear uno o varios usuarios nuevos

--Clase usuario:permite ver la información sobre un usuario y establecer uno como predeterminado

