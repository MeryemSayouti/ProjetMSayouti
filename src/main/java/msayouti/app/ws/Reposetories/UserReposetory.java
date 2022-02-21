package msayouti.app.ws.Reposetories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import msayouti.app.ws.entities.UserEntity;



@Repository

public interface UserReposetory extends PagingAndSortingRepository<UserEntity, Long>{

	@Query("SELECT user FROM UserEntity user")
	Page<UserEntity> findAllUsers(Pageable pageableRequest);
	
	

}
