package OpenFolder;

import ExtToolsIcons.Icons;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

import java.io.IOException;

public class OpenResources extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        try {
            if (e.getProject() != null) {
                String basePath = e.getProject().getBasePath() + "/app/src/main/res";
                String command = "cmd /c start " + basePath;
                Runtime.getRuntime().exec(command);
            }
        } catch (IOException ignored) {
        }
    }

    @Override
    public void update(AnActionEvent e) {
        e.getPresentation().setIcon(Icons.openFolderResources);
    }
}
