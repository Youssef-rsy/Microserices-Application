package com.local.ysf.Readers;

import java.util.UUID;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

@Repository
public interface ReadersRepository extends JpaRepository<Readers, UUID>{

}
/*@RepositoryRestResource(collectionResourceRel = "read", path = "read")
public interface ReadersRepository extends PagingAndSortingRepository<Readers, UUID>{

}*/
