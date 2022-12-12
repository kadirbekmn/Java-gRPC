package org.example.server;

import io.grpc.stub.StreamObserver;
import org.examle.StudentRequest;
import org.examle.StudentResponse;
import org.examle.StudentServceGrpc;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


@GRpcService
public class Server extends StudentServceGrpc.StudentServceImplBase {

    Logger logger = LoggerFactory.getLogger(Server.class);
    public void getStudent(org.examle.StudentRequest request,
                           io.grpc.stub.StreamObserver<org.examle.StudentResponse> responseObserver) {



        logger.info("got request = " + request.getId());
        StudentResponse studentResponse = StudentResponse.newBuilder().setAge(18).setName("Kadir").build();
        responseObserver.onNext(studentResponse);
        responseObserver.onCompleted();
    }


    /**
     */
    public void serverSideStreaming(org.examle.StudentRequest request,
                                    io.grpc.stub.StreamObserver<org.examle.StudentResponse> responseObserver) {

        logger.info("got the request from client = " + request.getId());
        for (int i = 0; i < 50; i++) {
            StudentResponse studentResponse1 = StudentResponse.newBuilder().setAge(18).setName("Kadir").build();
            responseObserver.onNext(studentResponse1);
        }
        responseObserver.onCompleted();
    }
    /**
     */
    public io.grpc.stub.StreamObserver<org.examle.StudentRequest> clientSideStreaming(
            io.grpc.stub.StreamObserver<org.examle.StudentResponse> responseObserver) {
    logger.info("got the requests");

    var streamobserver = new StreamObserver<StudentRequest>() {
        @Override
        public void onNext(StudentRequest studentRequest) {
        logger.info("request recieved = " + studentRequest.getId());
        }

        @Override
        public void onError(Throwable throwable) {
        logger.error("error occured");
        }

        @Override
        public void onCompleted() {
        responseObserver.onNext(StudentResponse.getDefaultInstance());
        responseObserver.onCompleted();
        logger.info("completed all the requests");
        }
    };

    return streamobserver;
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.examle.StudentRequest> biDirectionalStreaming(
            io.grpc.stub.StreamObserver<org.examle.StudentResponse> responseObserver) {
        var streamObserver = new StreamObserver<StudentRequest>() {
            @Override
            public void onNext(StudentRequest studentRequest) {
                logger.info("request recieved = " + studentRequest.getId());
                responseObserver.onNext(StudentResponse.newBuilder().setName("Kadir").setAge(10).build());
            }

            @Override
            public void onError(Throwable throwable) {
                logger.error("error occured");
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(StudentResponse.getDefaultInstance());
                responseObserver.onCompleted();
                logger.info("completed all the requests");
                logger.info("completed all the requests");
            }
        };
        return streamObserver;
    }

}
