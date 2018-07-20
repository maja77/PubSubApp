package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Pub/Sup App");
        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();

//        Publisher publisher1 = new Publisher();
//        Publisher publisher2 = new Publisher();
//
//        Subscriber subscriber1 = new Subscriber();
//        Subscriber subscriber12 = new Subscriber();
//
//        Server subPubServer = new Server();
//
//        subPubServer.subscribers[0] = subscriber1;
//        subPubServer.subscribers[1] = subscriber12;
//
//        Message oneMsg = new Message();
//        oneMsg.msgTopic = "one";
//        oneMsg.msgText = " One is first";
//
//        Message twoMsg = new Message();
//        twoMsg.msgTopic = "two";
//        twoMsg.msgText = " Two is second";
//
//        publisher1.sendMessage(oneMsg, subPubServer);
//        publisher2.sendMessage(oneMsg, subPubServer);
//        publisher2.sendMessage(twoMsg, subPubServer);
//        publisher2.sendMessage(twoMsg, subPubServer);
//
//        subscriber1.listen("one", 0);
//
//        subscriber12.listen("one", 0);
//        subscriber12.listen("two", 1);
//
//        subPubServer.subscribers[0] = subscriber1;
//        subPubServer.subscribers[1] = subscriber12;
//
//        subPubServer.forward();
//
//        System.out.println("Subscriber 1 got below messages: ");
//        subscriber1.print();
//        System.out.println("Subscriber 12 got below messages: ");
//        subscriber12.print();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
