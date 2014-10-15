package gui.console

import static org.viewaframework.util.ComponentFinder.find

import java.awt.event.ActionEvent

import javax.swing.JButton
import javax.swing.JMenuItem
import javax.swing.JTextField
import javax.swing.JPasswordField

import org.viewaframework.swing.DynamicTable
import org.viewaframework.view.ViewContainer
import org.viewaframework.controller.AbstractActionController

class ConsoleClearLogController extends AbstractActionController {

    @Override
    void postHandlingView(ViewContainer view, ActionEvent event) {
        DynamicTable table =
            find(DynamicTable).in(view).named('loggingTable')

        table.model.clear()
    }




}