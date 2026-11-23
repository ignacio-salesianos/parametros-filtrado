- Sin filtros:
  http://localhost:8080/api/v1/productos/search

- Solo por nombre parcial y en minúsculas:
  http://localhost:8080/api/v1/productos/search?nombre=pro

- Solo por nombre con tilde:
  http://localhost:8080/api/v1/productos/search?nombre=portátil

- Solo una marca:
  http://localhost:8080/api/v1/productos/search?marcas=Apple

- Varias marcas separadas por coma:
  http://localhost:8080/api/v1/productos/search?marcas=HP,Lenovo

- Varias marcas repitiendo parámetro:
  http://localhost:8080/api/v1/productos/search?marcas=Logitech&marcas=Apple

- Combinado nombre y marcas:
  http://localhost:8080/api/v1/productos/search?nombre=tablet&marcas=Apple,HP

- Combinado ratones de Apple o Logitech:
  http://localhost:8080/api/v1/productos/search?nombre=ratón&marcas=Apple,Logitech


- Parámetros vacíos:
  http://localhost:8080/api/v1/productos/search?nombre=&marcas=