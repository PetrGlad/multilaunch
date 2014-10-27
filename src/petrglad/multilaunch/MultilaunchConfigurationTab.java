package petrglad.multilaunch;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;

public class MultilaunchConfigurationTab extends AbstractLaunchConfigurationTab {

    private final String mode;
    private List configList;
    private Button addButton;
    private Button removeButton;

    public MultilaunchConfigurationTab(String mode) {
        this.mode = mode;
    }

    @Override
    public void createControl(Composite parent) {
        final Composite comp = new Composite(parent, SWT.NONE);
        setControl(comp);
        comp.setLayout(new RowLayout(SWT.VERTICAL));
        comp.setFont(parent.getFont());
        new Label(comp, SWT.NONE).setText("Configurations to launch");
        configList = new List(comp, SWT.BORDER);
        configList.add("first configuration");        
                
        final Composite actions = new Composite(comp, SWT.NONE);
        actions.setLayout(new RowLayout(SWT.HORIZONTAL));
        addButton = new Button(actions, SWT.NONE);
        addButton.setText("Add configuration");
        removeButton = new Button(actions, SWT.NONE);
        removeButton.setText("Remove configuration");
        configList.addSelectionListener(new SelectionListener() {            
            @Override
            public void widgetSelected(SelectionEvent e) {
                System.out.println(e); // DEBUG
            }
            
            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                System.out.println(e); // DEBUG
            }
        });
    }

    @Override
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
    }

    @Override
    public void initializeFrom(ILaunchConfiguration configuration) {
    }

    @Override
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
    }

    @Override
    public String getName() {
        return "Configurations";
    }
}
