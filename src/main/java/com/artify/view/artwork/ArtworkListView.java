package com.artify.view.artwork;

import com.artify.entity.Artwork;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route("artworks")
@ViewController("Artwork.list")
@ViewDescriptor("artwork-list-view.xml")
@LookupComponent("artworksDataGrid")
@DialogMode(width = "64em")
public class ArtworkListView extends StandardListView<Artwork> {
}
