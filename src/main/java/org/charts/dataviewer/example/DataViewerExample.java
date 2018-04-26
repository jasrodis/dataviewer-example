package org.charts.dataviewer.example;

import org.charts.dataviewer.example.factory.DataViewerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataViewerExample {

	private static final Logger log = LoggerFactory.getLogger(DataViewerExample.class);

	public static void main(String[] args) throws InterruptedException {
		log.info("DataViewerExample started!");
		test();
	}

	private static void test() throws InterruptedException {

		DataViewerFactory.createDataViewerExample1(); // http://localhost:8090/view/example1
		DataViewerFactory.createDataViewerExample2(); // http://localhost:8090/view/example2
		DataViewerFactory.createDataViewerExample3(); // http://localhost:8090/view/example3
		DataViewerFactory.createDataViewerExample4(); // http://localhost:8090/view/example4
		DataViewerFactory.createDataViewerExample5(); // http://localhost:8090/view/example5
		DataViewerFactory.createDataViewerExample6(); // http://localhost:8090/view/example6
		DataViewerFactory.createDataViewerExample7(); // http://localhost:8090/view/example7
		DataViewerFactory.createDataViewerExample8(); // http://localhost:8090/view/example8
		DataViewerFactory.createDataViewerExample9(); // http://localhost:8090/view/example9

		// http://localhost:8090/view/updateExample
		// DataViewerFactory.createDataViewerUpdateExample();

		Thread.currentThread().join();
	}

}
