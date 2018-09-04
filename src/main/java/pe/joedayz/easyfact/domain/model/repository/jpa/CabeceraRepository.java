package pe.joedayz.easyfact.domain.model.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pe.joedayz.easyfact.domain.model.entities.Cabecera;

@RepositoryRestResource(collectionResourceRel = "cabecera", path = "cabecera")
public interface CabeceraRepository extends PagingAndSortingRepository<Cabecera, Long> {

	
}
