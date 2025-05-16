package com.artify.view.artwork;

import com.artify.entity.Artwork;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route("artworks/:id")
@ViewController("Artwork.detail")
@ViewDescriptor("artwork-detail-view.xml")
@EditedEntityContainer("artworkDc")
public class ArtworkDetailView extends StandardDetailView<Artwork> {
}
