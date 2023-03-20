package com.example.application.views.onlineexam;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("end page")
@Route(value = "/hello")
public class lastpg extends VerticalLayout{
    private Button button;
    private H1 h1;
    private H1 name;
    private H1 enroll;
    private H1 sub;
    private H1 score;
    private Dialog dialog;
    lastpg(){
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        Button button = new Button("View score");
        H1 h1 = new H1("Your test has been submitted successfully.");
        h1.getStyle().set("font-size","20px");
        add(h1, button);

        Dialog dialog = new Dialog();
        dialog.setHeaderTitle("Score");
        H1 name = new H1("Name");
        name.getStyle().set("font-size","20px");
        dialog.add(name);

        H1 enroll = new H1("Enrollment no.");
        enroll.getStyle().set("font-size","20px");
        dialog.add(enroll);

        H1 sub = new H1("Subject");
        sub.getStyle().set("font-size","20px");
        dialog.add(sub);

        H1 score = new H1("Score");
        score.getStyle().set("font-size","20px");
        dialog.add(score);

        Button closer = new Button("Close", event -> dialog.close());
        Element dialogElement = dialog.getElement();
        dialogElement.getStyle().set("text-align", "right");

        dialog.add(closer);
        button.addClickListener(event -> dialog.open());

        add(h1,button);
    }
}