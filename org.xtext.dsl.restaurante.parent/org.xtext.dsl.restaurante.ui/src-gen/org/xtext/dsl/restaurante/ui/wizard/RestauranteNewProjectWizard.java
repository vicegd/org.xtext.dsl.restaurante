/*
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.restaurante.ui.wizard;

import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;

import org.eclipse.xtext.ui.wizard.IExtendedProjectInfo;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import com.google.inject.Inject;

public class RestauranteNewProjectWizard extends XtextNewProjectWizard {

	private RestauranteWizardNewProjectCreationPage mainPage;

	@Inject
	public RestauranteNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New Restaurante Project");
	}

	protected RestauranteWizardNewProjectCreationPage getMainPage() {
		return mainPage;
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	@Override
	public void addPages() {
		mainPage = createMainPage("basicNewProjectPage");
		mainPage.setTitle("Restaurante Project");
		mainPage.setDescription("Create a new Restaurante project.");
		addPage(mainPage);
	}

	protected RestauranteWizardNewProjectCreationPage createMainPage(String pageName) {
		return new RestauranteWizardNewProjectCreationPage(pageName);
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IExtendedProjectInfo getProjectInfo() {
		RestauranteProjectInfo projectInfo = new RestauranteProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		if (!mainPage.useDefaults()) {
			projectInfo.setLocationPath(mainPage.getLocationPath());
		}
		return projectInfo;
	}

}