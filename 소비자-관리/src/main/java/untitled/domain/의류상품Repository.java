package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "의류상품", path = "의류상품")
public interface 의류상품Repository
    extends PagingAndSortingRepository<의류상품, String> {}
