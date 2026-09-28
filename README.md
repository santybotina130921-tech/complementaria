¿Tuviste que modificar calcularTotalNomina() para incluir a los comerciales?

No, para nada. Como ahí usamos polimorfismo, el ciclo solo recorre la lista de EmpleadoBase y llama a calcularSalarioTotal(). Al crear la clase EmpleadoComercial y sobrescribir ese método, Java solito detecta de qué tipo es cada empleado y calcula el salario que le corresponde sin tener que cambiar esa lógica.

¿Cuántos archivos de la capa modelo modificaste (no creaste)?

Ninguno. Solo creé el archivo nuevo de EmpleadoComercial.java. Las clases que ya estaban en el modelo (EmpleadoBase, EmpleadoAdministrativo y RepositorioEmpleados) no las tuve que tocar para nada. Esto demuestra lo práctico que es trabajar con MVC y el principio Open/Closed, porque pudimos agregar una funcionalidad nueva extendiendo el código sin tirarnos o modificar lo que ya estaba funcionando.
