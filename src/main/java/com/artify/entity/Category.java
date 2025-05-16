package com.artify.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "CATEGORY", indexes = {
        @Index(name = "IDX_CATEGORY_ARTWORKS", columnList = "ARTWORKS_ID")
})
@Entity
public class Category {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @InstanceName
    @Column(name = "NAME")
    private String name;
    @JoinColumn(name = "ARTWORKS_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Artwork artworks;

    public Artwork getArtworks() {
        return artworks;
    }

    public void setArtworks(Artwork artworks) {
        this.artworks = artworks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}