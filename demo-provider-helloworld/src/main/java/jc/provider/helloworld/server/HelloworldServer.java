package jc.provider.helloworld.server;

import jc.facade.thrift.helloworld.Helloworld;
import jc.provider.helloworld.thrift.impl.HelloworldImpl;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

/**
 * Created by liaojiacan on 2017/3/16.
 */
public class HelloworldServer {


    public static void main(String[] args) {

        try {
            TServerTransport serverTransport = new TServerSocket(9090);
            Helloworld.Processor processor = new Helloworld.Processor(new HelloworldImpl());
            TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
            // Use this for a multithreaded server
            // TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));
            System.out.println("Starting the simple server...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
