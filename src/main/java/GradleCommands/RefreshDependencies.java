package GradleCommands;

import ExtToolsIcons.Icons;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

import java.io.IOException;

public class RefreshDependencies extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        try {
            if (e.getProject() != null) {
                String command = "cmd /c gradlew --refresh-dependencies";
                Runtime.getRuntime().exec(command);
            }
        } catch (IOException ignored) {
        }
    }

    @Override
    public void update(AnActionEvent e) {
        e.getPresentation().setIcon(Icons.refreshDependencies);
    }
}
