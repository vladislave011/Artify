package com.artify.view.comment;

import com.artify.entity.Comment;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route("comment-list")
@ViewController(id = "Comment_.list")
@ViewDescriptor(path = "comment-list-view.xml")
@LookupComponent("commentsDataGrid")
@DialogMode(width = "64em")
public class CommentListView extends StandardListView<Comment> {
}