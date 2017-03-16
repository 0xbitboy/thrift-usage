package jc.client.helloworld.thrift.client;

import jc.facade.thrift.helloworld.Helloworld;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSSLTransportFactory;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by liaojiacan on 2017/3/16.
 */
public class HelloworldClientFactory {



    private final static Logger logger = LoggerFactory.getLogger(HelloworldClientFactory.class);

    public static Helloworld.Client createHelloworldClient(String serverHost, int serverPort) throws TTransportException {
            TTransport transport = new TSocket(serverHost, serverPort);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
//            TMultiplexedProtocol mp = new TMultiplexedProtocol(protocol, "APIServer");
            return new Helloworld.Client(protocol);

    }

    /**
     *
     * @param serverHost
     * @param serverPort
     * @param trustStorePath
     * @param trustStorePassword
     * @param clientTimeOut
     * @return
     */
    public static Helloworld.Client createHelloworldSecureClient(String serverHost, int serverPort, String trustStorePath,
                                                             String trustStorePassword, int clientTimeOut)
            throws TTransportException {
            TSSLTransportFactory.TSSLTransportParameters params =
                    new TSSLTransportFactory.TSSLTransportParameters();
            params.setTrustStore(trustStorePath, trustStorePassword);
            TSocket transport = TSSLTransportFactory.getClientSocket(serverHost, serverPort, clientTimeOut, params);
            TProtocol protocol = new TBinaryProtocol(transport);
            return new Helloworld.Client(protocol);
    }

}
