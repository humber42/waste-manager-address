# Waste Manager Address Service

### Instrucciones para inicializar este servicio:

- Ejecutar este servicio luego de arrancar el <b>naming-service</b> y <b>cloud-config-server</b>
- Abrir una terminal en la raíz del servicio y ejecutar la siguiente instrucción
 ``mvn spring-boot:run``

### Rutas que expone:
 * Este servicio expone las rutas correspondientes a la gestión de la entidad waste-manager-address:
   1. `GET /address/all` Obtener todos waste manager address
   2. `GET /address/{id}` Obtener un waste manager address por id
   3. `DELETE /address/{id}` Eliminar un waste manager address por id
   4. `POST /address/` Crear un waste manager address
   5. `PUT /address/` Actualizar un waste manager address