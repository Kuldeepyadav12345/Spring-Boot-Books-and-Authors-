package com.example.demo.repsoitory;

import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.DefaultCrudMethods;
import org.springframework.stereotype.Repository;

@Repository
public class AutorRepository extends DefaultCrudMethods {

	public AutorRepository(RepositoryMetadata metadata) {
		super(metadata);
		// TODO Auto-generated constructor stub
	}

}
