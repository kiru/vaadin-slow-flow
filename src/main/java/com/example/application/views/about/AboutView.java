package com.example.application.views.about;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "/")
@PageTitle("About")
public class AboutView extends Div {

    public AboutView() {
        add(new Text("Content placeholder"));
    }

}
