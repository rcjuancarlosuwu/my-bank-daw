package me.rcjuancarlos.mybankdaw.controllers;

import java.util.Collection;
import java.util.Optional;

import me.rcjuancarlos.mybankdaw.models.HolderModel;
import me.rcjuancarlos.mybankdaw.services.HolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
class HolderController {
    @Autowired
    private HolderService holderService;

    @GetMapping("/holder")
    public Collection<HolderModel> findAllHolders() {
        return this.holderService.getAll();
    }

    @GetMapping("/holder/{id}")
    public Optional<HolderModel> findHolderById(@PathVariable Long id) {
        return this.holderService.getHolderById(id);
    }

    @PostMapping("/holder")
    public HolderModel saveHolder(@RequestBody HolderModel holder) {
        return this.holderService.saveHolder(holder);
    }

    @PutMapping("/holder")
    public HolderModel updateHolder(@RequestBody HolderModel holder) {
        return this.holderService.updateHolder(holder);
    }

    @DeleteMapping("/holder/{id}")
    public String deleteHolder(@PathVariable Long id) {
        return this.holderService.deleteHolder(id);
    }
}