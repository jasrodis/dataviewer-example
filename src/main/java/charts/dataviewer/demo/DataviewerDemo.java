package charts.dataviewer.demo;

import org.charts.dataviewer.DataViewer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import charts.dataviewer.factory.DataViewerFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

@SuppressWarnings("unused")
public class DataviewerDemo extends Application {

	private static final Logger log = LoggerFactory.getLogger(DataviewerDemo.class.getName());

	private final String PROJECT_TITLE = "DataViewer Demo";
	private final int WINDOW_WIDTH = 1024;
	private final int WINDOW_HEIGHT = 768;

	public static void main(String[] args) throws Exception {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		log.info("DataviewerDemo Started");

		/**********************************************
		 * Change the test
		 **********************************************/
		test1();
		// test2();
		// test3();
		/**********************************************/

		Scene mainScene = new Scene(new HBox());
		stage.setScene(mainScene);
		stage.setTitle(PROJECT_TITLE);
		stage.setHeight(WINDOW_HEIGHT);
		stage.setWidth(WINDOW_WIDTH);
		stage.setOnCloseRequest(e -> closeApplication());
		stage.show();
	}

	private void closeApplication() {

		log.info("Exiting...");
		System.exit(0);
	}

	private void test1() {
		DataViewer dv = DataViewerFactory.createDataViewerExample1();
		log.info("The url is : [{}]", dv.getUrl());

		// DataViewerFactory.createDataViewerExample2();
		// DataViewerFactory.createDataViewerExample3();
		// DataViewerFactory.createDataViewerExample4();
		// DataViewerFactory.createDataViewerExample5();
		// DataViewerFactory.createDataViewerExample6();

	}

	private void test2() {
		DataViewerFactory.createDataViewerTuneExample(1);
		DataViewerFactory.createDataViewerTuneExample(2);
		DataViewerFactory.createDataViewerTuneExample(3);
		DataViewerFactory.createDataViewerTuneExample(4);

	}

	private void test3() {
		DataViewerFactory.createDataViewerExample7();
		DataViewerFactory.createDataViewerExample8();
		DataViewerFactory.createDataViewerExample9();
	}

	// private HBox test1() {
	// VBox vboxLeft = new VBox();
	// vboxLeft.getChildren().add(DataViewerFactory.createDataViewerExample1());
	// vboxLeft.getChildren().add(DataViewerFactory.createDataViewerExample2());
	// VBox vboxMiddle = new VBox();
	// vboxMiddle.getChildren().add(DataViewerFactory.createDataViewerExample3());
	// vboxMiddle.getChildren().add(DataViewerFactory.createDataViewerExample4());
	// VBox vboxRight = new VBox();
	// vboxRight.getChildren().add(DataViewerFactory.createDataViewerExample5());
	// vboxRight.getChildren().add(DataViewerFactory.createDataViewerExample6());
	//
	// HBox hbox = new HBox();
	// hbox.getChildren().addAll(vboxLeft, vboxMiddle, vboxRight);
	// return hbox;
	// }
	//
	// private HBox test2() {
	// VBox vboxLeft = new VBox();
	// vboxLeft.getChildren().add(DataViewerFactory.createDataViewerTuneExample(1));
	// vboxLeft.getChildren().add(DataViewerFactory.createDataViewerTuneExample(2));
	// VBox vboxRight = new VBox();
	// vboxRight.getChildren().add(DataViewerFactory.createDataViewerTuneExample(3));
	// vboxRight.getChildren().add(DataViewerFactory.createDataViewerTuneExample(4));
	//
	// HBox hbox = new HBox();
	// hbox.getChildren().addAll(vboxLeft, vboxRight);
	// return hbox;
	// }
	//
	// private HBox test3() {
	// VBox vboxLeft = new VBox();
	// vboxLeft.getChildren().add(DataViewerFactory.createDataViewerExample7());
	// VBox vboxMiddle = new VBox();
	// vboxMiddle.getChildren().add(DataViewerFactory.createDataViewerExample8());
	// VBox vboxRight = new VBox();
	// vboxRight.getChildren().add(DataViewerFactory.createDataViewerExample9());
	//
	// HBox hbox = new HBox();
	// hbox.getChildren().addAll(vboxLeft, vboxMiddle, vboxRight);
	// return hbox;
	// }

}
