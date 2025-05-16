package com.artify.view.tag;

import com.artify.entity.Tag;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route("tag")
@ViewController(id = "Tag.detail")
@ViewDescriptor(path = "tag-detail-view.xml")
@EditedEntityContainer("tagDc")
public class TagDetailView extends StandardDetailView<Tag> {
}