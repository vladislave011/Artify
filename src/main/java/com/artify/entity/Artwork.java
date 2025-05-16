package com.artify.entity;

import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.Comment;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@JmixEntity
@Table(name = "ARTWORK", indexes = {
        @Index(name = "IDX_ARTWORK_AUTHOR", columnList = "AUTHOR_ID")
})
@Entity
public class Artwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @InstanceName
    @Comment("Название работы")
    @Column(name = "TITLE")
    private String title;

    @Comment("Описание (большой текст)")
    @Lob
    @Column(name = "DESCRIPTION")
    private String description;

    @Comment("Картинка (загрузка файла)")
    @Column(name = "IMAGE", length = 1024)
    private FileRef image;

    @Comment("Связь с User")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHOR_ID")
    private User author;

    @Comment("Дата загрузки")
    @Column(name = "UPLOAD_DATE")
    private LocalDateTime uploadDate;

    @Comment("Цена")
    @Column(name = "PRICE", precision = 19, scale = 2)
    private BigDecimal price;

    // ==== Getters and Setters ====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FileRef getImage() {
        return image;
    }

    public void setImage(FileRef image) {
        this.image = image;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public LocalDateTime getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDateTime uploadDate) {
        this.uploadDate = uploadDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
