package com.artify.view.comment;

import com.artify.entity.Comment;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route("comment-detail")
@ViewController(id = "Comment_.detail")
@ViewDescriptor(path = "comment-detail-view.xml")
@EditedEntityContainer("commentDc")
public class CommentDetailView extends StandardDetailView<Comment> {
}