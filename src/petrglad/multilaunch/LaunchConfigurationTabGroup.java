package petrglad.multilaunch;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class LaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {

    public LaunchConfigurationTabGroup() {
    }

    @Override
    public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        setTabs(new AbstractLaunchConfigurationTab[]{new MultilaunchConfigurationTab(mode)});
    }    
}
