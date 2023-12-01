package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "서비스운영",
    path = "서비스운영"
)
public interface 서비스운영Repository
    extends PagingAndSortingRepository<서비스운영, String> {}
