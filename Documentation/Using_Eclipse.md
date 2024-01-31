# Notes on Eclipse

To use the existing projects you must first have your own Workspace created.  For this course a Java workspace will suffice.

Once you have your Workspace you need to import a project:
* File
* Import
	* Tick the copy project if you want to copy it into your workspace
* General
* Existing Projects into Workspace

Then you can start to work.

## Install Plugins

To view this markdown file you will need a markdown viewer.  You can do this as follows:
* Help
* Install New Software
* Find the URL for the plugin at https://marketplace.eclipse.org/
* Either Drag and Drop the Install button into Eclipse windows (the package explorer)
	* or Copy and Paste the URL from the Install button, which if you hover over in the marketplace will tell you
	
## Uninstall Plugins

To remove plugins:

* Help
* About Eclipse
* Installation Details button
* Select the package to uninstall
* Click the Uninstall button

## Installing Git

Git is a useful Source Control Management (SCM) system, also referred to as a Version Control system.  It allows you to work in teams and collaborate on code as well as check previous versions.

An online tutorial for installing the Git plugin for eclipse can be found [https://www.vogella.com/tutorials/EclipseGit/article.html](https://www.vogella.com/tutorials/EclipseGit/article.html)
This link also includes configuring and creating a project with a Git repository.

* Help -> Install New Software
* Type **git** in the **Work with** text box
* Select **EGit P2 Repository - https://download.eclipse.org/egit/updates-6.7**
	* NOTE: The version number may be different
* Tick the **GIT integration for Eclipse**
* Click **Next**
* Click **Next**
* Accept the terms
* Finish to install
* Restart Eclipse when prompted

You will need to configure Git once this is installed.

* Windows -> Preferences
* Expand **Version Control**
* Expand **Git**
* Select **Configure**

If your .gitconfig directory has been found then your credentials may already have been added for Email and name.

### To add project to an existing Git repository

Online solution [https://stackoverflow.com/questions/25515393/how-do-i-add-existing-eclipse-java-project-to-git](https://stackoverflow.com/questions/25515393/how-do-i-add-existing-eclipse-java-project-to-git).

* Right click in the **Package Explorer** area
* Select **Team**
* Select **Share Project...**
* The location of your project and the **.git** folder should already be in the window
	* Check that the **Location** matches your folder for the project
	* Check that the **Repostitory** shows **.git**
* Click **Finish**

Now that your directory is connected to Git you can right click in the Package Explorer and within the Team menu to commit, etc.

Push and Pull can be found under Team -> Repository menu.

With Eclipse Git plugin you have to use **commit** to add to staging and the message.  This will open a window in the bottom area of the screen.