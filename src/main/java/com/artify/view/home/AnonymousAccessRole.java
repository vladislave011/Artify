package com.artify.view.home;

import io.jmix.security.model.SecurityScope;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.security.role.annotation.SpecificPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "Anonymous Access", code = "anonymous-access", scope = SecurityScope.UI)
public interface AnonymousAccessRole {

    @ViewPolicy(viewIds = "HomeView")
    void accessHomeView();

    // Обычно для UI login тоже разрешается
    @ViewPolicy(viewIds = "LoginView")
    @SpecificPolicy(resources = "ui.loginToUi")
    void accessLogin();
}
