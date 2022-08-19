package me.rcjuancarlos.mybankdaw.repositories;
import me.rcjuancarlos.mybankdaw.models.HolderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolderRepository extends JpaRepository<HolderModel,Long> {
}
