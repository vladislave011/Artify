package com.artify.view.home;

import com.artify.entity.Artwork;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.FileRef;
import io.jmix.flowui.view.*;
import io.jmix.security.model.SecurityScope;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.security.role.annotation.SpecificPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

@Route("")
@ViewController("HomeView")
@ViewDescriptor("home-view.xml") // Имя XML-шаблона должно быть в нижнем регистре, согласно соглашению
public class HomeView extends StandardView {

    @Autowired
    private DataManager dataManager;

    @ViewComponent
    private FlexLayout artworkCards;

    @Subscribe
    public void onInit(InitEvent event) {
        loadArtworks();
    }


    private void loadArtworks() {
        List<Artwork> artworks = dataManager.load(Artwork.class).all().list();
        artworkCards.removeAll();
        for (Artwork artwork : artworks) {
            artworkCards.add(createArtworkCard(artwork));
        }
    }

    private Component createArtworkCard(Artwork artwork) {
        VerticalLayout cardLayout = new VerticalLayout();
        cardLayout.setWidth("280px");
        cardLayout.setSpacing(false);
        cardLayout.setPadding(false);
        cardLayout.getStyle().set("box-shadow", "0 2px 6px rgba(0,0,0,0.15)")
                .set("padding", "12px")
                .set("border-radius", "8px")
                .set("background-color", "white");

        FileRef imageRef = artwork.getImage();
        if (imageRef != null) {
            Image image = new Image();
            image.setWidth("100%");
            image.setHeight("200px");
            image.setSrc("/rest/files" + imageRef.getPath());
            cardLayout.add(image);
        }

        Span title = new Span(artwork.getTitle());
        title.getStyle().set("font-weight", "bold").set("font-size", "1.2em");
        cardLayout.add(title);

        String authorName = artwork.getAuthor() != null ? artwork.getAuthor().getUsername() : "Неизвестно";
        Span author = new Span("Автор: " + authorName);
        cardLayout.add(author);

        BigDecimal priceValue = artwork.getPrice();
        Span price = new Span("Цена: " + (priceValue != null ? priceValue + " ₸" : "Бесплатно"));
        cardLayout.add(price);

        return cardLayout;
    }
}
