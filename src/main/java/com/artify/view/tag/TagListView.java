package com.artify.view.tag;

import com.artify.entity.Tag;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route("tags")
@ViewController(id = "Tag.list")
@ViewDescriptor(path = "tag-list-view.xml")
@LookupComponent("tagsDataGrid")
@DialogMode(width = "64em")
public class TagListView extends StandardListView<Tag> {
}