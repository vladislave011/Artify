package com.artify.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "COMMENT_", indexes = {
        @Index(name = "IDX_COMMENT__AUTHOR", columnList = "AUTHOR_ID"),
        @Index(name = "IDX_COMMENT__ARTWORK", columnList = "ARTWORK_ID")
})
@Entity(name = "Comment_")
public class Comment {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @Column(name = "TEXT")
    private String text;
    @JoinColumn(name = "AUTHOR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User author;
    @JoinColumn(name = "ARTWORK_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Artwork artwork;
    @Column(name = "POSTED_AT")
    private LocalDateTime postedAt;

    public LocalDateTime getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(LocalDateTime postedAt) {
        this.postedAt = postedAt;
    }

    public Artwork getArtwork() {
        return artwork;
    }

    public void setArtwork(Artwork artwork) {
        this.artwork = artwork;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}