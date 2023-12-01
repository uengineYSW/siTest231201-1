package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "상품관리", path = "상품관리")
public interface 상품관리Repository
    extends PagingAndSortingRepository<상품관리, String> {}
