package com.artify.view.user;

import com.artify.entity.User;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route("user-list")
@ViewController(id = "User.list")
@ViewDescriptor(path = "user-list-view.xml")
@LookupComponent("usersDataGrid")
@DialogMode(width = "64em")
public class UserListView extends StandardListView<User> {
}