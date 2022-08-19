package me.rcjuancarlos.mybankdaw.repositories;
import me.rcjuancarlos.mybankdaw.models.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountModel,Long> {
}
