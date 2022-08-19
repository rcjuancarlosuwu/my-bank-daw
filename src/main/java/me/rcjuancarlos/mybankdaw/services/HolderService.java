package me.rcjuancarlos.mybankdaw.services;

import java.util.Collection;
import java.util.Optional;

import me.rcjuancarlos.mybankdaw.models.HolderModel;
import me.rcjuancarlos.mybankdaw.repositories.HolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HolderService {
    @Autowired
    private HolderRepository holderRepository;

    public Optional<HolderModel> getHolderById(Long userId) {
        return this.holderRepository.findById(userId);
    }

    public Collection<HolderModel> getAll(){
        return this.holderRepository.findAll();
    }

    public HolderModel saveHolder(HolderModel user) {
        return this.holderRepository.save(user);
    }

    public HolderModel updateHolder(HolderModel user) {
        return this.holderRepository.save(user);
    }

    public String deleteHolder(Long userId) {
        this.holderRepository.deleteById(userId);
        return "User has been deleted!";
    }
}
