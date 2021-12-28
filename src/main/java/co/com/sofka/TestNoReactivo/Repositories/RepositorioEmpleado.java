package co.com.sofka.TestNoReactivo.Repositories;

import co.com.sofka.TestNoReactivo.Models.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioEmpleado extends MongoRepository<Empleado, String> {
}
