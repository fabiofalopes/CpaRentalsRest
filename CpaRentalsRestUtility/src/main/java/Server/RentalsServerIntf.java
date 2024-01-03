package Server;

import java.rmi.*;

public interface RentalsServerIntf extends Remote{
    String testRMI() throws RemoteException;
    String listAllMethods() throws RemoteException;
    int reservaSombrinha(int horario, String data, String idPraia, int id_sombrinha) throws RemoteException;
    int cancelaReserva(int horario, String data , String idPraia, int idSombrinha) throws RemoteException;
    int cancelaReserva(int idReserva) throws RemoteException;
    String listaSombrinhasDisponiveis(int horario, String data, String idPraia) throws RemoteException;
    String getReservasTable() throws RemoteException;
    String getTabelaOcupacaoDia(String data, String idPraia) throws RemoteException;
}

