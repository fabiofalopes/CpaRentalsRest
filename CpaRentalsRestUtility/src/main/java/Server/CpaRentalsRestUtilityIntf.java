package Server;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public interface CpaRentalsRestUtilityIntf {
    String initConnection( String ip_address) throws MalformedURLException, RemoteException, NotBoundException;
    String testRMI(int idUser) throws MalformedURLException, RemoteException, NotBoundException;
    String getAvailableSombrinhas(int idUser,int horario,String data,String idPraia) throws MalformedURLException, RemoteException, NotBoundException;
    String makeReservation(int idUser,int horario,String data,String idPraia,int id_sombrinha);
    String cancelReserva(int idUser,int idReserva);
    String getReservasTable(int idUser);
    boolean verifyDateFormat(String date);
    String getDailyOcupationTable(int idUser, String data, String idPraia);
    String verifyFileExistence(String fileName);
    void loadUsers();
    void saveUsers();
    boolean userExists(int userId);
    int login(String username, String password);
    int registerUser(String username, String password);
    String getReservationById(int userId);
    String getReservationsByUserId(int userId);
    String addReservation(int userId, int reservationId);
    String cancelReservation(int reservationId);
    boolean reservationExists(int reservationId);
}


