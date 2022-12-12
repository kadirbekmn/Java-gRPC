package org.example.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.examle.StudentRequest;
import org.examle.StudentResponse;
import org.examle.StudentServceGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Client {
    static Logger logger = LoggerFactory.getLogger(Client.class);
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();

        StudentServceGrpc.StudentServceStub nonBlockingStub = StudentServceGrpc.newStub(managedChannel);

        Scanner scanner = new Scanner(System.in);

        int choice = -1;

        do{
            System.out.println("enter 1 for no streaming, 2 for server steaming, 3 for client streaming and 4 for bidirectional streaming");
            choice = scanner.nextInt();
            switch (choice){
                case 1 :
                    noStreaming(managedChannel);
                    break;
                case 2 :
                    serverSideStreaming(nonBlockingStub);
                    break;
                case 3 :
                    clientSideStreaming(nonBlockingStub);
                    break;
                case 4 :
                    biDirectionalStreaming(nonBlockingStub);
                    break;
            }

        }while (choice != -1);
    }

    private static void biDirectionalStreaming(StudentServceGrpc.StudentServceStub nonBlockingStub) {
        StreamObserver<StudentResponse> studentResponseStreamObserver1 = new StreamObserver<StudentResponse>() {
            @Override
            public void onNext(StudentResponse studentResponse) {
                logger.info("response from the server " + " " + studentResponse.getAge() + " " + studentResponse.getName());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        };


        StreamObserver<StudentRequest> streamObserver1 = nonBlockingStub.biDirectionalStreaming(studentResponseStreamObserver1);

        for(int i=0;i<100;i++){
            streamObserver1.onNext(StudentRequest.newBuilder().build());
        }
        streamObserver1.onCompleted();
    }

    private static void clientSideStreaming(StudentServceGrpc.StudentServceStub nonBlockingStub) {

        StreamObserver<StudentResponse> studentResponseStreamObserver = new StreamObserver<StudentResponse>() {
            @Override
            public void onNext(StudentResponse studentResponse) {
            logger.info("response from the server " + " " + studentResponse.getAge() + " " + studentResponse.getName());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        };

        StreamObserver<StudentRequest> streamObserver = nonBlockingStub.clientSideStreaming(studentResponseStreamObserver);
        for(int i = 0;i<50;i++){
            streamObserver.onNext(StudentRequest.newBuilder().build());
        }
        streamObserver.onCompleted();
    }

    private static void serverSideStreaming(StudentServceGrpc.StudentServceStub nonBlockingStub) {

        nonBlockingStub.serverSideStreaming(StudentRequest.newBuilder().build(), new StreamObserver<StudentResponse>() {
            @Override
            public void onNext(StudentResponse studentResponse) {
                logger.info("response from the server = " + studentResponse.getName() + " " + studentResponse.getAge());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });
    }

    private static void noStreaming(ManagedChannel managedChannel) {
        StudentServceGrpc.StudentServceBlockingStub blockingStub = StudentServceGrpc.newBlockingStub(managedChannel);

        StudentResponse studentResponse = blockingStub.getStudent(StudentRequest.newBuilder().setId(1).build()).next();

        logger.info("response = " + studentResponse.getName() +" " + studentResponse.getAge());
    }
}
