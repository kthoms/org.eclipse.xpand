package mypackage;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class MyExampleSetup {

	private abstract class AbstractPage extends Composite {

		protected Composite content;

		public AbstractPage(Composite parent) {
			super(parent, SWT.NONE);
			setLayout(new GridLayout(1, false));
			content = new Composite(this, SWT.NONE);
			content.setLayoutData(new GridData(GridData.CENTER,
					GridData.CENTER, true, true));
		}

		public abstract String getTitle();

		public void onHide() {
		}

		public void onShow() {
		}
	}

	private interface NextPageOwner {
		public void nextPage();
	}

	private MyExampleSetupOptions options = new MyExampleSetupOptions();

	/** 
	 * The class MyExampleSetupOptions provides easy access to all informations the user
	 * has supplied while execution of the wizard.
	 */
	public class MyExampleSetupOptions {

		/**
		 * Surname
		 */
		public String surname = "";

		/**
		 * Given name
		 */
		public String givenname = "";

		/**
		 * License Code
		 */
		public String licenseCode = "";

		/**
		 * Target Path
		 */
		public String targetPath = "";

		public String toString() {
			StringBuffer buf = new StringBuffer();
			buf.append("MyExampleSetupOptions (\n");
			buf.append("\tSurname = '" + surname + "'\n");
			buf.append("\tGiven name = '" + givenname + "'\n");
			buf.append("\tLicense Code = '" + licenseCode + "'\n");
			buf.append("\tTarget Path = '" + targetPath + "'\n");
			buf.append(")\n");
			return buf.toString();
		}
	}

	public MyExampleSetupOptions getOptions() {
		return options;
	}

	private final WelcomePage welcomePage;

	private class WelcomePage extends AbstractPage implements NextPageOwner {
		public WelcomePage(Composite parent) {
			super(parent);
			content.setLayout(new FillLayout());
			Label welcome = new Label(content, SWT.NONE);
			welcome.setText("Welcome to this little demo application.");
		}

		public String getTitle() {
			return "";
		}

		public void nextPage() {
			activatePage(startPage);
		}
	}

	private final LicenseOptionsPage licensePage;

	private class LicenseOptionsPage extends AbstractPage
			implements
				NextPageOwner {

		private Text surname;
		private Text givenname;
		private Text licenseCode;

		public LicenseOptionsPage(Composite parent) {
			super(parent);
			content.setLayout(new GridLayout(2, false));

			Label surnameLabel = new Label(content, SWT.NONE);
			surnameLabel.setText("Surname");
			surname = new Text(content, SWT.BORDER);
			surname.setLayoutData(new GridData(150, 14));

			Label givennameLabel = new Label(content, SWT.NONE);
			givennameLabel.setText("Given name");
			givenname = new Text(content, SWT.BORDER);
			givenname.setLayoutData(new GridData(150, 14));

			Label licenseCodeLabel = new Label(content, SWT.NONE);
			licenseCodeLabel.setText("License Code");
			licenseCode = new Text(content, SWT.BORDER);
			licenseCode.setLayoutData(new GridData(150, 14));
		}

		public String getTitle() {
			return "Please enter your license code.";
		}

		public void nextPage() {
			activatePage(pathPage);
		}

		public void onHide() {
			options.surname = surname.getText();
			options.givenname = givenname.getText();
			options.licenseCode = licenseCode.getText();
		}

		public void onShow() {
			surname.setText(options.surname);
			givenname.setText(options.givenname);
			licenseCode.setText(options.licenseCode);
		}
	}

	private final PathOptionsPage pathPage;

	private class PathOptionsPage extends AbstractPage implements NextPageOwner {

		private Text targetPath;

		public PathOptionsPage(Composite parent) {
			super(parent);
			content.setLayout(new GridLayout(2, false));

			Label targetPathLabel = new Label(content, SWT.NONE);
			targetPathLabel.setText("Target Path");
			targetPath = new Text(content, SWT.BORDER);
			targetPath.setLayoutData(new GridData(150, 14));
		}

		public String getTitle() {
			return "Please enter the target path on your hard drive.";
		}

		public void nextPage() {
			activatePage(finalPage);
		}

		public void onHide() {
			options.targetPath = targetPath.getText();
		}

		public void onShow() {
			targetPath.setText(options.targetPath);
		}
	}

	private final StartChoicePage startPage;

	private class StartChoicePage extends AbstractPage {

		public StartChoicePage(Composite parent) {
			super(parent);
			content.setLayout(new GridLayout(1, false));

			Button installFullVersionButton = new Button(content, SWT.NONE);
			installFullVersionButton.setText("Install Full Version");
			installFullVersionButton.setLayoutData(new GridData(150, 42));
			installFullVersionButton
					.addSelectionListener(new SelectionAdapter() {
						public void widgetSelected(SelectionEvent e) {
							activatePage(licensePage);
						}
					});

			Button demoVersionButton = new Button(content, SWT.NONE);
			demoVersionButton.setText("Demo Version");
			demoVersionButton.setLayoutData(new GridData(150, 42));
			demoVersionButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					activatePage(pathPage);
				}
			});

			Button cancelDontinstallanythingButton = new Button(content,
					SWT.NONE);
			cancelDontinstallanythingButton
					.setText("Cancel. Don't install anything.");
			cancelDontinstallanythingButton
					.setLayoutData(new GridData(150, 42));
			cancelDontinstallanythingButton
					.addSelectionListener(new SelectionAdapter() {
						public void widgetSelected(SelectionEvent e) {
							activatePage(cancelPage);
						}
					});

		}

		public String getTitle() {
			return "Please choose your preferred version.";
		}
	}

	private final FinalFinalPage finalPage;

	private class FinalFinalPage extends AbstractPage {
		public FinalFinalPage(Composite parent) {
			super(parent);
			content.setLayout(new FillLayout());
			Label welcome = new Label(content, SWT.NONE);
			welcome.setText("Thank you for choosing our product.");
		}

		public String getTitle() {
			return "Done.";
		}

		public void onShow() {
			System.out.println("Submitted Information: " + getOptions());
		}
	}

	private final CancelFinalPage cancelPage;

	private class CancelFinalPage extends AbstractPage {
		public CancelFinalPage(Composite parent) {
			super(parent);
			content.setLayout(new FillLayout());
			Label welcome = new Label(content, SWT.NONE);
			welcome.setText("Please try us again at some point, anyway.");
		}

		public String getTitle() {
			return "Setup Canceled";
		}

		public void onShow() {
			System.out.println("Submitted Information: " + getOptions());
		}
	}

	public static void main(String[] args) {
		MyExampleSetup t = new MyExampleSetup();
		t.run();
	}

	private AbstractPage currentPage;

	private Display display;

	private Button next;

	private Composite pagearea;

	private StackLayout pagestack;

	private Label title;

	private Shell window;

	public MyExampleSetup() {
		display = new Display();
		window = new Shell(display);
		window.setLayout(new GridLayout(1, false));
		window.setText("WizardName");
		title = new Label(window, SWT.NONE);
		title.setText("welcomemessage!!!");
		pagearea = new Composite(window, SWT.NONE);
		pagearea.setBackground(new Color(null, 255, 0, 0));
		pagearea.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
				true));
		pagearea.setLayout(pagestack = new StackLayout());
		next = new Button(window, SWT.NONE);
		next.setText("Next");
		next.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));
		next.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if (currentPage instanceof NextPageOwner)
					((NextPageOwner) currentPage).nextPage();
			}
		});

		welcomePage = new WelcomePage(pagearea);
		licensePage = new LicenseOptionsPage(pagearea);
		pathPage = new PathOptionsPage(pagearea);
		startPage = new StartChoicePage(pagearea);
		finalPage = new FinalFinalPage(pagearea);
		cancelPage = new CancelFinalPage(pagearea);

		activatePage(welcomePage);
		window.pack();
		window.setBounds(new Rectangle(300, 200, 400, 300));
		window.open();
	}

	public void activatePage(AbstractPage page) {
		if (currentPage != null)
			currentPage.onHide();
		pagestack.topControl = page;
		title.setText(page.getTitle());
		next.setEnabled(page instanceof NextPageOwner);
		currentPage = page;
		page.onShow();
		pagearea.layout();
		window.layout();
	}

	public void run() {
		while (!window.isDisposed())
			if (!display.readAndDispatch())
				display.sleep();
		display.dispose();
	}
}
