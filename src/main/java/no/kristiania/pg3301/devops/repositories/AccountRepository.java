package no.kristiania.pg3301.devops.repositories;

import no.kristiania.pg3301.devops.entities.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.List;

@RepositoryRestController
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {

    List<Account> findByPersonalNumber(@Param("pn") String name);
}
